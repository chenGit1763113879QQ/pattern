/**
 *SingletonPatternDemo.java
 * Administrator
 *2017年6月5日上午11:55:05
 *
 */
package com.designpattern.a003SingletonPattern;

/**
 * @author 陈中强
 * @Time  2017年6月5日 上午11:55:05
 */
public class SingletonPatternDemo {

	/**
	 *  @param args
	 *  @author 陈中强-chen
	 *  @Time  2017年6月5日 上午11:55:05
	 */
	public static void main(String[] args) {
		
		/**
		 * 不合法的构造函数
		 * 编译时报错 ：构造函数 singleObject() 是不可见的
		 */
//		SingleObject object = new SingleObject();
		
		
	
		//获取唯一可用的对象
		SingleObject object = SingleObject.getInstance();
		
		//显示消息
		object.showMessage();

	}

}
