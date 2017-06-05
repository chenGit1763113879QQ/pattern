/**
 *VegBurger.java
 * Administrator
 *2017��6��5������5:29:08
 *
 */
package com.designpattern.a004BuilderPattern;

/**
 * @author ����ǿ
 * @Time  2017��6��5�� ����5:29:08
 */
public class VegBurger extends Burger {

	/**
	 *  @return
	 * (non-Javadoc)
	 * @see com.designpattern.a004BuilderPattern.Item#name()
	 *  @author ����ǿ-chen
	 *  @Time  2017��6��5�� ����5:29:08
	 */
	@Override
	public String name() {
		 return "Veg Burger";
	}

	/**
	 *  @return
	 * (non-Javadoc)
	 * @see com.designpattern.a004BuilderPattern.Burger#price()
	 *  @author ����ǿ-chen
	 *  @Time  2017��6��5�� ����5:29:08
	 */
	@Override
	public float price() {
		 return 25.0f;
	}

}
