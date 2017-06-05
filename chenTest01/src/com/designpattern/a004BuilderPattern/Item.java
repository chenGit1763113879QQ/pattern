/**
 *Item.java
 * Administrator
 *2017年6月5日下午5:18:10
 *
 */
package com.designpattern.a004BuilderPattern;

/**
 * 创建一个表示食物条目和食物包装的接口。
 * @author 陈中强
 * @Time  2017年6月5日 下午5:18:10
 */
public interface Item {
	
	   public String name();
	   public Packing packing();
	   public float price();	
}
