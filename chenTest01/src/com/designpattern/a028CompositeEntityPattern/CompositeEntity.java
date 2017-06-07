/**
 *CompositeEntity.java
 * Administrator
 *2017��6��7������3:52:45
 *
 */
package com.designpattern.a028CompositeEntityPattern;

/**
 * �������ʵ�塣
 * @author ����ǿ
 * @Time  2017��6��7�� ����3:52:45
 */
public class CompositeEntity {
	
	  private CoarseGrainedObject cgo = new CoarseGrainedObject();

	   public void setData(String data1, String data2){
	      cgo.setData(data1, data2);
	   }

	   public String[] getData(){
	      return cgo.getData();
	   }
	   
}
