/**
 *Decorator_first.java
 * Administrator
 *2017年3月31日下午4:46:04
 *
 */
package com.chen.decorator;

/**
 * @author 陈中强
 * @Time  2017年3月31日 下午4:46:04
 */
public class Decorator_first extends Decorator {

	public Decorator_first(Human human) {
		super(human);
	}

	public void goClothespress() {
		System.out.println("去衣柜找找看。。");
	}

	public void findPlaceOnMap() {
		System.out.println("在Map上找找。。");
	}

	@Override
	public void wearClothes() {
		// TODO Auto-generated method stub
		super.wearClothes();
		goClothespress();
	}

	@Override
	public void walkToWhere() {
		// TODO Auto-generated method stub
		super.walkToWhere();
		findPlaceOnMap();
	}
}
