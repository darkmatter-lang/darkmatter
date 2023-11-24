package me.anthonyw.darkmatter;

public class Tokenizer {
	
	
	
	
	/**
	 * Returns the precedence of a token.
	 * Returns -1 if the precedence does not matter.
	 * 
	 * @param type
	 * @return
	 */
	public int binaryPrecedence(TokenType type) {
		
		switch (type) {
		case PLUS:
		case MINUS:
			return 0;
		case ASTERISK:
		case SLASH:
			return 1;
		default:
			return -1;
		}
		
	}
	
	
}
