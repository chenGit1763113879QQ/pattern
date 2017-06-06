/**
 *ProxyPatternDemo.java
 * Administrator
 *2017年6月6日下午2:17:08
 *
 */
package com.designpattern.a013ProxyPattern;

/**
 * @author 陈中强
 * @Time  2017年6月6日 下午2:17:08
 */
public class ProxyPatternDemo {

	/**
	 *  @param args
	 *  @author 陈中强-chen
	 *  @Time  2017年6月6日 下午2:17:08
	 */
	public static void main(String[] args) {
		Image image = new ProxyImage("test_10mb.jpg");

		 //图像将从磁盘加载
	      image.display(); 
	      System.out.println("");
	      //图像将无法从磁盘加载
	      image.display(); 	
	      
	}

}
