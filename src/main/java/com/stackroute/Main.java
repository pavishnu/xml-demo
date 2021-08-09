package com.stackroute;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.SimpleBeanDefinitionRegistry;
import org.springframework.beans.factory.xml.ResourceEntityResolver;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.stackroute.domain.Movie;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Movie movie1 = (Movie) context.getBean("MovieA");
		Movie movie2 = (Movie) context.getBean("MovieB");
		
		System.out.println(movie1);
		System.out.println(movie1.getActor());
		
		System.out.println(movie1==movie2);
		
		((ClassPathXmlApplicationContext) context).close();
		
	}
	


}
