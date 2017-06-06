/**
 *BuyStock.java
 * Administrator
 *2017��6��6������3:06:52
 *
 */
package com.designpattern.a015CommandPattern;

/**
 * @author ����ǿ
 * @Time  2017��6��6�� ����3:06:52
 */
public class BuyStock implements Order {

	
	 private Stock abcStock;
	 
	 public BuyStock(Stock abcStock){
	      this.abcStock = abcStock;
	   }
	 
	/**
	 * (non-Javadoc)
	 * @see com.designpattern.a015CommandPattern.Order#execute()
	 *  @author ����ǿ-chen
	 *  @Time  2017��6��6�� ����3:06:52
	 */
	@Override
	public void execute() {
		 abcStock.sell();
	}

}
