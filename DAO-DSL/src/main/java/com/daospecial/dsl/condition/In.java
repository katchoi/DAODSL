package com.daospecial.dsl.condition;

import com.daospecial.dsl.AttributeIF;
import com.daospecial.dsl.BaseCondition;
import com.daospecial.dsl.attribute.StringAttribute;

public class In extends BaseCondition {


	public In(AttributeIF attr1, AttributeIF attr2) {
		super(attr1, attr2);

	}

	public In(String attrStr1, String attrStr2) {
		super(new StringAttribute(attrStr1), new StringAttribute(attrStr2));

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
