package org.jeremy.app.designpattern.create.builder;

public class PersonManBuilder implements PersonBuilder {
	
	private Person person;
	
	public PersonManBuilder() {
		person = new Person();
	}

	public void buildHead() {
		person.setHead("head");
	}

	public void buildBody() {
		person.setBody("body");
	}

	public void buildHand() {
		person.setHand("hand");
	}

	public void buildFoot() {
		person.setFoot("foot");
	}
	
	public Person buildPerson() {
		return person;
	}

}
