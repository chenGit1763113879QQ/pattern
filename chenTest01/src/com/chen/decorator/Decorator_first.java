/**
 *Decorator_first.java
 * Administrator
 *2017��3��31������4:46:04
 *
 */
package com.chen.decorator;

/**
 * @author ����ǿ
 * @Time  2017��3��31�� ����4:46:04
 */
public class Decorator_first extends Decorator {

	public Decorator_first(Human human) {
		super(human);
	}

	public void goClothespress() {
		System.out.println("ȥ�¹����ҿ�����");
	}

	public void findPlaceOnMap() {
		System.out.println("��Map�����ҡ���");
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
