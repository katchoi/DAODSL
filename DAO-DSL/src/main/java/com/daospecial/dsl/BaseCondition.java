package com.daospecial.dsl;

import java.util.ArrayList;
import java.util.List;

public abstract class BaseCondition implements ConditionIF {

	private ArrayList<String> attrs;
	private String operator;
	private ConditionIF next;
	

	public BaseCondition(String attr1, String attr2) {
		super();
		this.attrs = new ArrayList<String>();
		attrs.add(attr1);
		attrs.add(attr2);
		next = null;
	}

	public boolean eval() {
		// TODO Auto-generated method stub
		return false;
	}

	public ConditionIF and(ConditionIF cond) {
		ConditionIF last = getLast(this);
		System.out.println("last: " + last);
		last.setOperator(" and ");
		last.setNext(cond);
		return this;
	}

	public ConditionIF or(ConditionIF cond) {
		ConditionIF last = getLast(this);
		last.setOperator(" or ");
		last.setNext(cond);
		return this;
	}

	public ConditionIF addAttribute(ColumnIF col) {
		attrs.add(col.toString());
		return this;
	}

	public ConditionIF addAttribute(String value) {
		attrs.add(value);
		return this;
	}


	public String getOperator() {
		if ( operator  == null )
			return "";
		return operator;
	}

	public List<String> getAttrs() {
		return attrs;
	}

	public ConditionIF getNext() {
		return next;
	}
	
	public void setNext(ConditionIF cond) {
		next = cond;
	}
	
	private ConditionIF getLast(ConditionIF item) {
		if ( item.getNext() == null )
			return this;
		return getLast(item.getNext()); 
	}
	
	public void setOperator(String op) {
		operator = op;
	}

}
