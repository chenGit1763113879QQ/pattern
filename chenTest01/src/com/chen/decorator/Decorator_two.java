/**
 *Decorator_two.java
 * Administrator
 *2017��3��31������4:46:36
 *
 */
package com.chen.decorator;

/**
 * @author ����ǿ
 * @Time  2017��3��31�� ����4:46:36
 */
public class Decorator_two extends Decorator {

	public Decorator_two(Human human) {
		super(human);
	}

	public void findClothes() {
		System.out.println("�ҵ�һ��D&G����");
	}

	public void findTheTarget() {
		System.out.println("��Map���ҵ����ػ�԰�ͳǱ�����");
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
