/**
 *RealCustomer.java
 * Administrator
 *2017年6月7日上午9:09:59
 *
 */
package com.designpattern.a022NullObjectPattern;

/**
 * @author 陈中强
 * @Time  2017年6月7日 上午9:09:59
 */
public class RealCustomer extends AbstractCustomer {

	
	
	/**
	 *  
	 * (non-Javadoc)
	 *  @author 陈中强-chen
	 *  @Time  2017年6月7日 上午9:15:56
	*/
	public RealCustomer(String name) {
		this.name = name;
	}

	/**
	 *  @return
	 * (non-Javadoc)
	 * @see com.designpattern.a022NullObjectPattern.AbstractCustomer#isNil()
	 *  @author 陈中强-chen
	 *  @Time  2017年6月7日 上午9:09:59
	 */
	@Override
	public boolean isNil() {
		return false;
	}

	/**
	 *  @return
	 * (non-Javadoc)
	 * @see com.designpattern.a022NullObjectPattern.AbstractCustomer#getName()
	 *  @author 陈中强-chen
	 *  @Time  2017年6月7日 上午9:09:59
	 */
	@Override
	public String getName() {
		return name;
	}

}
