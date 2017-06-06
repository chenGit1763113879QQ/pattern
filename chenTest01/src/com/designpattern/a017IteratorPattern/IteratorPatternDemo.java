/**
 *IteratorPatternDemo.java
 * Administrator
 *2017��6��6������4:08:31
 *
 */
package com.designpattern.a017IteratorPattern;

/**
 * @author ����ǿ
 * @Time  2017��6��6�� ����4:08:31
 */
public class IteratorPatternDemo {

	/**
	 *  @param args
	 *  @author ����ǿ-chen
	 *  @Time  2017��6��6�� ����4:08:31
	 */
	public static void main(String[] args) {
		
		  NameRepository namesRepository = new NameRepository();
		  
		  for(Iterator  iter = namesRepository.getIterator();iter.hasNext(); ){
			  String name = (String)iter.next();
		         System.out.println("Name : " + name);
		  }

	}

}
