package com.qmall.apple.commons;

import java.util.Map;

public class WebUtil {
	
	/**
	 * 获取参数的值
	 * @param param	map集合
	 * @param getparam	需要获取的参数
	 * @param defaultStr	设置默认值
	 * @return
	 */
	public static String getParam(Map<String, Object> param,String getparam,String defaultStr) {
		Object obj = param.get(getparam);
		obj = Validator.isEmpty(obj) ? defaultStr : obj;
		return obj.toString();
	}
	/**
	 *
	 * @param param  map集合
	 * @param getparam 需要获取的参数
	 * @return
	 */
	public static String getParam(Map<String, Object> param,String getparam) {
		Object obj = param.get(getparam);
		obj = Validator.isEmpty(obj) ? "" : obj;
		return obj.toString();
	}

	/**
	 * 获取int类型的map值
	 * @param param
	 * @param getparam
	 * @return
	 */
	public static Integer getIntParam(Map<String, Object> param,String getparam) {
		Object obj = param.get(getparam);
		obj = Validator.isEmpty(obj) ? "" : obj;
		return Integer.parseInt(obj.toString());
	}

	/**
	 * 获取int类型的map值
	 * @param param	map集合
	 * @param getparam	需要获取的参数
	 * @param defaultStr	设置默认值
	 * @return
	 */
	public static Integer getIntParam(Map<String, Object> param,String getparam,int defaultStr) {
		Object obj = param.get(getparam);
		obj = Validator.isEmpty(obj) ? defaultStr : obj;
		return Integer.parseInt(obj.toString());
	}

}
