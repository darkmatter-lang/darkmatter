package me.anthonyw.darkmatter;

public enum Keywords {
	
	
	//
	// Scope Modifiers (container scope modifiers)
	//
	
	NAMESPACE(KeywordType.SCOPE_MODIFIER),
	
	PUBLIC(KeywordType.SCOPE_MODIFIER),
	
	PROTECTED(KeywordType.SCOPE_MODIFIER),
	
	PRIVATE(KeywordType.SCOPE_MODIFIER),
	
	
	//
	// Module types (container type)
	//
	
	STRUCT(KeywordType.MODULE_TYPE),
	
	CLASS(KeywordType.MODULE_TYPE),
	
	ENUM(KeywordType.MODULE_TYPE),
	
	INTERFACE(KeywordType.MODULE_TYPE),
	
	
	//
	// Functions / Loops / Etc
	//
	
	FUNCTION(KeywordType.SPECIAL),
	
	FOR(KeywordType.SPECIAL),
	
	WHILE(KeywordType.SPECIAL),
	
	CONTINUE(KeywordType.SPECIAL),
	
	BREAK(KeywordType.SPECIAL),
	
	RETURN(KeywordType.SPECIAL),
	
	MUTABLE(KeywordType.SPECIAL),

//  ?
//	/**
//	 * The variable will be bound to its parent container type and not be able to be instantiated
//	 */
//	STATIC(KeywordType.SPECIAL),

	
// All values are immutable by default.
//	/**
//	 * Constant (variable modifier)
//	 */
//	FINAL(KeywordType.SPECIAL),
	
	
	
	//
	// Data Types
	//
	
	VOID(KeywordType.DATA_TYPE),
	
	BYTE(KeywordType.DATA_TYPE),
	
	CHAR(KeywordType.DATA_TYPE),
	
	/**
	 * A signed 16-bit integer (2-byte, 16-bit integer) (i16)
	 */
	SHORT(KeywordType.DATA_TYPE),
	
	/**
	 * An unsigned 16-bit integer (2-byte, 16-bit integer) (u16)
	 */
	USHORT(KeywordType.DATA_TYPE),
	
	/**
	 * A signed 32-bit integer (4-byte, 32-bit integer) (i32)
	 */
	INT(KeywordType.DATA_TYPE),
	
	/**
	 * An unsigned 32-bit integer (4-byte, 32-bit integer) (u32)
	 */
	UINT(KeywordType.DATA_TYPE),
	
	/**
	 * A signed 64-bit integer (8-byte, 64-bit integer) (i64)
	 */
	LONG(KeywordType.DATA_TYPE),
	
	/**
	 * An unsigned 64-bit integer (8-byte, 64-bit integer) (u64)
	 */
	ULONG(KeywordType.DATA_TYPE),
	
	
	STRING(KeywordType.DATA_TYPE),
	
	
	
	/**
	 * A compile-time assigned data-type variable (constant/immutable).
	 */
	VAR(KeywordType.DATA_TYPE);
	
	private final KeywordType type;
	
	private Keywords(KeywordType type) {
		this.type = type;
	}
	
	public KeywordType getType() {
		return type;
	}
	
	
}
