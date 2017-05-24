package com.proliferay;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.proliferay.config.BeansConfiguration;
import com.proliferay.pojo.Company;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeansConfiguration.class);
    	
    	try {
			Company company = (Company) context.getBean("company");
			System.out.println(company.getEmployee().getFirstName());
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			context.close();
		}
    }
}
