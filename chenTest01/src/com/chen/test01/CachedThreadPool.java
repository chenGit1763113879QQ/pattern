/**
 *CachedThreadPool.java
 * Administrator
 *2017��1��19������3:22:45
 *
 */
package com.chen.test01;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author ����ǿ
 * @Time  2017��1��19�� ����3:22:45
 */
public class CachedThreadPool {

	/**
	 *  @param args
	 *  @author ����ǿ-chen
	 *  @Time  2017��1��19�� ����3:22:45
	 */
	public static void main(String[] args) {
		
		ExecutorService exec =  Executors.newCachedThreadPool();
		
		for(int i = 0; i < 5 ; i++){
			exec.execute(new LiftOff());
		}
		
		exec.shutdown();
		
		

	}

}
