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
public class RealImage  implements Image {
	  private String fileName;
	  
	   public RealImage(String fileName){
		      this.fileName = fileName;
		      loadFromDisk(fileName);
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
		   System.out.println("Displaying " + fileName);

	}
	   private void loadFromDisk(String fileName){
		      System.out.println("Loading " + fileName);
		   }
	 
}
