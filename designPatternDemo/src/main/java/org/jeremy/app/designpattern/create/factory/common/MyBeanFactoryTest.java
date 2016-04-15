package org.jeremy.app.designpattern.create.factory.common;

public class MyBeanFactoryTest {

	public static void main(String[] args) {
	
		MyBeanFactory factory = new MyBeanFactory(); 
		
		factory.product("bean1").say();
		
	}
	
}
