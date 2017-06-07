/**
 *TemplatePatternDemo.java
 * Administrator
 *2017年6月7日下午1:56:04
 *
 */
package com.designpattern.a024TemplatePattern;

/**
 * @author 陈中强
 * @Time  2017年6月7日 下午1:56:04
 */
public class TemplatePatternDemo {

	/**
	 *  @param args
	 *  @author 陈中强-chen
	 *  @Time  2017年6月7日 下午1:56:04
	 */
	public static void main(String[] args) {
		
		Game game = new Cricket();
		game.paly();
		System.out.println();
		
		game = new Football();
		game.paly();

	}

}
