## Attributes

Darkmatter offers an attributes system similar to Rust/C# or Java annotations.

Built-in attributes:

- [#[deprecated]](#deprecated) - Declare a Function as deprecated.

- [#[deprecated]](#deprecated) - Declare a Function as deprecated.
- [#[generate]](#generate) - Generates method getters or setters.
- [#[link]](#link) - FFI (foreign function interface) declarations.
- [#[override]](#override) - Overload a parent class' Method signature.


## Attributes Reference

### Deprecated

- [#[deprecated]](#deprecated)
  - `since` = The version of when this Function was first deprecated.
  - `message` = A message to show as to why this Function is deprecated.
  - `use` = Module path and Function, or Class to an alternative Function.



## Scoped Attributes

```dm
#[link( name = "testlib-1.0.0", language = "C" )]
module com.example {

    private struct Position {
        uint32 x;
        uint32 y;
    };

    public abstract class Animal {

        #[generate( get = public, set = public )]
        private mutable uint32 speed = 0;

        #[generate( get = public )]
        private string greeting;

        public Animal() {
            this.greeting = "Hi!";
        }

    }

    public class Rabbit inherits Animal {

        #[override]
        public string getGreeting() {
            return "*Thump*;
        }

    }



}
```
