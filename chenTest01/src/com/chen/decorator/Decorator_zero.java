/**
 *Decorator_zero.java
 * Administrator
 *2017��3��31������4:44:52
 *
 */
package com.chen.decorator;

/**
 * @author ����ǿ
 * @Time  2017��3��31�� ����4:44:52
 */
//���涨������װ�Σ����ǵ�һ�����ڶ�����������������ϸ������װ���ߵĹ���Խ��Խ��
public class Decorator_zero extends Decorator {

	public Decorator_zero(Human human) {
		super(human);
	}

	public void goHome() {
		System.out.println("�����ӡ���");
	}

	public void findMap() {
		System.out.println("�鷿����Map����");
	}
	@Override
	public void wearClothes() {
		// TODO Auto-generated method stub
		super.wearClothes();
		goHome();
	}

	@Override
	public void walkToWhere() {
		// TODO Auto-generated method stub
		super.walkToWhere();
		findMap();
	}
}