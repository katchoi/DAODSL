package com.daospecial.dsl.attribute;

import com.daospecial.dsl.AttributeIF;

public class StringAttribute implements AttributeIF {

	private String val;
	
	
	public StringAttribute(String val) {
		super();
		this.val = val;
	}

	public int getType() {
		return _stringType;
	}

	public String getValue() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
