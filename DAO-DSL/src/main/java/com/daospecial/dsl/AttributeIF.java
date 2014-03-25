package com.daospecial.dsl;

public interface AttributeIF {
	public static final int _intType  		= 0;
	public static final int _stringType 	= 10;
	public static final int _doubleType 	= 20;
	public static final int _dateType		= 30;
	public static final int _timestampType 	= 31;
	
	public int getType();
	public String getValue();
}
