/**
 *CoarseGrainedObject.java
 * Administrator
 *2017年6月7日下午3:48:22
 *
 */
package com.designpattern.a028CompositeEntityPattern;

/**
 * @author 陈中强
 * @Time  2017年6月7日 下午3:48:22
 */
public class CoarseGrainedObject {

	
	   DependentObject1 do1 = new DependentObject1();
	   DependentObject2 do2 = new DependentObject2();
	   
	   public void setData(String data1, String data2){
		      do1.setData(data1);
		      do2.setData(data2);
		   }
	   
	   public String[] getData(){
		      return new String[] {do1.getData(),do2.getData()};
	}
	
}
