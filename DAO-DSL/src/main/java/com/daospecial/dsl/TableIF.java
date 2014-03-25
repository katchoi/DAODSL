package com.daospecial.dsl;

import java.sql.ResultSet;
import java.util.List;

public interface TableIF extends SQLElement {
	
	public TableIF join(TableIF t);
	public TableIF on(ConditionIF cond);
	
	public TableIF select();
	public TableIF where();
	public TableIF addColumn(List<ColumnIF> cols);
	public TableIF addColumn(ColumnIF col);
	public TableIF addColumn(String col);
	public TableIF addCondition(ConditionIF cond);
	
	public ResultSet getResultSet();
	
	public TableIF insert();
	public TableIF addValue(List<String> values);
	public TableIF addValue(String value);
	
	

}
