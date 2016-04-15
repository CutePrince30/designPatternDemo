package org.jeremy.app.designpattern.create.abstractfactory;

public class MyBeanAbstractFactoryTest {

	public static void main(String[] args) {
		Factory factory = new MyBean1Factory();
		factory.getInstance().say();
	}

}
