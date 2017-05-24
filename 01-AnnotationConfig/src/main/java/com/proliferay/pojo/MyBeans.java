package com.proliferay.pojo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
/**
 * 
 * @author Hamidul Islam
 *
 *Annotating a class with the @Configuration indicates that 
 *the class can be used by the Spring IoC container as a source
 * of bean definitions.
 */
@Configuration
public class MyBeans {

	public String hello(String name) {
		return "Hello :" + name;
	}

	/**
	 * The @Bean annotation tells Spring that a method 
	 * annotated with @Bean will return an object that should
	 *  be registered as a bean in the Spring application context.
	 * 
	 */
	@Bean(name = "someBean" )
	public MyBeans helloWorld() {
		return new MyBeans();
	}
	
	/**
	 * 
	 * By default calc will be registered as a bean in the container
	 */
	@Bean
	public Calculator calc() {
		return new Calculator();
	}
	
	/**
	 * 
	 * We can also declare the life cycle 
	 * methods of the beans 
	 */
	
	@Bean(initMethod="init", destroyMethod="cleanup")
	public Person person() {
		return new Person();
	}
}
