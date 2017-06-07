/**
 *BusinessDelegate.java
 * Administrator
 *2017��6��7������3:16:43
 *
 */
package com.designpattern.a027BusinessDelegatePattern;

/**
 * ����ҵ�����
 * @author ����ǿ
 * @Time  2017��6��7�� ����3:16:43
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
