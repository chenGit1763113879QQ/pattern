/**
 *SingletonPatternDemo.java
 * Administrator
 *2017��6��5������11:55:05
 *
 */
package com.designpattern.a003SingletonPattern;

/**
 * @author ����ǿ
 * @Time  2017��6��5�� ����11:55:05
 */
public class SingletonPatternDemo {

	/**
	 *  @param args
	 *  @author ����ǿ-chen
	 *  @Time  2017��6��5�� ����11:55:05
	 */
	public static void main(String[] args) {
		
		/**
		 * ���Ϸ��Ĺ��캯��
		 * ����ʱ���� �����캯�� singleObject() �ǲ��ɼ���
		 */
//		SingleObject object = new SingleObject();
		
		
	
		//��ȡΨһ���õĶ���
		SingleObject object = SingleObject.getInstance();
		
		//��ʾ��Ϣ
		object.showMessage();

	}

}
