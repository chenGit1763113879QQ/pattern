/**
 *sleepingTask.java
 * Administrator
 *2017��1��19������4:36:27
 *
 */
package com.chen.test01;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @author ����ǿ
 * @Time  2017��1��19�� ����4:36:27
 */
public class sleepingTask extends LiftOff {
	
	
	public void run(){
		
		try {
			
			while(countDown-- > 0){
				System.out.println(status());
				
				TimeUnit.MILLISECONDS.sleep(100);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}
	
	public static void main(String[] args) {
		
		ExecutorService exec = Executors.newCachedThreadPool();
		
		for(int i = 0; i < 5; i++){
			exec.execute(new sleepingTask());
		}
		exec.shutdown();
	}

}
