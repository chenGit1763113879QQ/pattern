/**
 *TaskWithResult.java
 * Administrator
 *2017年1月19日下午3:32:58
 *
 */
package com.chen.test01;

import java.util.concurrent.Callable;

/**
 * Runnable 是执行工作的独立任务 但是他不返回任何职值 
 * 如果你希望任务完成时能够返回一个值 那么可以实现callable
 * 接口 而不是 Runnable接口
 * 它的类型参数表示的是从方法call() 中返回的值
 * 并且必须使用ExecutorSerivice.submit()方法调用它
 * @author 陈中强
 * @Time  2017年1月19日 下午3:32:58
 */
public class TaskWithResult implements Callable<String> {

	private int id;
	
	
	/**
	 *  @param id
	 * (non-Javadoc)
	 *  @author 陈中强-chen
	 *  @Time  2017年1月19日 下午3:36:57
	*/
	public TaskWithResult(int id) {
//		super();
		this.id = id;
	}


	/**
	 *  @return
	 *  @throws Exception
	 * (non-Javadoc)
	 * @see java.util.concurrent.Callable#call()
	 *  @author 陈中强-chen
	 *  @Time  2017年1月19日 下午3:32:58
	 */
	@Override
	public String call() throws Exception {
		// TODO Auto-generated method stub
		return "result of TaskWithResult " + id ;
	}

}
