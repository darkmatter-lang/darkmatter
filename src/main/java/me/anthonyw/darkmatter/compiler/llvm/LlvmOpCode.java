package me.anthonyw.darkmatter.compiler.llvm;

public enum LlvmOpCode {
	
	// Terminator Instructions
	RETURN(0x01, "ret"),                         // 01
	BR(0x02, "br"),                              // 02
	SWITCH(0x03, "switch"),                      // 03
	INDIRECT_BR(0x04, "indirectbr"),             // 04
	INVOKE(0x05, "invoke"),                      // 05
	@Deprecated
	UNWIND(0x06, "unwind"),                      // 06
	UNREACHABLE(0x07, "unreachable"),            // 07
	ADD(0x08, "add"),                            // 08
	FADD(0x09, "fadd"),                          // 09
	SUB(0x0a, "sub"),                            // 10
	FSUB(0x0b, "fsub"),                          // 11
	MUL(0x0c, "mul"),                            // 12
	FMUL(0x0d, "fmul"),                          // 13
	UDIV(0x0e, "udiv"),                          // 14
	SDIV(0x0f, "sdiv"),                          // 15
	FDIV(0x10, "fdiv"),                          // 16
	UREM(0x11, "urem"),                          // 17
	SREM(0x12, "srem"),                          // 18
	FREM(0x13, "frem"),                          // 19
	
	// Logical Operators
	SHL(0x14, "shl"),                            // 20
	LSHR(0x15, "lshr"),                          // 21
	ASHR(0x16, "ashr"),                          // 22
	AND(0x17, "and"),                            // 23
	OR(0x18, "or"),                              // 24
	XOR(0x19, "xor"),                            // 25
	
	// Memory Operators
	ALLOCA(0x1a, "alloca"),                      // 26
	LOAD(0x1b, "load"),                          // 27
	STORE(0x1c, "store"),                        // 28
	GET_ELEMENT_PTR(0x1d, "getelementptr"),      // 29
	
	// Cast Operators
	TRUNC(0x1e, "trunc"),                        // 30
	ZEXT(0x1f, "zext"),                          // 31
	SEXT(0x20, "sext"),                          // 32
	FP_TO_UI(0x21, "fptoui"),                    // 33
	FP_TO_SI(0x22, "fptosi"),                    // 34
	UI_TO_FP(0x23, "uitofp"),                    // 35
	SI_TO_FP(0x24, "sitofp"),                    // 36
	FP_TRUNC(0x25, "fptrunc"),                   // 37
	FPEXT(0x26, "fpext"),                        // 38
	PTRTOINT(0x27, "ptrtoint"),                  // 39
	INTTOPTR(0x28, "inttoptr"),                  // 40
	BITCAST(0x29, "bitcast"),                    // 41
	
	// Other Operators
	ICMP(0x2a, "icmp"),                          // 42
	FCMP(0x2b, "fcmp"),                          // 43
	PHI(0x2c, "phi"),                            // 44
	CALL(0x2d, "call"),                          // 45
	SELECT(0x2e, "select"),                      // 46
	USER_OP1(0x2f, "userop1"),                   // 47
	USER_OP2(0x30, "userop2"),                   // 48
	AARG(0x31, "aarg"),                          // 49
	EXTRACT_ELEMENT(0x32, "extractelement"),     // 50
	INSERT_ELEMENT(0x33, "insertelement"),       // 51
	SHUFFLE_VECTOR(0x34, "shufflevector"),       // 52
	EXTRACT_VALUE(0x35, "extractvalue"),         // 53
	INSERT_VALUE(0x36, "insertvalue"),           // 54
	
	// Atomic Operators
	FENCE(0x37, "fence"),                        // 55
	ATOMIC_CMP_XCHG(0x38, "atomiccmpxchg"),      // 56
	ATOMIC_RMW(0x39, "atomicrmw"),               // 57
	
	// Exception Handling Operators
	RESUME(0x3a, "resume"),                      // 58
	LANDING_PAD(0x3b, "landingpad");             // 59
	
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
