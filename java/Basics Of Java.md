#### **Introduction:**

**\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_**



&#x09;**Java is one of the most popular and widely used programming languages in the world. It was developed by James Gosling and his team at Sun Microsystems in the early 1990s with the goal of creating a platform-independent programming language.**

&#x09;Java is a high-level, class-based, and object-oriented programming language widely used for developing web, desktop, and enterprise applications. It follows the “Write Once, Run Anywhere” (WORA) principle, allowing Java programs to run on any platform with a Java Virtual Machine (JVM).

* Platform-independent language supported by the JVM.
* Provides object-oriented features such as inheritance, polymorphism, and encapsulation.
* Known for its security, portability, and robust memory management.



###### **Java Development Environment :**

&#x09;The Java Development Environment is required to compile and run Java programs on a system. It involves installing the JDK and configuring environment variables like PATH and JAVA\_HOME so the system can access Java tools properly. environment variables (such as PATH and JAVA\_HOME).



The development environment of Java consists of three components mainly:



* JVM (Java Virtual Machine): 

&#x09;JVM is the engine that executes Java programs. It converts Java bytecode into machine code that the operating system can understand.

* JRE (Java Runtime Environment): 

&#x09;JRE provides the environment required to run Java applications. It includes JVM and the necessary libraries and supporting files.

* JDK (Java Development Kit): 

&#x09;JDK is used for developing Java applications. It includes JRE along with development tools such as the Java compiler and debugger.

###### 

###### **Java Basic Syntax :**

**-----------------------**

class name

{

&#x09;public static void main(Sting\[] args)

&#x09;{

&#x09;	//code to execute 

&#x09;}

}

**Breakdown of Each Keyword:**

