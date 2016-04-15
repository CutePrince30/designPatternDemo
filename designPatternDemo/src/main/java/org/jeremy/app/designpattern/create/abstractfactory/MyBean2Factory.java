package org.jeremy.app.designpattern.create.abstractfactory;

import org.jeremy.app.designpattern.create.factory.common.MyBean2;
import org.jeremy.app.designpattern.create.factory.common.MyBeanInterf;

public class MyBean2Factory implements Factory {

	public MyBeanInterf getInstance() {
		return new MyBean2();
	}

}
