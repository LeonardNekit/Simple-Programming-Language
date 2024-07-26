# Simple-Programming-Language
Educational programming language.  This language includes the output of text/numbers, as well as performing arithmetic tasks
# Scheme of work
command(interface) -> Logic(class) ~> kprint ~> print;
Lang(package) -> Compiler(class) ~> Logic -> start()(method).
# Syntax
``
package Lang;
class Compiler extends Logic{
    void start(){
        print("hello word!");
    }
}
``
# Run 
java src/Lang/test.java
