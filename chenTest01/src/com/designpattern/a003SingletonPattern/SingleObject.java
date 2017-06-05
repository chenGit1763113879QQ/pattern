/**
 *SingleObject.java
 * Administrator
 *2017年6月5日上午11:49:33
 *
 */
package com.designpattern.a003SingletonPattern;

/**
 * @author 陈中强
 * @Time  2017年6月5日 上午11:49:33
 */
public class SingleObject {
	

	//创建 singleObject的一个对象
	private static SingleObject instance = new SingleObject();
	
	//让构造函数 为 private 这样该类就不会被实例化
	private SingleObject(){};
	
	//获取唯一可用的对象 
	public static SingleObject getInstance(){
		return instance;
	}
	
	public void showMessage(){
		System.out.println("Hello word!");
	}

	
}
