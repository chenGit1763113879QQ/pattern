/**
 *Test.java
 * Administrator
 *2017年3月31日下午4:47:37
 *
 */
package com.chen.decorator;

/**
 * @author 陈中强
 * @Time  2017年3月31日 下午4:47:37
 */
//测试类，看一下你就会发现，跟java的I/O操作有多么相似
public class Test {
	public static void main(String[] args) {
		Human person = new Person();
		Decorator decorator = new Decorator_two(new Decorator_first(
				new Decorator_zero(person)));
		decorator.wearClothes();
		decorator.walkToWhere();
	}
}