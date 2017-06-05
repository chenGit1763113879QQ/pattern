/**
 *BigDecimalTest.java
 * Administrator
 *2017年3月14日上午9:41:08
 *
 */
package com.chen.math;

import java.math.BigDecimal;

/**
 * @author 陈中强
 * @Time  2017年3月14日 上午9:41:08
 */
public class BigDecimalTest {

	/**
	 *  @param args
	 *  @author 陈中强-chen
	 *  @Time  2017年3月14日 上午9:41:08
	 */
	public static void main(String[] args) {
		
		BigDecimal price = BigDecimal.valueOf(97.12);
		BigDecimal profit = BigDecimal.valueOf(7, -2);
		BigDecimal commission = BigDecimal.valueOf(2);
		
		System.out.println(price);
		System.out.println(profit);
		System.out.println(commission);
		

		
		System.out.println("divide(BigDecimal divisor) 除法");
		System.out.println(price.divide(profit));
		
		System.out.println("divide(BigDecimal divisor) 除法");
//		System.out.println(price.divide(profit, RoundingMode.));
		
		
		
	}

}
