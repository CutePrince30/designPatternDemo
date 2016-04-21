package org.jeremy.app.designpattern.structure.adapter.classes;

public class ClassesAdapterTest {

	public static void main(String[] args) {
		Targetable target = new Adapter();
		target.method1();
		target.method2();
	}
	
}
