/**
 *AuthenticationFilter.java
 * Administrator
 *2017��6��7������4:45:53
 *
 */
package com.designpattern.a031InterceptingFilterPattren;

/**
 * @author ����ǿ
 * @Time  2017��6��7�� ����4:45:53
 */
public class DebugFilter implements Filter {
   public void execute(String request){
	   System.out.println("request log: " + request);
   }
}