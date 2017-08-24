package com.davinx.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorld {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void hello(){
		System.out.println("hello: "+name);
	}
	public static void main(String[] args) {
//		HelloWorld helloWorld=new HelloWorld();
//		hello.setName("davinx");
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContex.xml");
		HelloWorld helloWorld=(HelloWorld) ctx.getBean("helloWorld");
		helloWorld.hello();
	}

	@Override
	public String toString() {
		return "HelloWorld [name=" + name + "]";
	}

	
	
}
