/**
 *Pepsi.java
 * Administrator
 *2017年6月5日下午5:31:54
 *
 */
package com.designpattern.a004BuilderPattern;

/**
 * @author 陈中强
 * @Time  2017年6月5日 下午5:31:54
 */
public class Pepsi extends ColdDrink {

	/**
	 *  @return
	 * (non-Javadoc)
	 * @see com.designpattern.a004BuilderPattern.Item#name()
	 *  @author 陈中强-chen
	 *  @Time  2017年6月5日 下午5:31:54
	 */
	@Override
	public String name() {
		return "Pepsi";
	}

	/**
	 *  @return
	 * (non-Javadoc)
	 * @see com.designpattern.a004BuilderPattern.ColdDrink#price()
	 *  @author 陈中强-chen
	 *  @Time  2017年6月5日 下午5:31:54
	 */
	@Override
	public float price() {
		 return 35.0f;
	}

}
