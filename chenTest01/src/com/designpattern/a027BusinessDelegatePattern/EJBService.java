/**
 *EJBService.java
 * Administrator
 *2017��6��7������3:14:38
 *
 */
package com.designpattern.a027BusinessDelegatePattern;

/**
 * @author ����ǿ
 * @Time  2017��6��7�� ����3:14:38
 */
public class EJBService implements BusinessService {

	   @Override
	   public void doProcessing() {
	      System.out.println("Processing task by invoking EJB Service");
	   }
}