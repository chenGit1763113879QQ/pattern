/**
 *Service1.java
 * Administrator
 *2017��6��7������5:02:36
 *
 */
package com.designpattern.a032ServiceLocatorPattern;

/**
 * @author ����ǿ
 * @Time  2017��6��7�� ����5:02:36
 */
public class Service2 implements Service {
   public void execute(){
      System.out.println("Executing Service2");
   }

   @Override
   public String getName() {
      return "Service2";
   }
}