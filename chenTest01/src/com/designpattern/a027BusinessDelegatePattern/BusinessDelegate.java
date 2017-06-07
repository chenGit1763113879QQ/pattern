/**
 *BusinessDelegate.java
 * Administrator
 *2017年6月7日下午3:16:43
 *
 */
package com.designpattern.a027BusinessDelegatePattern;

/**
 * 创建业务代表。
 * @author 陈中强
 * @Time  2017年6月7日 下午3:16:43
 */
public class BusinessDelegate {

	private BusinessLookUp lookupservice = new BusinessLookUp();
	
	private BusinessService businessService;
	
	private String serviceType;
	
    public void setServiceType(String serviceType){
      this.serviceType = serviceType;
    }
    
    public void doTsak(){
    	businessService = lookupservice.getBusinessService(serviceType);
    	businessService.doProcessing();
    }
   
   
}
