/**
 *StartState.java
 * Administrator
 *2017��6��6������5:11:59
 *
 */
package com.designpattern.a021StatePattern;

/**
 * @author ����ǿ
 * @Time  2017��6��6�� ����5:11:59
 */
public class StopState implements State {

	/**
	 *  @param context
	 * (non-Javadoc)
	 * @see com.designpattern.a021StatePattern.State#doAction(com.designpattern.a021StatePattern.Context)
	 *  @author ����ǿ-chen
	 *  @Time  2017��6��6�� ����5:11:59
	 */
	@Override
	public void doAction(Context context) {
	      System.out.println("Player is in stop  state");
	      context.setState(this);	
	}
	   public String toString(){
		      return "Stop   State";
		   }
}
