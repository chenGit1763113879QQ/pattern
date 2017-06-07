/**
 *NullCustomer.java
 * Administrator
 *2017��6��7������9:20:45
 *
 */
package com.designpattern.a022NullObjectPattern;

/**
 * @author ����ǿ
 * @Time  2017��6��7�� ����9:20:45
 */
public class NullCustomer extends AbstractCustomer {

	/**
	 *  @return
	 * (non-Javadoc)
	 * @see com.designpattern.a022NullObjectPattern.AbstractCustomer#isNil()
	 *  @author ����ǿ-chen
	 *  @Time  2017��6��7�� ����9:20:45
	 */
	@Override
	public boolean isNil() {
		return true;
	}

	/**
	 *  @return
	 * (non-Javadoc)
	 * @see com.designpattern.a022NullObjectPattern.AbstractCustomer#getName()
	 *  @author ����ǿ-chen
	 *  @Time  2017��6��7�� ����9:20:45
	 */
	@Override
	public String getName() {
		return "Not Available in Customer Database";
	}

}
