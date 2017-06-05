/**
 *CallableDemo.java
 * Administrator
 *2017��1��19������3:39:06
 *
 */
package com.chen.test01;

import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @author ����ǿ
 * @Time  2017��1��19�� ����3:39:06
 */
public class CallableDemo {

	/**
	 *  @param args
	 *  @author ����ǿ-chen
	 *  @Time  2017��1��19�� ����3:39:06
	 */
	public static void main(String[] args) {
		
		ExecutorService exec  =  Executors.newCachedThreadPool();
		
		ArrayList<Future<String>> results = new ArrayList<Future<String>>();
		
		
		for(int i =0; i< 10; i++){
			results.add(exec.submit(new TaskWithResult(i)));
		}
		
		for(Future<String> fs : results ){
			
			try {
				
				System.out.println(fs.get());
			} catch (Exception e) {
				System.out.println(e);
				// TODO: handle exception
			}finally{
				exec.shutdown();
			}
			
		}

	}

}
