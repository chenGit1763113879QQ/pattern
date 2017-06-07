/**
 *Client.java
 * Administrator
 *2017年6月7日下午3:54:59
 *
 */
package com.designpattern.a028CompositeEntityPattern;

/**
 * 创建使用组合实体的客户端类。
 * @author 陈中强
 * @Time  2017年6月7日 下午3:54:59
 */
public class Client {

	 private CompositeEntity compositeEntity = new CompositeEntity();
	 
	   public void printData(){
	      for (int i = 0; i < compositeEntity.getData().length; i++) {
	         System.out.println("Data: " + compositeEntity.getData()[i]);
	      }
	   }

	   public void setData(String data1, String data2){
	      compositeEntity.setData(data1, data2);
	   }
}
