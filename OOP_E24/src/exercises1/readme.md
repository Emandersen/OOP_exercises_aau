# Chapter 1 self test
**1. What is bytecode and why is it important to Java’s use for Internet programming?** 

Bytecode is is a non-readable form of code which is generated for an interpreter to run. 
Its important due to its capability to be run on any platform able to run the interpreter for the given language 
the bytecode was designed for

**2. What are the three main principles of object-oriented programming?**

encapsulation, inheritance, and polymorphism.

**3. Where do Java programs begin execution?**

The main method

**4. What is a variable?**

A variable is a memory location, as in java a variable is defined by stating data type and variable name.

**5. Which of the following variable names is invalid?**

A. count

B. $count

C. count27

D. 67count

B and D are invalid

**6. How do you create a single-line comment? How do you create a multiline comment?**
```
Multiline /* */

Single line //
```
**7. Show the general form of the if statement. Show the general form of the for loop.**
```
if (condition) {
    Code
}
```
**8. How do you create a block of code?**
```
public static void main(String[] args) {

}
```
**9. The moon’s gravity is about 17 percent that of earth’s. Write a program that computes your effective weight on the moon.**
```
package exercises1;

import java.util.Scanner;

public class H_exercise_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your weight in kg: ");
        double weight = scanner.nextDouble();

        weight = weight * 0.165;

        System.out.println("Your weight on the moon is " + weight + " kg.");  
    }
}
```
[Moon Gravity Conversion Program](https://github.com/Emandersen/OOP_exercises_aau/blob/master/OOP_E24/src/exercises1/H_exercise_1.java)

**10. Adapt Try This 1-2 so that it prints a conversion table of inches to meters. Display 12 feet of conversions, inch by inch. Output a blank line every 12 inches. (One meter equals approximately 39.37 inches.)**

[Conversion Table program](https://github.com/Emandersen/OOP_exercises_aau/blob/master/OOP_E24/src/exercises1/H_exercise_2.java)


**11. If you make a typing mistake when entering your program, what sort of error will result?**

Compilation error

**12. Does it matter where on a line you put a statement?**

Generally it doesn't, Java uses ; to end statements

# Chapter 2 self test

**1. Why does Java strictly specify the range and behavior of its primitive types?**

Java strictly specifies the range and behavior of its primitive types to make sure it has predictable behavior across different environments.

**2. What is Java’s character type, and how does it differ from the character type used by some other programming languages?**

Java's character type is char, which is a 16-bit Unicode character, where other languages use 8-bit ASCII characters.

**3. A boolean value can have any value you like because any non-zero value is true. True or False?**

In Java, a boolean value can only be true or false, and it does not accept any non-zero value as true.

**4. Given this output,** 

**One**

**Two**

**Three**


**using a single string, show the println( ) statement that produced it.**

```
System.out.println("One\nTwo\nThree")
```

**5. What is wrong with this fragment?**

The variable is initalised inside the scope of the for loop and not outside of it, therefore it will not print anything in the console.

**6. Explain the difference between the prefix and postfix forms of the increment operator.**

Using Postfix on the statement í (i++) will return the value of i and then increment it
Using prefix on the statement i (++i) will increment i and then return the value

**7. Show how a short-circuit AND can be used to prevent a divide-by-zero error.**
Preventing Divide-By-Zero errors with Short-Circuit and A short-circuit. This will make sure division only happens if the denominator is non-zero, preventing errors.
```
if denominator != 0 and numerator / denominator > 1:
    print("Valid division")
```
If ```denominator == 0```, the division is skipped, avoiding a divide-by-zero error.

**8. In an expression, what type are byte and short promoted to?**

- If either operand is of type double, the other is converted to double.
- Otherwise, if either operand is of type float, the other is converted to float.
- Otherwise, if either operand is of type long, the other is converted to long.
- Otherwise, both operands are converted to type int.

**9. In general, when is a cast needed?**

When converting one data type to another as an example the string "1" to an inter

**10. Write a program that finds all of the prime numbers between 2 and 100.**

[Prime Number Checker](https://github.com/Emandersen/OOP_exercises_aau/blob/master/OOP_E24/src/exercises1/G_exercise.java)

**11. Does the use of redundant parentheses affect program performance?**

The expression will be simplified by the compiler thus not making an impact.

**12. Does a block define a scope?**

Yes.


# Chapter 3 self test
### todo
**1. Write a program that reads characters from the keyboard until a period is received. Have the program count the number of spaces. Report the total at the end of the program.**

**2. Show the general form of the if-else-if ladder.**

```
if (condition) {
    code snippet 1
} else if (condition) {
    code snippet 2
} else { 
    code snippet 3
}
```

**3. Given (Look in the book) to what if does the last else associate?**

the "```if (x < 10) { ```" statement

**4. Show the for statement for a loop that counts from 1000 to 0 by –2.**
```for (int i = 1000; i >= 0; i -= 2)```

**5. Is the following fragment valid?**

It is invalid since the integer i is defined inside the scope of the for loop

**6. Explain what break does. Be sure to explain both of its forms.**

Exits a loop or a switch prematurely

**7. In the following fragment, after the break statement executes, what is displayed?**

The while loop is broken so the forloop will print "after while" 10 times and then the snippet would print "after for" a single time

**8. What does the following fragment print?**



**9. The iteration expression in a for loop need not always alter the loop control variable by a fixed amount. Instead, the loop control variable can change in any arbitrary way. Using this concept, write a program that uses a for loop to generate and display the progression 1, 2, 4, 8, 16, 32, and so on.**
```
public class PowerOfTwo {
    public static void main(String[] args) {
        int numTerms = 7;
        int value = 1;

        for (int i = 0; i < numTerms; i++) {
            System.out.println(value);
            value *= 2;
        }
    }
}
```

**10. The ASCII lowercase letters are separated from the uppercase letters by 32. Thus, to convert a lowercase letter to uppercase, subtract 32 from it. Use this information to write a program that reads characters from the keyboard. Have it convert all lowercase letters to uppercase, and all uppercase letters to lowercase, displaying the result. Make no changes to any other character. Have the program stop when the user enters a period. At the end, have the program display the number of case changes that have taken place.**

**11. What is an infinite loop?**

A loop that doesn't have any way to end

**12. When using break with a label, must the label be on a block that contains the break?**
