/**
 *Person.java
 * Administrator
 *2017年3月31日下午4:47:00
 *
 */
package com.chen.decorator;

/**
 * @author 陈中强
 * @Time  2017年3月31日 下午4:47:00
 */
//定义被装饰者，被装饰者初始状态有些自己的装饰
public class Person implements Human {

	@Override
	public void wearClothes() {
		// TODO Auto-generated method stub
		System.out.println("穿什么呢。。");
	}

	@Override
	public void walkToWhere() {
		// TODO Auto-generated method stub
		System.out.println("去哪里呢。。");
	}
}
