/**
 *OperationAdd.java
 * Administrator
 *2017��6��7������11:49:15
 *
 */
package com.designpattern.a023StrategyPattern;

/**
 * @author ����ǿ
 * @Time  2017��6��7�� ����11:49:15
 */
public class OperationAdd implements Strategy {

	/**
	 *  @param num1
	 *  @param num2
	 *  @return
	 * (non-Javadoc)
	 * @see com.designpattern.a023StrategyPattern.Strategy#doOperation(int, int)
	 *  @author ����ǿ-chen
	 *  @Time  2017��6��7�� ����11:49:15
	 */
	@Override
	public int doOperation(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1+num2;
	}

}
