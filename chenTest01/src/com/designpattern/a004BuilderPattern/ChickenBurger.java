/**
 *ChickenBurger.java
 * Administrator
 *2017年6月5日下午5:30:02
 *
 */
package com.designpattern.a004BuilderPattern;

/**
 * @author 陈中强
 * @Time  2017年6月5日 下午5:30:02
 */
public class ChickenBurger extends Burger {

	/**
	 *  @return
	 * (non-Javadoc)
	 * @see com.designpattern.a004BuilderPattern.Item#name()
	 *  @author 陈中强-chen
	 *  @Time  2017年6月5日 下午5:30:02
	 */
	@Override
	public String name() {
		 return "Chicken Burger";
	}

	/**
	 *  @return
	 * (non-Javadoc)
	 * @see com.designpattern.a004BuilderPattern.Burger#price()
	 *  @author 陈中强-chen
	 *  @Time  2017年6月5日 下午5:30:02
	 */
	@Override
	public float price() {
		 return 50.5f;
	}

}
