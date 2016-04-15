package org.jeremy.app.designpattern.create.factory.stat;

import org.jeremy.app.designpattern.create.factory.common.MyBean1;
import org.jeremy.app.designpattern.create.factory.common.MyBean2;

public class MyBeanFactory {

	public static MyBean1 productMyBean1() {
		return new MyBean1();
	}

	public static MyBean2 productMyBean2() {
		return new MyBean2();
	}
	
}
