/**
 *PrototypePatternDemo.java
 * Administrator
 *2017年6月5日下午9:13:13
 *
 */
package com.designpattern.a005PrototypePattern;

/**
 * PrototypePatternDemo 使用 ShapeCache 类来获取存储在 Hashtable 中的形状的克隆。
 * @author 陈中强
 * @Time  2017年6月5日 下午9:13:13
 */
public class PrototypePatternDemo {

	/**
	 *  @param args
	 *  @author 陈中强-chen
	 *  @Time  2017年6月5日 下午9:13:13
	 */
	public static void main(String[] args) {
		
		ShapeCache.loadCache();
		
		Shape cloneShape = ShapeCache.getShape("1");
		System.out.println("Shape:"+ cloneShape.getType());
		
		Shape cloneShape2 = ShapeCache.getShape("2");
		System.out.println("Shape:"+ cloneShape2.getType());
		
		Shape cloneShape3 = ShapeCache.getShape("3");
		System.out.println("Shape:"+ cloneShape3.getType());

	}

}
