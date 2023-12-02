package me.anthonyw.darkmatter.compiler.llvm;

public enum LlvmOpCode {
	
	COMMENT(";"),
	
	RETURN("ret"),
	
	BR("br"),
	
	SWITCH("switch"),
	
	INVOKE("invoke"),
	
	UNWIND("unwind"),
	
	UNREACHABLE("unreachable"),
	
	
	// BINARY
	
	
	/**
	 * Addition
	 * 
	 * Description:
	 * <p>
	 * The 'add' instruction returns the sum of its two operands.
	 * </p>
	 * 
	 * Example:
	 * <p>
	 * {result} = add {type} {var1} {var2}
	 * {result} = add i32 4, %var
	 * </p>
	 */
	ADD("add"),
	
	/**
	 * Subtraction
	 * 
	 * <p>
	 * The value produced is the integer or floating point difference of the two operands.
	 * </p>
	 * 
	 * <result> = sub <type> <var1> <var2>
	 * <result> = sub i32 4, %var
	 */
	SUBTRACT("sub"),
	
	/**
	 * Multiply
	 * 
	 * <p>
	 * The value produced is the integer or floating point product of the two operands.
	 * Because the operands are the same width, the result of an integer multiplication is the same whether the operands should be deemed unsigned or signed.
	 * </p>
	 * 
	 * <result> = mul i32 4, %var
	 */
	MULTIPLY("mul"),
	
	/**
	 * Unsigned division
	 * 
	 * <result> = udiv <type> <var1>, <var2>
	 */
	DIVISION_UNSIGNED("udiv"),
	
	
	/**
	 * Signed division
	 * 
	 * <p>
	 * The value produced is the unsigned integer quotient of the two operands.
	 * This instruction always performs an unsigned division operation, regardless of whether the arguments are unsigned or not.
	 * </p>
	 * 
	 * <result> = sdiv <type> <var1>, <var2>
	 */
	DIVISION_SIGNED("sdiv");
	
	private final String opcode;
	
	private LlvmOpCode(final String opcode) {
		this.opcode = opcode;
	}
	
	public String getOpCode() {
		return opcode;
	}
	
}
