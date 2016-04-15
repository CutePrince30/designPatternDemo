package org.jeremy.app.designpattern.create.factory.muti;

public class MyBeanFactoryTest {

	public static void main(String[] args) {
		
		MyBeanFactory factory = new MyBeanFactory();
		
		factory.productMyBean1().say();
		
	}
	
}
