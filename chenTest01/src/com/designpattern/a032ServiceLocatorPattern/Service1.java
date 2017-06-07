/**
 *Service1.java
 * Administrator
 *2017年6月7日下午5:02:36
 *
 */
package com.designpattern.a032ServiceLocatorPattern;

/**
 * @author 陈中强
 * @Time  2017年6月7日 下午5:02:36
 */
public class Service1 implements Service {
   public void execute(){
      System.out.println("Executing Service1");
   }

   @Override
   public String getName() {
      return "Service1";
   }
}