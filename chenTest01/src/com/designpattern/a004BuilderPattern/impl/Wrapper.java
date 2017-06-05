/**
 *Wrapper.java
 * Administrator
 *2017��6��5������5:21:20
 *
 */
package com.designpattern.a004BuilderPattern.impl;

import com.designpattern.a004BuilderPattern.Packing;

/**
 * @author ����ǿ
 * @Time  2017��6��5�� ����5:21:20
 */
public class Wrapper implements Packing {

	/**
	 *  @return
	 * (non-Javadoc)
	 * @see com.designpattern.a004BuilderPattern.Packing#pack()
	 *  @author ����ǿ-chen
	 *  @Time  2017��6��5�� ����5:21:20
	 */
	@Override
	public String pack() {
		  return "Wrapper";
	}

}
