/**
 *OperationAdd.java
 * Administrator
 *2017年6月7日上午11:49:15
 *
 */
package com.designpattern.a023StrategyPattern;

/**
 * @author 陈中强
 * @Time  2017年6月7日 上午11:49:15
 */
public class OperationAdd implements Strategy {

	/**
	 *  @param num1
	 *  @param num2
	 *  @return
	 * (non-Javadoc)
	 * @see com.designpattern.a023StrategyPattern.Strategy#doOperation(int, int)
	 *  @author 陈中强-chen
	 *  @Time  2017年6月7日 上午11:49:15
	 */
	@Override
	public int doOperation(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1+num2;
	}

}
