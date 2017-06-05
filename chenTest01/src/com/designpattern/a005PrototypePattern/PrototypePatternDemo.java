/**
 *PrototypePatternDemo.java
 * Administrator
 *2017��6��5������9:13:13
 *
 */
package com.designpattern.a005PrototypePattern;

/**
 * PrototypePatternDemo ʹ�� ShapeCache ������ȡ�洢�� Hashtable �е���״�Ŀ�¡��
 * @author ����ǿ
 * @Time  2017��6��5�� ����9:13:13
 */
public class PrototypePatternDemo {

	/**
	 *  @param args
	 *  @author ����ǿ-chen
	 *  @Time  2017��6��5�� ����9:13:13
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
