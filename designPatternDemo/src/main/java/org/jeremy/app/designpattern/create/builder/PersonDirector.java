package org.jeremy.app.designpattern.create.builder;

public class PersonDirector {

	public Person createPerson(PersonBuilder builder) {
		builder.buildHand();
		builder.buildBody();
		builder.buildHand();
		builder.buildFoot();
		return builder.buildPerson();
	}
	
}
