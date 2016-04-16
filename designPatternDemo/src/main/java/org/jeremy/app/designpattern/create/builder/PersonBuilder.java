package org.jeremy.app.designpattern.create.builder;

public interface PersonBuilder {

	void buildHead();

	void buildBody();

	void buildHand();

	void buildFoot();

	Person buildPerson();
	
}
