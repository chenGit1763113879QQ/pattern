/**
 *Wrapper.java
 * Administrator
 *2017年6月5日下午5:21:20
 *
 */
package com.designpattern.a004BuilderPattern.impl;

import com.designpattern.a004BuilderPattern.Packing;

/**
 * @author 陈中强
 * @Time  2017年6月5日 下午5:21:20
 */
public class Wrapper implements Packing {

	/**
	 *  @return
	 * (non-Javadoc)
	 * @see com.designpattern.a004BuilderPattern.Packing#pack()
	 *  @author 陈中强-chen
	 *  @Time  2017年6月5日 下午5:21:20
	 */
	@Override
	public String pack() {
		  return "Wrapper";
	}

}
