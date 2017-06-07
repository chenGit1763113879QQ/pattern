/**
 *EJBService.java
 * Administrator
 *2017年6月7日下午3:14:38
 *
 */
package com.designpattern.a027BusinessDelegatePattern;

/**
 * @author 陈中强
 * @Time  2017年6月7日 下午3:14:38
 */
public class EJBService implements BusinessService {

	   @Override
	   public void doProcessing() {
	      System.out.println("Processing task by invoking EJB Service");
	   }
}