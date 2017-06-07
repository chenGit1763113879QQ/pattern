/**
 *Singleton.java
 * Administrator
 *2017��6��5������1:37:13
 *
 */
package com.designpattern.a003SingletonPattern;

/**
 * @author ����ǿ
 * @Time  2017��6��5�� ����1:37:13
 */
public class Singleton {
	
//	private static Singleton instance;
	private Singleton(){};
	
	/**
	 * ����ʽ���̰߳�ȫ
	 * �Ƿ� Lazy ��ʼ������
	 * �Ƿ���̰߳�ȫ����
	 * ʵ���Ѷȣ���
	 * ���������ַ�ʽ�߱��ܺõ� lazy loading���ܹ��ڶ��߳��кܺõĹ��������ǣ�Ч�ʺܵͣ�99% ����²���Ҫͬ����
	 * �ŵ㣺��һ�ε��òų�ʼ���������ڴ��˷ѡ�
	 * ȱ�㣺������� synchronized ���ܱ�֤��������������Ӱ��Ч�ʡ�
	 * getInstance() �����ܶ�Ӧ�ó����Ǻܹؼ����÷���ʹ�ò�̫Ƶ����
	 *  @return
	 *  @author ����ǿ-chen
	 *  @Time  2017��6��5�� ����1:40:33
	 */
//	public static synchronized  Singleton getInstance(){
//		if(instance == null){
//			instance = new Singleton();
//		}
//		return instance;
//	}
	
	
/*	4��˫����/˫��У������DCL���� double-checked locking��

	JDK �汾��JDK1.5 ��

	�Ƿ� Lazy ��ʼ������

	�Ƿ���̰߳�ȫ����

	ʵ���Ѷȣ��ϸ���

	���������ַ�ʽ����˫�����ƣ���ȫ���ڶ��߳�������ܱ��ָ����ܡ�
	getInstance() �����ܶ�Ӧ�ó���ܹؼ���*/
	private volatile static Singleton singleton;
	public static Singleton getSingleton(){
		if(singleton == null ){
			synchronized (Singleton.class){
				if(singleton == null){
					singleton = new Singleton();
				}
			}
		}
		return singleton;
	}
	

}
