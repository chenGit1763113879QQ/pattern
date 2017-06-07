/**
 *AuthenticationFilter.java
 * Administrator
 *2017年6月7日下午4:45:53
 *
 */
package com.designpattern.a031InterceptingFilterPattren;

/**
 * @author 陈中强
 * @Time  2017年6月7日 下午4:45:53
 */
public class DebugFilter implements Filter {
   public void execute(String request){
	   System.out.println("request log: " + request);
   }
}