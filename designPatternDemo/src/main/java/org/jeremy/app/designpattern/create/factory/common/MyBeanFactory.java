package org.jeremy.app.designpattern.create.factory.common;

public class MyBeanFactory {

	public MyBeanInterf product(String beanName) {
		if (beanName.equals("bean1")) {
			return new MyBean1();
		}
		else if (beanName.equals("bean2")) {
			return new MyBean2();
		}
		else {
			System.out.println("没有要找的类型");
			return null;
		}
	}

}
