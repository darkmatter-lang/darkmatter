package me.anthonyw.darkmatter.syntax;

import java.util.ArrayList;
import java.util.List;

import me.anthonyw.darkmatter.TokenType;
import me.anthonyw.darkmatter.syntax.statement.StatementNode;

public class ScopeNode extends Node {
	
	private List<StatementNode> statements;

	public ScopeNode() {
		this.statements = new ArrayList<>();
	}
	
	@Override
	public TokenType getType() {
		return TokenType.SCOPE;
	}
	
}
