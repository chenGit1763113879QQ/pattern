/**
 *Football.java
 * Administrator
 *2017��6��7������1:48:32
 *
 */
package com.designpattern.a024TemplatePattern;

/**
 * @author ����ǿ
 * @Time  2017��6��7�� ����1:48:32
 */
public class Football extends Game {

	/**
	 *  
	 * (non-Javadoc)
	 * @see com.designpattern.a024TemplatePattern.Game#initialize()
	 *  @author ����ǿ-chen
	 *  @Time  2017��6��7�� ����1:48:32
	 */
	@Override
	void initialize() {
		System.out.println("Football Game Initialzie! Start playing.");

	}

	/**
	 *  
	 * (non-Javadoc)
	 * @see com.designpattern.a024TemplatePattern.Game#startpaly()
	 *  @author ����ǿ-chen
	 *  @Time  2017��6��7�� ����1:48:32
	 */
	@Override
	void startpaly() {
		System.out.println("Football Came Started.Enjoy the game!");

	}

	/**
	 *  
	 * (non-Javadoc)
	 * @see com.designpattern.a024TemplatePattern.Game#endPaly()
	 *  @author ����ǿ-chen
	 *  @Time  2017��6��7�� ����1:48:32
	 */
	@Override
	void endPaly() {
		System.out.println("Football Game Finished!");

	}

}
