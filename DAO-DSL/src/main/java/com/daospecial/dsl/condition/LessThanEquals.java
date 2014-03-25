package com.daospecial.dsl.condition;

import com.daospecial.dsl.AttributeIF;
import com.daospecial.dsl.BaseCondition;
import com.daospecial.dsl.attribute.StringAttribute;

public class LessThanEquals extends BaseCondition {

	
	
	public LessThanEquals(AttributeIF attr1, AttributeIF attr2) {
		super(attr1, attr2);

	}

	public LessThanEquals(String attrStr1, String attrStr2) {
		super(new StringAttribute(attrStr1), new StringAttribute(attrStr2));

	}

	public String toSQL() {
		StringBuilder sb = new StringBuilder();
	
		sb.append(getAttrs().get(0)).append(" =< ").append(getAttrs().get(1)).append(' ');
		return sb.toString();
	}


	@Override
	public String toString() {
		return "GreaterThanEquals:" + getAttrs() + " operator: " + getOperator() + " next: " + getNext();
	}
	
	
	
}
