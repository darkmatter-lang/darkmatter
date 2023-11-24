package me.anthonyw.darkmatter.syntax.statement;

import me.anthonyw.darkmatter.TokenType;
import me.anthonyw.darkmatter.syntax.ExpressionNode;
import me.anthonyw.darkmatter.syntax.ScopeNode;

public class IfStatementNode extends StatementNode {
	
	private ExpressionNode expression;
	private ScopeNode scope;
	
	@Override
	public TokenType getType() {
		return TokenType.IF;
	}
	
}
