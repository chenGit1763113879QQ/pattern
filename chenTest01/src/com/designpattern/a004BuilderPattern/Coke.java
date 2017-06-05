/**
 *Coke.java
 * Administrator
 *2017年6月5日下午5:30:57
 *
 */
package com.designpattern.a004BuilderPattern;

/**
 * @author 陈中强
 * @Time  2017年6月5日 下午5:30:57
 */
public class Coke extends ColdDrink {

	/**
	 *  @return
	 * (non-Javadoc)
	 * @see com.designpattern.a004BuilderPattern.Item#name()
	 *  @author 陈中强-chen
	 *  @Time  2017年6月5日 下午5:30:57
	 */
	@Override
	public String name() {
		return "Coke";
	}

	/**
	 *  @return
	 * (non-Javadoc)
	 * @see com.designpattern.a004BuilderPattern.ColdDrink#price()
	 *  @author 陈中强-chen
	 *  @Time  2017年6月5日 下午5:30:57
	 */
	@Override
	public float price() {
		 return 30.0f;
	}

}
