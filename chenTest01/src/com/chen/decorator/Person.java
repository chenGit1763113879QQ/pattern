/**
 *Person.java
 * Administrator
 *2017��3��31������4:47:00
 *
 */
package com.chen.decorator;

/**
 * @author ����ǿ
 * @Time  2017��3��31�� ����4:47:00
 */
//���屻װ���ߣ���װ���߳�ʼ״̬��Щ�Լ���װ��
public class Person implements Human {

	@Override
	public void wearClothes() {
		// TODO Auto-generated method stub
		System.out.println("��ʲô�ء���");
	}

	@Override
	public void walkToWhere() {
		// TODO Auto-generated method stub
		System.out.println("ȥ�����ء���");
	}
}
