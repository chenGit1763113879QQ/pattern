/**
 *SwitchTest01.java
 * Administrator
 *2017年3月13日下午2:59:15
 *
 */
package com.chen.test01;

/**
 * @author 陈中强
 * @Time  2017年3月13日 下午2:59:15
 */
public class SwitchTest01 {

	/**
	 *  @param args
	 *  @author 陈中强-chen
	 *  @Time  2017年3月13日 下午2:59:15
	 */
	public static void main(String[] args) {
		
		String status = "WAIT";
		switch (status) {
		case "WAIT":
			System.out.println("WAIT");
			break;

		default:
			System.out.println("default");
			break;
		}

	}

}
