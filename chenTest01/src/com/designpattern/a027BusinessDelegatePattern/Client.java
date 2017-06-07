/**
 *Client.java
 * Administrator
 *2017��6��7������3:21:50
 *
 */
package com.designpattern.a027BusinessDelegatePattern;

/**
 * �����ͻ��ˡ�
 * @author ����ǿ
 * @Time  2017��6��7�� ����3:21:50
 */
public class Client {

	BusinessDelegate businessService;
	
	public Client(BusinessDelegate businessService){
		this.businessService = businessService;
	}
	
	public void doTask(){
		businessService.doTsak();
	}
}
