# Darkmatter

A programming language from another universe.

This is the official darkmatter compiler/linker, it outputs LLVM IR (IL-ASM) and compiles directly to x86, aarch64, etc.

Darkmatter language adopts a flat-style texture of a blackhole as its official logo and adopts the color `#00FFFF` (cyan) as its "language color."



I wanted to write a language that was just that, a language.
Some languages these days claim to be "more efficient" by abreviating things,
however, I find that to make the code confusing and messy.

As even Rust-lang states, most time is spent reading code and refactoring it rather than writing it explicitly.

So the intent with this language is to be readable and easy to understand.




The darkmatter compiler also has a `-I` immediate-interpretation mode which will evaluate the code within the JVM.

### Roadmap

Syntax
- [ ] Unsigned primitives
- [ ] Operator overloading
- [ ] Scopes / Contexts
- [ ] Functions (non-class) and Methods (class)
- [ ] Structs
- [ ] Reference Operators
- [ ] Parser
- [ ] Tokenizer
- [ ] AST
- [ ] FFI

Compiler
- [ ] Add `-I` interpreter mode.
- [ ]

Standard Libraries
- [ ] core
  - [ ] system
  - [ ] types
  - [ ] 
- [ ] cli
- [ ] graphics
- [ ] audio
- [ ] network
- [ ] ffi


Package Manager (`tesseract`)
- [ ] CLI Tools
  - [ ] Source-code Generator `tess --generate gen-config.json`
- [ ] Read `project.toml`


### Specification

- Directly compiled language, no JIT.
- Can output a static/shared library (.so/.dll/.dylib) or executable (ELF/PE/MACH-O).
- Similar to Java/C# syntax.
- RAII (no Garbage Collector)?



#### In the darkmatter language, all variables are:

- Statically typed.
- Immutable by default.



### Logging

#### Logging Levels

The default logging levels are as follows:
- `TRACE` Most verbose, all debug messages will be shown including internal process states.
- `DEBUG` Verbose debugging messages will be shown, may contain sensitive information.
- `INFO` Normal, only informational messages will be shown.
- `WARN` Only warning messages will be shown along with errors.
- `ERROR` Strictly only error messages will be shown.


#### Console Logging

Console logging is always enabled but can be limited to only showing certain messages tagged with specific severities such as `WARN` OR `ERROR`.

This is by-design.


#### File Logging

File logging can be enabled by either passing in a valid file path as to where logs will be stored, by setting the environment variable `LOG_FILE` to a valid path, or by configuring this via the Java API.


