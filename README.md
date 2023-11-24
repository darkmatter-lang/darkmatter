[![build](https://img.shields.io/github/actions/workflow/status/darkmatter-lang/darkmatter/ci.yml?branch=master)](https://github.com/darkmatter-lang/darkmatter/actions/workflows/ci.yml)
[![license](https://img.shields.io/badge/License-MIT-blue.svg)](https://opensource.org/licenses/MIT)

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

## Roadmap

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


## Specification

- Directly compiled language, no JIT.
- Can output a static/shared library (.so/.dll/.dylib) or executable (ELF/PE/MACH-O).
- Similar to Java/C# syntax.
- RAII (no Garbage Collector)?

### In the darkmatter language, all variables are:

- Statically typed.
- Immutable by default.

## Logging

### Logging Levels

The default logging levels are as follows:
- `TRACE` Most verbose, all debug messages will be shown including internal process states.
- `DEBUG` Verbose debugging messages will be shown, may contain sensitive information.
- `INFO` Normal, only informational messages will be shown.
- `WARN` Only warning messages will be shown along with errors.
- `ERROR` Strictly only error messages will be shown.

### Console Logging

Console logging is always enabled but can be limited to only showing certain messages tagged with specific severities such as `WARN` OR `ERROR`.

This is by-design.

### File Logging

File logging can be enabled by either passing in a valid file path as to where logs will be stored, by setting the environment variable `LOG_FILE` to a valid path, or by configuring this via the Java API.

## Getting Help

Are you having trouble with Darkmatter? We want to help!

- If you are upgrading, read the release notes for upgrade instructions and "new and noteworthy" features.

- Ask a question we monitor stackoverflow.com for questions tagged with darkmatter. You can also talk with the community on X.

- Report bugs with Darkmatter at [https://github.com/darkmatter-lang/darkmatter/issues](https://github.com/darkmatter-lang/darkmatter/issues).

- Join the Discussion on X and be part of the community [https://twitter.com/i/communities/1727990925480079392](https://twitter.com/i/communities/1727990925480079392)

## Reporting Issues

Darkmatter uses GitHub’s integrated issue tracking system to record bugs and feature requests. If you want to raise an issue, please follow the recommendations below:

- Before you log a bug, please search the issue tracker to see if someone has already reported the problem.

- If the issue doesn’t already exist, create a new issue.

- Please provide as much information as possible with the issue report. We like to know the Darkmatter version, operating system etc you’re using.

- If you need to paste code or include a stack trace, use Markdown. ``` escapes before and after your text.

- If possible, try to create a test case or project that replicates the problem and attach it to the issue.

## Contributors

The following contributors have either helped to start this project, have contributed
code, are actively maintaining it (including documentation), or in other ways
being awesome contributors to this project. **We'd like to take a moment to recognize them.**

[<img src="https://github.com/anthonywww.png?size=72" alt="anthonywww" width="72">](https://github.com/anthonywww)
[<img src="https://github.com/mjovanc.png?size=72" alt="mjovanc" width="72">](https://github.com/mjovanc)

## License

The MIT License.
