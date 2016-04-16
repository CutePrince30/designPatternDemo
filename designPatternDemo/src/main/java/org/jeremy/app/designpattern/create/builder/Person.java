package org.jeremy.app.designpattern.create.builder;

public class Person {

	private String head;

	private String body;
	
	private String hand;
	
	private String foot;

	/**
	 * @return the head
	 */
	public String getHead() {
		return head;
	}

	/**
	 * @param head the head to set
	 */
	public void setHead(String head) {
		this.head = head;
	}

	/**
	 * @return the body
	 */
	public String getBody() {
		return body;
	}

	/**
	 * @param body the body to set
	 */
	public void setBody(String body) {
		this.body = body;
	}

	/**
	 * @return the hand
	 */
	public String getHand() {
		return hand;
	}

	/**
	 * @param hand the hand to set
	 */
	public void setHand(String hand) {
		this.hand = hand;
	}

	/**
	 * @return the foot
	 */
	public String getFoot() {
		return foot;
	}

	/**
	 * @param foot the foot to set
	 */
	public void setFoot(String foot) {
		this.foot = foot;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Person [head=" + head + ", body=" + body + ", hand=" + hand
				+ ", foot=" + foot + "]";
	}
	
}
