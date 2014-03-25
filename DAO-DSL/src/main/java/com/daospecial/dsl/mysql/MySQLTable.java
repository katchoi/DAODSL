package com.daospecial.dsl.mysql;



import com.daospecial.dsl.BaseTable;
import com.daospecial.dsl.TableIF;
import com.daospecial.dsl.condition.Equals;
import com.daospecial.dsl.condition.In;

public class MySQLTable extends BaseTable {
	
	
	private StringBuilder sb;

	
	
	public MySQLTable(String name) {
		super();
		this.name = name;
		sb = new StringBuilder();
	}



	public String toSQL() {
		sb.append(select).append(cols).append(" from ").append(name);
		if ( where != null ) {
			sb.append(where).append(getConditions());
		}
			
		return sb.toString();
	}



	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TableIF table = new MySQLTable("test");
		
		table.select()
		.addColumn("c1")
		.addColumn("c2")
		.addColumn("c3")
		.where()
		.addCondition(new Equals("c1", "'Kat'").and(new In("c2", "('man', 'woman')")));
		System.out.println(table.toSQL());

	}
//.and(new In("c2", "(man, woman)"))
}
