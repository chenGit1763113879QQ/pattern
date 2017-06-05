/**
 *Pepsi.java
 * Administrator
 *2017��6��5������5:31:54
 *
 */
package com.designpattern.a004BuilderPattern;

/**
 * @author ����ǿ
 * @Time  2017��6��5�� ����5:31:54
 */
public class Pepsi extends ColdDrink {

	/**
	 *  @return
	 * (non-Javadoc)
	 * @see com.designpattern.a004BuilderPattern.Item#name()
	 *  @author ����ǿ-chen
	 *  @Time  2017��6��5�� ����5:31:54
	 */
	@Override
	public String name() {
		return "Pepsi";
	}

	/**
	 *  @return
	 * (non-Javadoc)
	 * @see com.designpattern.a004BuilderPattern.ColdDrink#price()
	 *  @author ����ǿ-chen
	 *  @Time  2017��6��5�� ����5:31:54
	 */
	@Override
	public float price() {
		 return 35.0f;
	}

}
