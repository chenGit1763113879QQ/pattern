/**
 *BuyStock.java
 * Administrator
 *2017年6月6日下午3:06:52
 *
 */
package com.designpattern.a015CommandPattern;

/**
 * @author 陈中强
 * @Time  2017年6月6日 下午3:06:52
 */
public class BuyStock implements Order {

	
	 private Stock abcStock;
	 
	 public BuyStock(Stock abcStock){
	      this.abcStock = abcStock;
	   }
	 
	/**
	 * (non-Javadoc)
	 * @see com.designpattern.a015CommandPattern.Order#execute()
	 *  @author 陈中强-chen
	 *  @Time  2017年6月6日 下午3:06:52
	 */
	@Override
	public void execute() {
		 abcStock.sell();
	}

}
