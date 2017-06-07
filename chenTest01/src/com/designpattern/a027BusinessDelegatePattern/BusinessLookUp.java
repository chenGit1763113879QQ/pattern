/**
 *BusinessLookUp.java
 * Administrator
 *2017年6月7日下午3:16:08
 *
 */
package com.designpattern.a027BusinessDelegatePattern;

/**
 * 创建业务查询服务。
 * @author 陈中强
 * @Time  2017年6月7日 下午3:16:08
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