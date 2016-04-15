package org.jeremy.app.designpattern.create.abstractfactory;

import org.jeremy.app.designpattern.create.factory.common.MyBean1;
import org.jeremy.app.designpattern.create.factory.common.MyBeanInterf;

public class MyBean1Factory implements Factory {

	public MyBeanInterf getInstance() {
		return new MyBean1();
	}

}
