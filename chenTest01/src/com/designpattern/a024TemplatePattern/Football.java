/**
 *Football.java
 * Administrator
 *2017年6月7日下午1:48:32
 *
 */
package com.designpattern.a024TemplatePattern;

/**
 * @author 陈中强
 * @Time  2017年6月7日 下午1:48:32
 */
public class Football extends Game {

	/**
	 *  
	 * (non-Javadoc)
	 * @see com.designpattern.a024TemplatePattern.Game#initialize()
	 *  @author 陈中强-chen
	 *  @Time  2017年6月7日 下午1:48:32
	 */
	@Override
	void initialize() {
		System.out.println("Football Game Initialzie! Start playing.");

	}

	/**
	 *  
	 * (non-Javadoc)
	 * @see com.designpattern.a024TemplatePattern.Game#startpaly()
	 *  @author 陈中强-chen
	 *  @Time  2017年6月7日 下午1:48:32
	 */
	@Override
	void startpaly() {
		System.out.println("Football Came Started.Enjoy the game!");

	}

	/**
	 *  
	 * (non-Javadoc)
	 * @see com.designpattern.a024TemplatePattern.Game#endPaly()
	 *  @author 陈中强-chen
	 *  @Time  2017年6月7日 下午1:48:32
	 */
	@Override
	void endPaly() {
		System.out.println("Football Game Finished!");

	}

}
