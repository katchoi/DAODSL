package com.daospecial.dsl.condition;

import com.daospecial.dsl.BaseCondition;

public class Equals extends BaseCondition {

	
	
	public Equals(String attr1, String attr2) {
		super(attr1, attr2);

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
