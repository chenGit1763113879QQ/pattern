/**
 *ComputerPartDisplayVisitor.java
 * Administrator
 *2017年6月7日下午2:34:49
 *
 */
package com.designpattern.a025VistitorPattern;

/**
 * @author 陈中强
 * @Time  2017年6月7日 下午2:34:49
 */
public class ComputerPartDisplayVisitor implements ComputerPartVisitor {

	/**
	 *  @param compter
	 * (non-Javadoc)
	 * @see com.designpattern.a025VistitorPattern.ComputerPartVisitor#visit(com.designpattern.a025VistitorPattern.Computer)
	 *  @author 陈中强-chen
	 *  @Time  2017年6月7日 下午2:34:49
	 */
	@Override
	public void visit(Computer compter) {
		System.out.println("Display Computer.");

	}

	/**
	 *  @param mouse
	 * (non-Javadoc)
	 * @see com.designpattern.a025VistitorPattern.ComputerPartVisitor#visit(com.designpattern.a025VistitorPattern.Mouse)
	 *  @author 陈中强-chen
	 *  @Time  2017年6月7日 下午2:34:49
	 */
	@Override
	public void visit(Mouse mouse) {
		System.out.println("Dispalying Mouse.");
	}

	/**
	 *  @param keyboard
	 * (non-Javadoc)
	 * @see com.designpattern.a025VistitorPattern.ComputerPartVisitor#visit(com.designpattern.a025VistitorPattern.Keyboard)
	 *  @author 陈中强-chen
	 *  @Time  2017年6月7日 下午2:34:49
	 */
	@Override
	public void visit(Keyboard keyboard) {
		System.out.println("Dispalying Keyboard.");

	}

	/**
	 *  @param monitor
	 * (non-Javadoc)
	 * @see com.designpattern.a025VistitorPattern.ComputerPartVisitor#visit(com.designpattern.a025VistitorPattern.Monitor)
	 *  @author 陈中强-chen
	 *  @Time  2017年6月7日 下午2:34:49
	 */
	@Override
	public void visit(Monitor monitor) {
	
		System.out.println("Dispalying Monitor.");

	}

}
