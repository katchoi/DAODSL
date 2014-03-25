package com.daospecial.dsl;

import java.sql.ResultSet;
import java.util.List;

public abstract class BaseTable implements TableIF {

	protected ConditionIF cond;
	protected String select;
	protected String where;
	protected String cols;
	protected String name;

	public TableIF join(TableIF t) {
		// TODO Auto-generated method stub
		return null;
	}

	public TableIF on(ConditionIF cond) {
		// TODO Auto-generated method stub
		return null;
	}

	public TableIF select() {
		select = "select ";
		return this;
	}

	public TableIF where() {
		where = " where ";
		return this;
	}


	public TableIF addColumn(String col) {
		if ( cols != null)
			cols += ", " + col;
		else 
			cols = col;
		return this;
	}



	public TableIF addCondition(ConditionIF cond) {
		this.cond = cond;
		return this;
	}

	public ResultSet getResultSet() {
		// TODO Auto-generated method stub
		return null;
	}

	public TableIF insert() {
		// TODO Auto-generated method stub
		return null;
	}

	public TableIF addValue(List<AttributeIF> values) {
		// TODO Auto-generated method stub
		return null;
	}

	public TableIF addValue(AttributeIF value) {
		// TODO Auto-generated method stub
		return null;
	}


	public TableIF addColumn(List<ColumnIF> cols) {
		// TODO Auto-generated method stub
		return null;
	}

	public TableIF addColumn(ColumnIF col) {
		// TODO Auto-generated method stub
		return null;
	}
	
	protected String getConditions() {
		StringBuilder sb = new StringBuilder();

		ConditionIF pointTo = cond;
		while (pointTo != null ) {
			sb.append(pointTo.toSQL());
			sb.append(pointTo.getOperator());
			pointTo = pointTo.getNext();
		}
		
		return sb.toString();
	}

}
