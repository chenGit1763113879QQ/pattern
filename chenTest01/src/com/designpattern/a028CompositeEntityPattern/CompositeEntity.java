/**
 *CompositeEntity.java
 * Administrator
 *2017年6月7日下午3:52:45
 *
 */
package com.designpattern.a028CompositeEntityPattern;

/**
 * 创建组合实体。
 * @author 陈中强
 * @Time  2017年6月7日 下午3:52:45
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
