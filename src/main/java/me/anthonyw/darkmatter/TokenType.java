package me.anthonyw.darkmatter;

public enum TokenType {
	
	BACKTICK("`"),
	
	TILDA("~"),
	
	EXCLAIMATION_MARK("!"),
	
	AT("@"),
	
	OCTOTHROPE("#"),
	
	DOLLAR("$"),
	
	PERCENT("%"),
	
	CIRCUMFLEX_ACCENT("^"),
	
	AMPERSAND("&"),
	
	ASTERISK("*"),
	
	OPEN_PARENTHESIS("("),
	
	CLOSE_PARENTHESIS(")"),
	
	UNDERSCORE("_"),
	
	MINUS("-"),
	
	EQUALS("="),
	
	PLUS("+"),
	
	OPEN_BRACKET("["),
	
	CLOSE_BRACKET("]"),
	
	OPEN_BRACE("{"),
	
	CLOSE_BRACE("}"),
	
	BACKSLASH("\\"),
	
	PIPE("|"),
	
	SEMICOLON(";"),
	
	COLON(":"),
	
	QUOTE("'"),
	
	DOUBLE_QUOTE("\""),
	
	COMMA(","),
	
	OPEN_ANGLE_BRACKET("<"),
	
	CLOSE_ANGLE_BRACKET(">"),
	
	DOT("."),
	
	SLASH("/"),
	
	QUESTION_MARK("?"),
	
	SPACE(" "),
	
	TAB("\t"),
	
	NULL("\0"),
	
	
	//
	//
	// Language spec
	//
	//
	
	EXIT,
	
	LITERAL_INTEGER,
	
	LITERAL_CHARACTER,
	
	LITERAL_STRING,
	
	LITERAL_BOOLEAN,
	
	LET("let"),
	
	FUNCTION("function"),
	
	FOR("for"),
	
	WHILE("while"),
	
	CONTINUE("continue"),
	
	BREAK("break"),
	
	SWITCH("switch"),
	
	CASE("case"),
	
	RETURN("return"),
	
	MUTABLE("mutable"),
	
	// Scope modifiers
	
	/**
	 * A module/namespace.
	 */
	MODULE("module"),
	
	PUBLIC("public"),
	
	PRIVATE("private"),
	
	PROTECTED("protected"),
	
	// Module/Container types
	
	STRUCT("struct"),
	
	CLASS("class"),
	
	ENUM("enum"),
	
	INTERFACE("interface"),
	
	STATEMENT,
	
	IF("if"),
	
	SCOPE;
	
	private String value;
	
	private TokenType() {
		this.value = null;
	}
	
	private TokenType(String value) {
		this.value = value;
	}
	
	public String getTokenValue() {
		return value;
	}
	
}
