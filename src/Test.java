package com.capgemini.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.capgemini.renderer.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test{

	public static void main (String[] args)

		{

			  ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
     			  MessageRenderer  renderer = context.getBean(MessageRenderer.class);
     			  renderer.render();

		}
}