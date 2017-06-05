/**
 *BigDecimalTest.java
 * Administrator
 *2017��3��14������9:41:08
 *
 */
package com.chen.math;

import java.math.BigDecimal;

/**
 * @author ����ǿ
 * @Time  2017��3��14�� ����9:41:08
 */
public class BigDecimalTest {

	/**
	 *  @param args
	 *  @author ����ǿ-chen
	 *  @Time  2017��3��14�� ����9:41:08
	 */
	public static void main(String[] args) {
		
		BigDecimal price = BigDecimal.valueOf(97.12);
		BigDecimal profit = BigDecimal.valueOf(7, -2);
		BigDecimal commission = BigDecimal.valueOf(2);
		
		System.out.println(price);
		System.out.println(profit);
		System.out.println(commission);
		

		
		System.out.println("divide(BigDecimal divisor) ����");
		System.out.println(price.divide(profit));
		
		System.out.println("divide(BigDecimal divisor) ����");
//		System.out.println(price.divide(profit, RoundingMode.));
		
		
		
	}

}
