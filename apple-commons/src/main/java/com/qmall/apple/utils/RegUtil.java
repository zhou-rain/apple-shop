package com.qmall.apple.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author: zhouR
 * @date: Create in 2019/12/27 - 19:09
 * @function: 正则验证类
 */
public class RegUtil {

	/**
	 * 验证邮箱
	 * @param email
	 * @return
	 */
	public static boolean checkEmail(String email){
		boolean flag = false;
		try{
			String check = "^([a-z0-9A-Z]+[-|_|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$";
			Pattern regex = Pattern.compile(check);
			Matcher matcher = regex.matcher(email);
			flag = matcher.matches();
		}catch(Exception e){
			flag = false;
		}
		return flag;
	}

	/**
	 * 验证手机号码
	 * @param mobile
	 * @return
	 */
	public static boolean checkMobileNumber(String mobile){
		boolean flag = false;
		try{
			Pattern regex = Pattern.compile("^(((13[0-9])|(15([0-3]|[5-9]))|(18[0,5-9]))\\d{8})|(0\\d{2}-\\d{8})|(0\\d{3}-\\d{7})$");
			Matcher matcher = regex.matcher(mobile);
			flag = matcher.matches();
		}catch(Exception e){
			flag = false;
		}
		return flag;
	}


}
