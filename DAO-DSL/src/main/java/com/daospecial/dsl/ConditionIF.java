package com.daospecial.dsl;

import java.util.List;

public interface ConditionIF extends SQLElement {

	public boolean eval();
	public ConditionIF and(ConditionIF cond);
	public ConditionIF or(ConditionIF cond);
	public ConditionIF addAttribute(ColumnIF col);
	public ConditionIF addAttribute(AttributeIF value);
	
	public List<AttributeIF> getAttrs();
	public String getOperator();
	public void setOperator(String op);
	public ConditionIF getNext();
	public void setNext(ConditionIF cond);
	
}
