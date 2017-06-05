/**
 *ColorFactory.java
 * Administrator
 *2017年6月5日上午11:23:18
 *
 */
package com.designpattern.a002AbstractFactoryPattern;

import com.designpattern.a002AbstractFactoryPattern.impl.color.Blue;
import com.designpattern.a002AbstractFactoryPattern.impl.color.Green;
import com.designpattern.a002AbstractFactoryPattern.impl.color.Red;

/**
 * @author 陈中强
 * @Time  2017年6月5日 上午11:23:18
 */
public class ColorFactory extends AbstractFactory {

	/**
	 *  @param color
	 *  @return
	 * (non-Javadoc)
	 * @see com.designpattern.a002AbstractFactoryPattern.AbstractFactory#getColor(java.lang.String)
	 *  @author 陈中强-chen
	 *  @Time  2017年6月5日 上午11:23:18
	 */
	@Override
	Color getColor(String color) {
	      if(color == null){
	          return null;
	       }		
	       if(color.equalsIgnoreCase("RED")){
	          return new Red();
	       } else if(color.equalsIgnoreCase("GREEN")){
	          return new Green();
	       } else if(color.equalsIgnoreCase("BLUE")){
	          return new Blue();
	       }
	       return null;
	}

	/**
	 *  @param shape
	 *  @return
	 * (non-Javadoc)
	 * @see com.designpattern.a002AbstractFactoryPattern.AbstractFactory#getShape(java.lang.String)
	 *  @author 陈中强-chen
	 *  @Time  2017年6月5日 上午11:23:18
	 */
	@Override
	Shape getShape(String shape) {
		// TODO Auto-generated method stub
		return null;
	}

}
