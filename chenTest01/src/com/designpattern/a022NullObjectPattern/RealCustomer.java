/**
 *RealCustomer.java
 * Administrator
 *2017��6��7������9:09:59
 *
 */
package com.designpattern.a022NullObjectPattern;

/**
 * @author ����ǿ
 * @Time  2017��6��7�� ����9:09:59
 */
public class RealCustomer extends AbstractCustomer {

	
	
	/**
	 *  
	 * (non-Javadoc)
	 *  @author ����ǿ-chen
	 *  @Time  2017��6��7�� ����9:15:56
	*/
	public RealCustomer(String name) {
		this.name = name;
	}

	/**
	 *  @return
	 * (non-Javadoc)
	 * @see com.designpattern.a022NullObjectPattern.AbstractCustomer#isNil()
	 *  @author ����ǿ-chen
	 *  @Time  2017��6��7�� ����9:09:59
	 */
	@Override
	public boolean isNil() {
		return false;
	}

	/**
	 *  @return
	 * (non-Javadoc)
	 * @see com.designpattern.a022NullObjectPattern.AbstractCustomer#getName()
	 *  @author ����ǿ-chen
	 *  @Time  2017��6��7�� ����9:09:59
	 */
	@Override
	public String getName() {
		return name;
	}

}
