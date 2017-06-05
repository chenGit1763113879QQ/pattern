/**
 *ShapeCache.java
 * Administrator
 *2017��6��5������8:31:46
 *
 */
package com.designpattern.a005PrototypePattern;

import java.util.Hashtable;

/**
 * ����һ���࣬�����ݿ��ȡʵ���࣬�������Ǵ洢��һ�� Hashtable �С�
 * @author ����ǿ
 * @Time  2017��6��5�� ����8:31:46
 */
public class ShapeCache {

	private static Hashtable<String,Shape> shapeMap = new Hashtable<String, Shape>();
	
	
	public static Shape getShape(String shapeId){
		
		Shape cachedShape = shapeMap.get(shapeId);
		
		return (Shape) cachedShape.clone();
		
	}
	
	/**
	 * ��ÿ����״���������ݿ��ѯ ����������״
	 * shapeMap.put(shapeKey,shape);
	 * ���� ����Ҫ���������״
	 *  @author ����ǿ-chen
	 *  @Time  2017��6��5�� ����9:01:05
	 */
	public static void loadCache(){
		
		Circle circle = new Circle();
		circle.setId("1");
		shapeMap.put(circle.getId(), circle);
		
		
		Square square = new Square();
		square.setId("2");
		shapeMap.put(square.getId(), square);
		
		Rectangle rectangle = new Rectangle();
		rectangle.setId("3");
		shapeMap.put(rectangle.getId(), rectangle);
		
		
	}
}
