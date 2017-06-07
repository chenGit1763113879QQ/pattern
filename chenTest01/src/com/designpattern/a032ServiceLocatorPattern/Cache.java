/**
 *Cache.java
 * Administrator
 *2017��6��7������5:07:50
 *
 */
package com.designpattern.a032ServiceLocatorPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ����ǿ
 * @Time  2017��6��7�� ����5:07:50
 */
public class Cache {

	
	private List<Service> services;
	
	public Cache(){
		services = new ArrayList<Service>();
	}
	

   public Service getService(String serviceName){
      for (Service service : services) {
         if(service.getName().equalsIgnoreCase(serviceName)){
            System.out.println("Returning cached  "+serviceName+" object");
            return service;
         }
      }
      return null;
   }
   
   public void addService(Service newService){
      boolean exists = false;
      for (Service service : services) {
         if(service.getName().equalsIgnoreCase(newService.getName())){
            exists = true;
         }
      }
      if(!exists){
         services.add(newService);
      }
   }
   
	
}
