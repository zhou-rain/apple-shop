package com.qmall.apple.sale.util;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * @author: zhouR
 * @date: Create in 2019/12/16 - 11:49
 * @function: beanlist 转成 entitylist
 */
public interface TransformBean<B, E> {

	/**
	 * 实体类相互转化  左边转化到右边
	 * @param b
	 * @param e
	 * @return
	 */
	default E ChangeBean(B b, E e) {
		try {
			Class<?> bClass = b.getClass();//bean类对象
			Class<?> eClass = e.getClass(); //entity类对象
			// 获取对象属性
			Field[] fields = bClass.getDeclaredFields();
			for (Field field : fields) {
				String fieldName = field.getName();//tid
				String upperChar = fieldName.substring(0, 1).toUpperCase();//T
				String anotherStr = fieldName.substring(1);//id
				String methodName = "get" + upperChar + anotherStr;//getTid
				Method method = bClass.getMethod(methodName);
				method.setAccessible(true);		//暴力反射
				Object resultValue = method.invoke(b);//2

				//System.out.println(fieldName + ": " + resultValue);  //tid: 2

				//获取当前参数的类型
				Class<?> type = bClass.getDeclaredField(fieldName).getType();
				//获取当前参数的set方法
				Method eMethod = eClass.getMethod("set" + upperChar + anotherStr,type);
				eMethod.setAccessible(true);
				//System.out.println("eMethod = " + eMethod);

				//执行set方法，赋值
				eMethod.invoke(e,resultValue);

			}
		} catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException | NoSuchFieldException e1) {
			e1.printStackTrace();
		}
		return e;
	}


	/**
	 * 两个实体类集合之间的相互转化
	 * @param b
	 * @return
	 */
/*
	default List<E> ChangeBeanList(List<B> b) {

		List<E> list= new ArrayList<>();

		E e = new E();

		for (B b1 : b) {

			E e1 = ChangeBean(b1, e);

			list.add(e1);

		}

		return list;

	}
*/


}
