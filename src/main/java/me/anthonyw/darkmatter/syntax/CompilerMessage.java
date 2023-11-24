package me.anthonyw.darkmatter.syntax;

public enum CompilerMessage {
	
	MISSING_STATEMENT_TERMINATOR(CompilerSeverity.ERROR, "statement.terminator.missing"),
	
	MISSING_SCOPE_OPEN(CompilerSeverity.ERROR, "scope.open.missing"),
	
	MISSING_SCOPE_CLOSE(CompilerSeverity.ERROR, "scope.close.missing"),
	
	VARIABLE_USELESS_REASSIGNMENT(CompilerSeverity.WARN, "variable.reassignment.useless"),
	
	VARIABLE_NAME_RESERVED(CompilerSeverity.ERROR, "variable.name.reserved"),
	
	VARIABLE_NAME_CONVENTION(CompilerSeverity.WARN, "variable.name.convention"),
	
	VARIABLE_IMMUTABLE_REASSIGNMENT(CompilerSeverity.ERROR, "variable.reassignment.immutable");
	
	private final CompilerSeverity severity;
	private final String i18n;
	
	private CompilerMessage(final CompilerSeverity severity, final String i18n) {
		this.severity = severity;
		this.i18n = i18n;
	}
	
	public CompilerSeverity getSeverity() {
		return severity;
	}
	
	public String i18n() {
		return i18n;
	}
	
}
