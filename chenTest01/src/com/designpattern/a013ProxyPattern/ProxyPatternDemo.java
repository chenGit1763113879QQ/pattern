/**
 *ProxyPatternDemo.java
 * Administrator
 *2017��6��6������2:17:08
 *
 */
package com.designpattern.a013ProxyPattern;

/**
 * @author ����ǿ
 * @Time  2017��6��6�� ����2:17:08
 */
public class ProxyPatternDemo {

	/**
	 *  @param args
	 *  @author ����ǿ-chen
	 *  @Time  2017��6��6�� ����2:17:08
	 */
	public static void main(String[] args) {
		Image image = new ProxyImage("test_10mb.jpg");

		 //ͼ�񽫴Ӵ��̼���
	      image.display(); 
	      System.out.println("");
	      //ͼ���޷��Ӵ��̼���
	      image.display(); 	
	      
	}

}
