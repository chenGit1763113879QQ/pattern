/**
 *Decorator.java
 * Administrator
 *2017年3月31日下午4:43:47
 *
 */
package com.chen.decorator;

/**
 * @author 陈中强
 * @Time  2017年3月31日 下午4:43:47
 */
//定义装饰者
public abstract class Decorator implements Human {
	private Human human;

	public Decorator(Human human) {
		this.human = human;
	}

	public void wearClothes() {
		human.wearClothes();
	}

	public void walkToWhere() {
		human.walkToWhere();
	}
}
