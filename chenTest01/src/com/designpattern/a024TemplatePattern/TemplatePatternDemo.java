/**
 *TemplatePatternDemo.java
 * Administrator
 *2017��6��7������1:56:04
 *
 */
package com.designpattern.a024TemplatePattern;

/**
 * @author ����ǿ
 * @Time  2017��6��7�� ����1:56:04
 */
public class TemplatePatternDemo {

	/**
	 *  @param args
	 *  @author ����ǿ-chen
	 *  @Time  2017��6��7�� ����1:56:04
	 */
	public static void main(String[] args) {
		
		Game game = new Cricket();
		game.paly();
		System.out.println();
		
		game = new Football();
		game.paly();

	}

}
