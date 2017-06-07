/**
 *NullCustomer.java
 * Administrator
 *2017年6月7日上午9:20:45
 *
 */
package com.designpattern.a022NullObjectPattern;

/**
 * @author 陈中强
 * @Time  2017年6月7日 上午9:20:45
 */
public class NullCustomer extends AbstractCustomer {

	/**
	 *  @return
	 * (non-Javadoc)
	 * @see com.designpattern.a022NullObjectPattern.AbstractCustomer#isNil()
	 *  @author 陈中强-chen
	 *  @Time  2017年6月7日 上午9:20:45
	 */
	@Override
	public boolean isNil() {
		return true;
	}

	/**
	 *  @return
	 * (non-Javadoc)
	 * @see com.designpattern.a022NullObjectPattern.AbstractCustomer#getName()
	 *  @author 陈中强-chen
	 *  @Time  2017年6月7日 上午9:20:45
	 */
	@Override
	public String getName() {
		return "Not Available in Customer Database";
	}

}
