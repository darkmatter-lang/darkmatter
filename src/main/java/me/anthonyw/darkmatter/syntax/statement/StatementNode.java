package me.anthonyw.darkmatter.syntax.statement;

import me.anthonyw.darkmatter.TokenType;
import me.anthonyw.darkmatter.syntax.Node;

public class StatementNode extends Node {

	@Override
	public TokenType getType() {
		return TokenType.STATEMENT;
	}
	
}
