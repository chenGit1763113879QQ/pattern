/**
 *Coke.java
 * Administrator
 *2017��6��5������5:30:57
 *
 */
package com.designpattern.a004BuilderPattern;

/**
 * @author ����ǿ
 * @Time  2017��6��5�� ����5:30:57
 */
public class Coke extends ColdDrink {

	/**
	 *  @return
	 * (non-Javadoc)
	 * @see com.designpattern.a004BuilderPattern.Item#name()
	 *  @author ����ǿ-chen
	 *  @Time  2017��6��5�� ����5:30:57
	 */
	@Override
	public String name() {
		return "Coke";
	}

	/**
	 *  @return
	 * (non-Javadoc)
	 * @see com.designpattern.a004BuilderPattern.ColdDrink#price()
	 *  @author ����ǿ-chen
	 *  @Time  2017��6��5�� ����5:30:57
	 */
	@Override
	public float price() {
		 return 30.0f;
	}

}