* **public** (Access Modifier): This makes the method globally accessible. It must be public so the JVM (which lives outside your program's specific class) has permission to find and invoke it.
* **static** (Keyword): This means the method belongs to the class itself, rather than an object instance of the class. It allows the JVM to call the main method directly without wasting memory to create an object first.
* **void** (Return Type): This indicates that the method does not return any value back to the system once it finishes running.

**main** (Method Name): This is not a Java keyword, but it is the strictly configured identifier that the JVM is programmed to search for to kick off execution.

* **String\[] args** (Parameter): This defines an array of text strings (arguments). It allows you to pass custom configuration settings or data into your program from the terminal/command line at the exact moment you run it.

Example:

\--------

class Example

{

&#x09;public static void main(String\[] args)

&#x09;{

&#x09;	System.out.println("Hello World");

&#x09;}

}



###### **Comments in Java :**

**----------------------**

&#x09;Comments in Java are notes written inside the code that are ignored by the compiler. They are used to improve code readability, explain logic, and make programs easier to maintain.

**Types of Comments in Java :**

* **Single-line Comment (//):** Used for writing a comment in a single line.
* **Multi-line Comment (/\* \*/):** Used for writing comments across multiple lines.
* **Documentation Comment (/\*\* \*/):** Used to generate official Java documentation using Javadoc.

Example:

\--------

public class CommentsExample {

&#x20;   public static void main(String\[] args) {

&#x20;       // This is a single-line comment

&#x20;       System.out.println("Hello, World"); // Comment at end of line



&#x20;       /\*

&#x20;        \* This is a multi-line comment

&#x20;        \* It can span across multiple lines

&#x20;        \*/

&#x20;       int x = 10;  // Variable declaration



&#x20;       /\*\*

&#x20;        \* This is a documentation comment (Javadoc)

&#x20;        \* It is used to generate documentation for methods, classes, etc.

&#x20;        \*/

&#x20;       System.out.println("Value of x: " + x);

&#x20;   }

}



###### **Data Types in Java :**

**------------------------**

In Java, data types specify the type of values a variable can hold. They define the size, range and nature of data stored in memory. Java has two main categories of data types:

* **Primitive:** byte(1), short(2), int(4), long(8), float(4), double(8), char(2), boolean(1)
* **Non-Primitive:** String, Arrays, Classes, Interfaces, Objects

###### 

###### **Variables in Java :**

**-----------------------**

Variables are containers to store data in memory. Each variable has a name, type and value. It is the basic unit of storage in a program. Java has 4 types of variables.

* **Local Variables:** Declared inside a method, constructor, or block. Accessible only within that block.
* **Instance Variables:** Declared inside a class but outside any method. Each object of the class has its own copy.
* **Static Variables:** Declared with the static keyword inside a class. Shared by all objects of the class.
* **Final Variables:** Declared with final keyword. Value cannot be changed once assigned.

Example:

\--------

public class VariablesDemo {



&#x20;   // Instance variable (belongs to each object)

&#x20;   int instanceVar = 10;



&#x20;   // Static variable (shared across all objects of the class)

&#x20;   static String staticVar = "I am static";



&#x20;   public void showVariables()

&#x20;   {

&#x20;       // Local variable (declared inside a method)

&#x20;       int localVar = 5;



&#x20;       System.out.println("Instance Variable: "+ instanceVar);

&#x20;       System.out.println("Static Variable: " + staticVar);

&#x20;       System.out.println("Local Variable: " + localVar);

&#x20;   }



&#x20;   public static void main(String\[] args)

&#x20;   {

&#x20;       // Creating object

&#x20;       VariablesDemo obj1 = new VariablesDemo();

&#x20;       obj1.showVariables();



&#x20;       // Accessing static variable directly using class name

&#x20;       System.out.println("Accessing Static Variable via class: "+ VariablesDemo.staticVar);

&#x20;   }

}

**Output:**

**-------**

Instance Variable: 10

Static Variable: I am static

Local Variable: 5

Accessing Static Variable via class: I am static



###### **Java Keywords List :**

**-------------------------**

Java keywords are reserved words that have predefined meanings in the language. They cannot be used as identifiers (like variable or method names).

As there are 52 keywords, categorized below by their usage and purpose.

###### **1.Data Type Keywords**								

Used to define variable types and specify the kind of data they can hold.	   

&#x20;   **Keyword	-> Usage**							

* **boolean	->** Defines a variable that holds true or false.			
* **byte		->** Defines an 8-bit signed integer.				
* **char		->** Defines a 16-bit Unicode character.				
* **short	->** Defines a 16-bit signed integer.				
* **int		->** Defines a 32-bit signed integer.				
* **long		->** Defines a 64-bit signed integer.				
* **float	->** Defines a 32-bit floating-point number.			
* **double	->** Defines a 64-bit floating-point number.			
* **void		->** Specifies that a method does not return any value.	

###### **2.Control Flow Keywords**

Used to control the execution flow of a program, including loops, branching, 										and jumps.

&#x20;  **Keyword    ->   Usage**

* **if	      ->**   Executes code when a condition is true.
* **else	      ->**   Defines an alternate block when an if condition is false.
* **switch     ->**  Selects one block of code among multiple options.
* **case	      ->**   Defines an individual branch in a switch statement.
* **default    ->**   Defines the block executed if no case matches.
* **for	      ->**   Starts a for loop.
* **while     ->**    Starts a while loop.
* **do	     ->**    Starts a do-while loop.
* **break     ->**	   Terminates the nearest loop or switch.
* **continue  ->**	   Skips to the next iteration of a loop.
* **return    ->**	   Exits from a method and optionally returns a value.

###### **3.Exception Handling Keywords**

Used for handling and managing runtime errors in programs.

&#x20;   **Keyword  ->	Usage**

* **try	     ->** Defines a block of code to test for exceptions.
* **catch     ->**	Defines a block to handle exceptions thrown by try.
* **finally   ->**	Defines a block that always executes after try and catch.
* **throw     ->**	Used to manually throw an exception.
* **throws    ->**	Declares the exceptions a method can throw.
* **assert    ->**	Tests assumptions during program execution for debugging.

###### **4.Object-Oriented Keywords**

Used to define classes, interfaces, and objects, as well as inheritance and encapsulation properties.

&#x20; **Keyword	->  Usage**

* **class	->**  Declares a class.
* **interface    ->**  Declares an interface.
* **extends	->**  Indicates inheritance from a superclass.
* **implements   ->**  Indicates that a class implements an interface.
* **new	        ->**  Creates new objects.
* **this	        ->**  Refers to the current object.
* **super	->**  Refers to the superclass of the current object.
* **abstract     ->**  Declares a class or method that must be implemented in a subclass.
* **final	->**  Prevents inheritance, overriding, or modification.
* **static	->**  Declares class-level variables or methods.
* **sealed	->**  Restricts which classes can extend a given class.
* **permits	->**  Specifies the subclasses allowed to extend a sealed class.
* **Enum        ->**  Declares a fixed set of constants.
* **record      ->**  Declares an immutable data class (Java 16+).
* **instanceof**  ->  Checks whether an object is of a specific type.

###### **5.Access Control \& Others Keywords**

Define the visibility or accessibility of classes, methods, and variables.

&#x20;  **Keyword	->   Usage**

* public	-> Accessible from anywhere in the program.
* protected	-> Accessible within the same package or by subclasses.
* private	-> Accessible only within the same class.
* package	-> Defines a namespace for classes.
* import	-> Allows access to classes from other packages.
* synchronized	-> Defines critical sections that only one thread can access at a time.
* volatile	-> Indicates that a variable may change asynchronously.



##### **Operators in Java:**

**----------------------------**

Operators are symbols that perform specific operations on one or more operands (variables or values). They are used to perform calculations, comparisons, logical operations and manipulate data.



They are basically of 7 types:



* **Arithmetic Operators (+, -, \*, /, %) 		–>** Used to perform mathematical calculations on numeric values.
* **Relational Operators (==, !=, >, <, >=, <=) 		–>** Used to compare two values and return a boolean result.
* **Logical Operators (\&\&, ||, !) 			–>** Used to combine or reverse boolean conditions.
* **Assignment Operators (=, +=, -=, \*=, /=, %=) 	–>** Used to assign and update variable values.
* **Increment/Decrement Operators (+, -, ++, --, !) 			–>** Used to perform operations on a single operand.
* **Conditional Operator (condition ? value\_if\_true : value\_if\_false) –>** Used as a shorthand for the if-else statement.
* **Bitwise Operators (\&, |, ^, \~, <<, >>, >>>) 		–>** Used to perform operations on binary bits of integer values.



##### **Decision Making (Control Statements) in Java:**

**-----------------------------------------------------------------------**

Decision-making (or control statements) are used to execute different blocks of code based on certain conditions. They allow a Java program to choose a path of execution depending on whether a condition is true or false.



* if: Executes a block if a condition is true.

Syntax:

if(Condition)

{

&#x09;Block of code;

}

* if-else: Chooses between two blocks based on a condition.

Syntax:

if(Condition)

{

&#x09;Block of code;

}

else

{

&#x09;Block of code;

}

* if-else if-else: Tests multiple conditions sequentially.

Syntax:

if(Condition)

{

&#x09;Block of code;

}

else if(Condition)

{

&#x09;Block of code;

}

|

|

else

{

&#x09;Block of code;

}

* switch: Selects one block from multiple options based on a variable’s value.

Syntax:

Switch(Condition)

{

&#x09;case 1: statement;

&#x09;        break;

&#x09;case 2: statement;

&#x09;        break;

&#x09;case 3: statement;

&#x09;        break;

&#x09;    |

&#x09;    |

&#x09;case n: statement;

&#x09;        break;

&#x09;default : statement;

}

##### **Loops in Java:**

**----------------------**

Loops are control statements in Java that allow a block of code to be executed repeatedly as long as a specified condition is true. They help in reducing code repetition.



There are 4 types of loops in Java.



* for: Used when the number of iterations is known.

Syntax:

for(initialize ,Condition ,increment/decrement)

{

&#x09;Statement;



}

* while: Used when the number of iterations is not known in advance, condition checked before each iteration.

Syntax:

while(Condition)

{

&#x09;Statements;

}

* do-while: Similar to while loop, but condition is checked after executing the block (executes at least once).

Syntax:

do

{

&#x09;Statements;

}while(Condition);

* for-each: Used to iterate over arrays and collections.

