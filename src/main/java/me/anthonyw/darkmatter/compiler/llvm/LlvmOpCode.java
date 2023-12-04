package me.anthonyw.darkmatter.compiler.llvm;

public enum LlvmOpCode {
	
	// Terminator Instructions
	
	RETURN(0x01, "ret"),
	BR(0x02, "br"),
	SWITCH(0x03, "switch"),
	INVOKE(0x04, "invoke"),
	@Deprecated
	UNWIND(0x06, "unwind"),
	UNREACHABLE(0x07, "unreachable"),
    ADD(0x08, "add"),
    FADD(0x09, "fadd"),
    SUB(0x0A, "sub"),
    FSUB(0x0B, "fsub"),
    MUL(0x0C, "mul"),
    FMUL(0x0D, "fmul"),
    UDIV(0x0E, "udiv"),
    SDIV(0x0F, "sdiv"),
    FDIV(0x10, "fdiv"),
    UREM(0x11, "urem"),
    SREM(0x12, "srem"),
    FREM(0x13, "frem"),
	
    // Logical Operators
    SHL(0x14, "shl"),
    LSHR(0x15, "lshr"),
    ASHR(0x16, "ashr"),
    AND(0x17, "and"),
    OR(0x18, "or"),
    XOR(0x19, "xor"),
    
    // Memory Operators
    ALLOCA(0x1a, "alloca"),
    LOAD(0x1b, "load"),
    STORE(0x1c, "store"),
    GET_ELEMENT_PTR(0x1d, "getelementptr"),
    
    
    
    
    LANDING_PAD(0x3b, "landingpad");
	
	private final int opcode;
	private final String mnemonic;
	
	private LlvmOpCode(final int opcode, final String mnemonic) {
		this.opcode = opcode;
		this.mnemonic = mnemonic;
	}
	
	public int getOpCode() {
		return opcode;
	}
	
	public String getMnemonic() {
		return mnemonic;
	}
	
}
