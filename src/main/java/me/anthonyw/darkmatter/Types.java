package me.anthonyw.darkmatter;

public enum Types {
	
	BYTE(1, "byte"),
	
	CHAR(1, "char"),
	
	INT_16(2, "int16"),
	
	UINT_16(2, "uint16"),
	
	INT_32(4, "int32"),
	
	UINT_32(4, "uint32"),
	
	INT_64(8, "int64"),
	
	UINT_64(8, "uint64"),

	BOOLEAN(1, "boolean"),
	
	STRING(-1, "string");
	
	private final int typeSize;
	private final String keyword;
	
	private Types(int typeSize, String keyword) {
		this.typeSize = typeSize;
		this.keyword = keyword;
	}
	
	public int getTypeSize() {
		return typeSize;
	}
	
	public String getKeyword() {
		return keyword;
	}
	
}
