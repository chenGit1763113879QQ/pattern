/**
 *IteratorPatternDemo.java
 * Administrator
 *2017年6月6日下午4:08:31
 *
 */
package com.designpattern.a017IteratorPattern;

/**
 * @author 陈中强
 * @Time  2017年6月6日 下午4:08:31
 */
public class IteratorPatternDemo {

	/**
	 *  @param args
	 *  @author 陈中强-chen
	 *  @Time  2017年6月6日 下午4:08:31
	 */
	public static void main(String[] args) {
		
		  NameRepository namesRepository = new NameRepository();
		  
		  for(Iterator  iter = namesRepository.getIterator();iter.hasNext(); ){
			  String name = (String)iter.next();
		         System.out.println("Name : " + name);
		  }

	}

}
