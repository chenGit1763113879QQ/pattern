/**
 *SimplePriorities.java
 * Administrator
 *2017年1月19日下午4:51:42
 *
 */
package com.chen.test01;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author 陈中强
 * @Time  2017年1月19日 下午4:51:42
 */
public class SimplePriorities implements Runnable {

	
	private int countDown = 5;
	private volatile double d;//No optimization
	private int priority;
	
	
	/**
	 *  @param priority
	 * (non-Javadoc)
	 *  @author 陈中强-chen
	 *  @Time  2017年1月19日 下午4:54:22
	*/
	public SimplePriorities(int priority) {
//		super();
		this.priority = priority;
	}

	

	/**
	 *  @return
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 *  @author 陈中强-chen
	 *  @Time  2017年1月19日 下午4:54:46
	*/
	@Override
	public String toString() {
		
		
		return Thread.currentThread() + ":" + countDown;
	}



	/**
	 *  
	 * (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 *  @author 陈中强-chen
	 *  @Time  2017年1月19日 下午4:51:42
	 */
	@Override
	public void run() {
		
		Thread.currentThread().setPriority(priority);
		
		while(true){
			//An expensive interruptable operation
			for (int i = 0; i < 100000; i++) {
				
				d += (Math.PI + Math.E) / (double)i;
				
				if(i % 1000 == 0){
					Thread.yield();
				}
			}
			System.out.println(this);
			
			if(--countDown == 0){
				return;
			}
			
		}
		// TODO Auto-generated method stub

	}
	
	
	public static void main(String[] args) {
		
		ExecutorService exec = Executors.newCachedThreadPool();
		
		for (int i = 0; i < 5; i++) {
			exec.execute(new SimplePriorities(Thread.MIN_PRIORITY));
		}

		exec.execute(new SimplePriorities(Thread.MAX_PRIORITY));
		
		exec.shutdown();

	}

}
