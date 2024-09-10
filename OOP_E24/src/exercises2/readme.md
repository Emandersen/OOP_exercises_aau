# Chapter 4 Self Check

**1. What is the difference between a class and an object?**

**2. How is a class defined?**

**3. What does each object have its own copy of?**

**4. Using two separate statements, show how to declare an object called counter of a class called MyCounter.**

**5. Show how a method called myMeth( ) is declared if it has a return type of double and has two int parameters called a and b.**

**6. How must a method return if it returns a value?**

**7. What name does a constructor have?**

**8. What does new do?**

**9. What is garbage collection, and how does it work?**

**10. What is this?**

**11. Can a constructor have one or more parameters?**

**12. If a method returns no value, what must its return type be?**



# Chapter 5 Self Check

**1. Show two ways to declare a one-dimensional array of 12 doubles.**

**2. Show how to initialize a one-dimensional array of integers to the values 1 through 5.**

**3. Write a program that uses an array to find the average of 10 double values. Use any 10 values you like.**

**4. Change the sort in Try This 5-1 so that it sorts an array of strings. Demonstrate that it works.**

**5. What is the difference between the String methods indexOf( ) and lastIndexOf( )?**

**6. Since all strings are objects of type String, show how you can call the length( ) and charAt( ) methods on this string literal: 'I like Java'.**

**7. Expanding on the Encode cipher class, modify it so that it uses an eight-character string as the key.**

**8. Can the bitwise operators be applied to the double type?**

**9. Show how this sequence can be rewritten using the ? operator.**

´´´
if (x < 0) y = 10;
else y = 20;
´´´

**10. In the following fragment, is the & a bitwise or logical operator? Why?**

´´´ 
boolean a, b;
// ...
if (a & b)
´´´

**11. Is it an error to overrun the end of an array? Is it an error to index an array with a negative value?**

**12. What is the unsigned right-shift operator?**

**13. Rewrite the MinMax class shown earlier in this chapter so that it uses a for-each style for loop.**

**14. Can the for loops that perform sorting in the Bubble class shown in Try This 5-1 be converted into for-each style loops? If not, why not?**

**15. Can a String control a switch statement?**

**16. What type name is reserved for use with local variable type inference?**

**17. Show how to use local variable type inference to declare a boolean variable called done that has an initial value of false.**

**18. Can var be the name of a variable? Can var be the name of a class?**

**19. Is the following declaration valid? If not, why not.**

´´´var[] avgTemps = new double[7]; ´´´

**20. Is the following declaration valid? If not, why not?**

´´´var alpha = 10, beta = 20;´´´

**21. In the show( ) method of the ShowBits class developed in Try This 5-3, the local variable mask is declared as shown here:**

´´´long mask = 1;´´´

**Change this declaration so that it uses local variable type inference. When doing so, be sure that mask is of type long (as it is here), and not of type int.**



# Chapter 6 Self Check

**1. Given this fragment,**



**is the following fragment correct?**



**2. An access modifier must __________ a member’s declaration.**

**3. The complement of a queue is a stack. It uses first-in, last-out accessing and is often likened to a stack of plates. The first plate put on the table is the last plate used. Create a stack class called Stack that can hold characters. Call the methods that access the stack push( ) and pop( ). Allow the user to specify the size of the stack when it is created. Keep all other members of the Stack class private. (Hint: You can use the Queue class as a model; just change the way the data is accessed.)**

**4. Given this class,**



**write a method called swap( ) that exchanges the contents of the objects referred to by two Test object references.**

**5. Is the following fragment correct?**



**6. Write a recursive method that displays the contents of a string backwards.**

**7. If all objects of a class need to share the same variable, how must you declare that variable?**

**8. Why might you need to use a static block?**

**9. What is an inner class?**

**10. To make a member accessible by only other members of its class, what access modifier must be used?**

**11. The name of a method plus its parameter list constitutes the method’s _______________.**

**12. An int argument is passed to a method by using call-by-_______________.**

**13. Create a varargs method called sum( ) that sums the int values passed to it. Have it return the result. Demonstrate its use.**

**14. Can a varargs method be overloaded?**

**15. Show an example of an overloaded varargs method that is ambiguous.**
