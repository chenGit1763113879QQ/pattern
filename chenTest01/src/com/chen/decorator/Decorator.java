/**
 *Decorator.java
 * Administrator
 *2017��3��31������4:43:47
 *
 */
package com.chen.decorator;

/**
 * @author ����ǿ
 * @Time  2017��3��31�� ����4:43:47
 */
//����װ����
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
