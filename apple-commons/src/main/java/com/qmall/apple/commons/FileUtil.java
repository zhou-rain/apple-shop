package com.qmall.apple.commons;

import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.UUID;

/**
 * @author: zhouR
 * @date: Create in 2019/12/20 - 10:05
 * @function:
 */
public class FileUtil {

	/**
	 * 文件上传
	 * @param up_file  上传的文件
	 * @param request	请求
	 * @param storagePath	将要保存的地址   "/images"
	 * @return	返回保存的相对服务器文件地址
	 */
	public static String fileUpLoad(MultipartFile up_file, HttpServletRequest request, String storagePath){
		String imgpath="";
		//上传文件存在
		if(up_file.getSize()>0) {
			//完成文件上传
			//获取服务上的上传文件的真实路径
			String realPath = request.getServletContext().getRealPath(storagePath);
			//创建文件夹
			File file=new File(realPath);
			if(!file.exists()) {
				file.mkdir();
			}
			//获取真实的上传文件名
			String originalFilename = up_file.getOriginalFilename();
			//在服务器真实的上传文件路径下创建一个空的文件
			originalFilename = UUID.randomUUID().toString().replaceAll("-","").substring(0,10)+"_file_"+originalFilename;
			File ufile=new File(file, originalFilename);
			//上传
			try {
				up_file.transferTo(ufile);
			} catch (IOException e) {
				e.printStackTrace();
				return null;
			}
			//将上传文件的网络路 径记录到user中
			imgpath=request.getContextPath()+storagePath+"/"+originalFilename;
		}

		return imgpath;
	}

}
