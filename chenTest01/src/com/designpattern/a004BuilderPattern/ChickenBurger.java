/**
 *ChickenBurger.java
 * Administrator
 *2017��6��5������5:30:02
 *
 */
package com.designpattern.a004BuilderPattern;

/**
 * @author ����ǿ
 * @Time  2017��6��5�� ����5:30:02
 */
public class ChickenBurger extends Burger {

	/**
	 *  @return
	 * (non-Javadoc)
	 * @see com.designpattern.a004BuilderPattern.Item#name()
	 *  @author ����ǿ-chen
	 *  @Time  2017��6��5�� ����5:30:02
	 */
	@Override
	public String name() {
		 return "Chicken Burger";
	}

	/**
	 *  @return
	 * (non-Javadoc)
	 * @see com.designpattern.a004BuilderPattern.Burger#price()
	 *  @author ����ǿ-chen
	 *  @Time  2017��6��5�� ����5:30:02
	 */
	@Override
	public float price() {
		 return 50.5f;
	}

}
