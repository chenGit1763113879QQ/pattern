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
public class AuthenticationFilter implements Filter {
   public void execute(String request){
      System.out.println("Authenticating request: " + request);
   }
}