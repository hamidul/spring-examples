package com.proliferay;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.proliferay.pojo.Calculator;
import com.proliferay.pojo.MyBeans;


/**
 * 
 * @author Hamidul Islam
 *
 */
public class App {
	public static void main(String[] args) {
		/**
		 * Use AnnotationConfigApplicationContext when beans are 
		 * defined by @Configuration
		 * 
		 * All the beans will be initialized while retrieving application context
		 * For example init() method of Person will be called for initialisation   
		 */
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyBeans.class);

		try {
			MyBeans helloRefrence = (MyBeans) context.getBean("someBean");
			System.out.println(helloRefrence.hello("hamidul"));
			
			Calculator calc = (Calculator) context.getBean("calc");
			System.out.println(calc.add(1, 2));
			
			context.getBean("person");
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			context.close();
		}
	}
}
