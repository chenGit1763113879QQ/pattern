/**
 *CachedThreadPool.java
 * Administrator
 *2017年1月19日下午3:22:45
 *
 */
package com.chen.test01;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author 陈中强
 * @Time  2017年1月19日 下午3:22:45
 */
public class CachedThreadPool {

	/**
	 *  @param args
	 *  @author 陈中强-chen
	 *  @Time  2017年1月19日 下午3:22:45
	 */
	public static void main(String[] args) {
		
		ExecutorService exec =  Executors.newCachedThreadPool();
		
		for(int i = 0; i < 5 ; i++){
			exec.execute(new LiftOff());
		}
		
		exec.shutdown();
		
		

	}

}
