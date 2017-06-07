/**
 *Client.java
 * Administrator
 *2017年6月7日下午3:21:50
 *
 */
package com.designpattern.a027BusinessDelegatePattern;

/**
 * 创建客户端。
 * @author 陈中强
 * @Time  2017年6月7日 下午3:21:50
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
