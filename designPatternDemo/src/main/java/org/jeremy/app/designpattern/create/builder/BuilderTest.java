package org.jeremy.app.designpattern.create.builder;

public class BuilderTest {

	public static void main(String[] args) {
		
		Person person = new PersonDirector().createPerson(new PersonManBuilder());
		
		System.out.println(person);
		
	}
	
}
