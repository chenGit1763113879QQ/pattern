/**
 *RealImage.java
 * Administrator
 *2017��6��6������2:13:47
 *
 */
package com.designpattern.a013ProxyPattern;

/**
 * @author ����ǿ
 * @Time  2017��6��6�� ����2:13:47
 */
public class ProxyImage  implements Image {

	  
	  private RealImage realImage;
	  private String fileName;
	  
	   public ProxyImage (String fileName){
		      this.fileName = fileName;
		   }
	   
	/**
	 *  
	 * (non-Javadoc)
	 * @see com.designpattern.a013ProxyPattern.Image#display()
	 *  @author ����ǿ-chen
	 *  @Time  2017��6��6�� ����2:13:47
	 */
	@Override
	public void display() {
		
		System.out.println("ProxyImage.display");
	      if(realImage == null){
	          realImage = new RealImage(fileName);
	       }
	       realImage.display();
	}
}
