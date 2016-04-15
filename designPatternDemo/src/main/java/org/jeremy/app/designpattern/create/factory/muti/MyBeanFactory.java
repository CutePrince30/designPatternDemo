package org.jeremy.app.designpattern.create.factory.muti;

import org.jeremy.app.designpattern.create.factory.common.MyBean1;
import org.jeremy.app.designpattern.create.factory.common.MyBean2;

public class MyBeanFactory {

	public MyBean1 productMyBean1() {
		return new MyBean1();
	}

	public MyBean2 productMyBean2() {
		return new MyBean2();
	}

}
