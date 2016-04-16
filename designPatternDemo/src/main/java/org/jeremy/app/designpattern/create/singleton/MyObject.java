package org.jeremy.app.designpattern.create.singleton;

public class MyObject {

	private static MyObject object = null;

	// TODO: 要考虑线程安全
	public static MyObject getInstance() {
		if (object == null) {
			object = new MyObject();
		}
		return object;
	}
	
}
