/**
 *SingleObject.java
 * Administrator
 *2017��6��5������11:49:33
 *
 */
package com.designpattern.a003SingletonPattern;

/**
 * @author ����ǿ
 * @Time  2017��6��5�� ����11:49:33
 */
public class SingleObject {
	

	//���� singleObject��һ������
	private static SingleObject instance = new SingleObject();
	
	//�ù��캯�� Ϊ private ��������Ͳ��ᱻʵ����
	private SingleObject(){};
	
	//��ȡΨһ���õĶ��� 
	public static SingleObject getInstance(){
		return instance;
	}
	
	public void showMessage(){
		System.out.println("Hello word!");
	}

	
}
