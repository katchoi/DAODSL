package com.daospecial.dsl.condition;

public class ConditionFactory {

	public static Equals createEqualsCondition(String attr1, String attr2) {
		return new Equals(attr1, attr2);
	}
	
	public static In createInCondition(String attr1, String attr2) {
		return new In(attr1, attr2);
	}
	
}
