package org.jeremy.app.designpattern.create.prototype;

import java.io.IOException;

public class PrototypeObjectTest {

	public static void main(String[] args) throws CloneNotSupportedException, ClassNotFoundException, IOException {
		
		MyPrototypeObject prototype = new MyPrototypeObject();
		
		prototype.setBase(1);
		prototype.setObj(new Integer(1));
		
		MyPrototypeObject clone = (MyPrototypeObject) prototype.clone();
		MyPrototypeObject deepClone = (MyPrototypeObject) prototype.deepClone();
	
		// true
		System.out.println(prototype.getObj() == clone.getObj());
		// false
		System.out.println(prototype.getObj() == deepClone.getObj());
		
		// true
		System.out.println(prototype.getObj().equals(clone.getObj()));
		// true
		System.out.println(prototype.getObj().equals(deepClone.getObj()));
	}
	
}
