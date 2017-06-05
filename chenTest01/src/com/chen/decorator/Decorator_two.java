/**
 *Decorator_two.java
 * Administrator
 *2017年3月31日下午4:46:36
 *
 */
package com.chen.decorator;

/**
 * @author 陈中强
 * @Time  2017年3月31日 下午4:46:36
 */
public class Decorator_two extends Decorator {

	public Decorator_two(Human human) {
		super(human);
	}

	public void findClothes() {
		System.out.println("找到一件D&G。。");
	}

	public void findTheTarget() {
		System.out.println("在Map上找到神秘花园和城堡。。");
	}

	@Override
	public void wearClothes() {
		// TODO Auto-generated method stub
		super.wearClothes();
		findClothes();
	}

	@Override
	public void walkToWhere() {
		// TODO Auto-generated method stub
		super.walkToWhere();
		findTheTarget();
	}
}
