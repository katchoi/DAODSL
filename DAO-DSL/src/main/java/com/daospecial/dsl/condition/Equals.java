package com.daospecial.dsl.condition;

import com.daospecial.dsl.AttributeIF;
import com.daospecial.dsl.BaseCondition;
import com.daospecial.dsl.attribute.StringAttribute;

public class Equals extends BaseCondition {

	
	
	public Equals(AttributeIF attr1, AttributeIF attr2) {
		super(attr1, attr2);

	}
	
	public Equals(String attrStr1, String attrStr2) {
		super(new StringAttribute(attrStr1), new StringAttribute(attrStr2));

	}


	public String toSQL() {
		StringBuilder sb = new StringBuilder();
	
		sb.append(getAttrs().get(0)).append('=').append(getAttrs().get(1)).append(' ');
		return sb.toString();
	}


	@Override
	public String toString() {
		return "Equals:" + getAttrs() + " operator: " + getOperator() + " next: " + getNext();
	}


	
	
	
}
