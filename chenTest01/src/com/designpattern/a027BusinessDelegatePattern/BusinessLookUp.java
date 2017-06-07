/**
 *BusinessLookUp.java
 * Administrator
 *2017��6��7������3:16:08
 *
 */
package com.designpattern.a027BusinessDelegatePattern;

/**
 * ����ҵ���ѯ����
 * @author ����ǿ
 * @Time  2017��6��7�� ����3:16:08
 */
public class BusinessLookUp {
	   public BusinessService getBusinessService(String serviceType){
	      if(serviceType.equalsIgnoreCase("EJB")){
	         return new EJBService();
	      }else {
	         return new JMSService();
	      }
	   }
	}