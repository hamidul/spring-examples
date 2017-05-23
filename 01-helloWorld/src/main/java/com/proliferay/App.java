package com.proliferay;

import org.springframework.beans.BeansException;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.proliferay.pojo.HelloWorld;

/**
 * 
 * @author Hamidul Islam
 *
 */
public class App 
{
    public static void main( String[] args )
    {
		/**
		 * We want to read beans from xml which is in class path
		 * Spring comes with several flavors of application context
		 * Here ClassPathXmlApplicationContext is more appropriate 
		 */
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		try {
			//Refer the bean by id. Look at beans.xml 
			HelloWorld helloWorld = (HelloWorld) context.getBean("helloBean"); 
			helloWorld.printHello();
		} catch (BeansException e) {

			e.printStackTrace();
		} finally {
			/**
			 * Its always good to close the context
			 * However in Spring web based application this is not required 
			 * which will be taken care by the framework
			 */
			
			context.close();
		}
	}
}
