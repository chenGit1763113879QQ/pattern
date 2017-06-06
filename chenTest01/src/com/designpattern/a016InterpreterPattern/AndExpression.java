/**
 *OrExpression.java
 * Administrator
 *2017年6月6日下午3:24:33
 *
 */
package com.designpattern.a016InterpreterPattern;

import java.util.concurrent.Executor;

/**
 * @author 陈中强
 * @Time  2017年6月6日 下午3:24:33
 */
public class AndExpression implements Expression {

	
	   private Expression expr1 = null;
	   private Expression expr2 = null;
	   
	   
	   public AndExpression(Expression expr1, Expression expr2) { 
		      this.expr1 = expr1;
		      this.expr2 = expr2;
		   }

	   
	/**
	 *  @param context
	 *  @return
	 * (non-Javadoc)
	 * @see com.designpattern.a016InterpreterPattern.Expression#interpret(java.lang.String)
	 *  @author 陈中强-chen
	 *  @Time  2017年6月6日 下午3:24:33
	 */
	@Override
	public boolean interpret(String context) {
		 return expr1.interpret(context) && expr2.interpret(context);
	}


}
