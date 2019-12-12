package com.qmall.apple.commons;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: zhouR
 * @date: Create in 2019/12/12 - 15:27
 * @function: 集合工具类
 */
public class ArrayUtil {

	public static List<Integer> StringToIntegerArray(String ids){
		List<Integer> list = new ArrayList<>();
		String[] split = ids.split(",");
		for (String s : split) {
			list.add(Integer.parseInt(s));
		}
		return list;

	}

}
