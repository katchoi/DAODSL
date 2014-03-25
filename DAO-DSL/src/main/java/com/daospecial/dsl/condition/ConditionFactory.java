package com.daospecial.dsl.condition;

import com.daospecial.dsl.AttributeIF;

public class ConditionFactory {

	public static Equals createEqualsCondition(AttributeIF attr1, AttributeIF attr2) {
		return new Equals(attr1, attr2);
	}
	
	public static In createInCondition(AttributeIF attr1, AttributeIF attr2) {
		return new In(attr1, attr2);
	}
	
}
