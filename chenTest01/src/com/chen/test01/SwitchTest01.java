/**
 *SwitchTest01.java
 * Administrator
 *2017��3��13������2:59:15
 *
 */
package com.chen.test01;

/**
 * @author ����ǿ
 * @Time  2017��3��13�� ����2:59:15
 */
public class SwitchTest01 {

	/**
	 *  @param args
	 *  @author ����ǿ-chen
	 *  @Time  2017��3��13�� ����2:59:15
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
