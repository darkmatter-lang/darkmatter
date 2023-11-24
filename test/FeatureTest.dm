#!/bin/acc -i

// a shebang may be specified at the very beginning of the file if so desired.

// this file may have multiple "modules" or namespaces.

// this will make it so you don't have to type
// #[system.macro.Generate(system.macro.Generate.get, system.macro.Generate.set)]
import system.macro.Generate;
// or
//import system.macro.*;


/*
system.process.exit(0);
system.process.
*/

namespace example {

	public abstract class Fruit {

	}

	public final class Apple inherits Fruit {

		#[generate(get,set)]
		private int x;
		#[generate_get]
		private int y;
		#[generate_get_set]
		private mutable int weight;

		private string line;

		public Box(int x, int y) {
			this.x = x;
			this.y = y;
			this.weight = 0;

			// String repeat
			// "----------------"
			this.line = "-" * 16;


		}


		#[override]
		public ArithmeticOperators<?> _add(ArithmeticOperators<?> rhs) {
			return this.weight += rhs.weight;
		}

		public final void notOverrideable() {
			
		}


	}



	//
	public uint32 main(string[] args) {
		return 0;
	}












	// =========
	// Functions
	// =========

	// Functions are the most basic procedure in the "A" programming language.
	// You can define all kinds of functions, give them scope, and what not.



	// Lambdas

	Function<int, int> multiply = (a, b) -> { a * b };
	multiply(2, 4); // 8

	Function newLine = () -> { Console.println(); };














	//
	// Methods
	//
 
	// Methods are basically just Functions that are within a Class Object
	// sometimes with special rules and scopes.
















	//
	// FFI
	//

	// The FFI (foreign function interface) can be utilized to perform or receive external
	// function calls from other programming languages.
	//
	// Any Function or Method signature may use the `foreign` keyword.
	// 
	// Calls from other languages to Darkmatter requires the following:
	//   - Function scope to be `public`.
	//   - Method must have the `public` and `static` modifiers.
	//   - ~~Must have the Attribute #[no_mangle].~~ (not be needed as the compiler will not mangle any Functions/Methods with the `foreign` modifier.)
	//
	// Calls to other languages from Darkmatter requires the following:
	//   - The foreign function must be accessible.
	//   - The current scope or Function/Method declaration to use the #[link] Attribute.
	//

	// Calling C from Darkmatter:
	#[link( name = "libtest-0.1.0", language = "C" )] // libtest-0.1.0.so, libtest-0.1.0.dylib, libtest-0.1.0.dll
	public foreign uint64 getLocalTime(boolean inUTC) -> "get_local_time";

	// Calling Java from Darkmatter:
	// Note: the resulting lib/bin will be larger because it includes a JVM implementation
	#[link( name = "javatest-0.1.0", language = "Java" )] // javatest-0.1.0.jar or javatest-0.1.0.class
	public foreign void printWords(string words) -> "printWords";

	// Calling Darkmatter from C:
	public foreign uint32 myAdd(uint32 a, uint32 b) {
		return a + b;
	}

	/*
		If you have a group of functions (or methods) that are part of the same library
		and you don't want to keep writing the #[link] Attribute for each one, you can
		use a Scoped Attribute instead.

		Example:

		import com.example.*;

		#![link( name = "libtest-0.1.0", language = "C" )]
		module com.example {
			// do stuff
		}
	*/




}
