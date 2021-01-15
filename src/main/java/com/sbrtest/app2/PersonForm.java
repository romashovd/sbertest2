package com.sbrtest.app2;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class PersonForm {

	@NotNull
	@Size(min=2, max=30)
	private String name;

	@NotNull
	@Size(min=2, max=30)
	private String secondName;

	@NotNull
	@Size(min=1, max=3000)
	private String messageBody;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMessageBody() {
		return messageBody;
	}

	public void setMessageBody(String messageBody) {
		this.messageBody = messageBody;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	public String toString() {
		return "Person(Name: " + this.name + ", Message: " + this.messageBody + ")";
	}
}
