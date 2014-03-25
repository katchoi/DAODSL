package com.daospecial.dsl.condition;

import com.daospecial.dsl.BaseCondition;

public class In extends BaseCondition {


	public In(String attr1, String attr2) {
		super(attr1, attr2);

	}


	public String toSQL() {
		StringBuilder sb = new StringBuilder();
		sb.append(getAttrs().get(0)).append(" in ").append(getAttrs().get(1)).append(' ');
		return sb.toString();
	}
	
	@Override
	public String toString() {
		return "In:" + getAttrs() + " operator: " + getOperator();
	}
	
	
}
