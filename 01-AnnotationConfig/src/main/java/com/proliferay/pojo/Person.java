package com.proliferay.pojo;
/**
 * 
 * @author hamidul.islam
 *
 */
public class Person {
	
	public void init() {
	      // initialization logic
		   System.out.println("############Called init() lifecycle method ###############");
	   }
	   public void cleanup() {
		   System.out.println("############Called cleanup() lifecycle method ###############");
	      // destruction logic
	   }
}
