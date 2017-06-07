/**
 *Computer.java
 * Administrator
 *2017年6月7日下午2:07:54
 *
 */
package com.designpattern.a025VistitorPattern;

/**
 * @author 陈中强
 * @Time  2017年6月7日 下午2:07:54
 */
public class Computer  implements ComputerPart {

	ComputerPart[] parts;
	
	public Computer(){
		parts = new ComputerPart[]{new Mouse(),new Keyboard(),new Monitor()};
	}
	/**
	 *  @param computerPartVisitor
	 * (non-Javadoc)
	 * @see com.designpattern.a025VistitorPattern.ComputerPart#accept(com.designpattern.a025VistitorPattern.ComputerPartVisitor)
	 *  @author 陈中强-chen
	 *  @Time  2017年6月7日 下午2:23:45
	*/
	@Override
	public void accept(ComputerPartVisitor computerPartVisitor) {

		for(int i = 0;i< parts.length;i++){
			parts[i].accept(computerPartVisitor);
		}
		computerPartVisitor.visit(this);
	}

}
