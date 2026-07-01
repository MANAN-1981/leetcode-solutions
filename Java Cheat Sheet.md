# ☕ Java DSA Cheat Sheet

> A quick-reference guide to core Java syntax & fundamentals — built for Data Structures & Algorithms practice.

---

## 📑 Table of Contents

1. [Java Basics](#1-java-basics)
2. [Java Program to Print "Hello World"](#2-java-program-to-print-hello-world)
3. [Data Types in Java](#3-data-types-in-java)
4. [Java Comments](#4-java-comments)
5. [Java Variables](#5-java-variables)
6. [Access Modifiers in Java](#6-access-modifiers-in-java)
7. [Operators in Java](#7-operators-in-java)
8. [Identifiers in Java](#8-identifiers-in-java)
9. [Control Flow in Java](#9-control-flow-in-java)
10. [Methods in Java](#10-methods-in-java)
11. [Java Input/Output (I/O)](#11-java-inputoutput-io)
12. [DSA Quick Reference](#12-dsa-quick-reference)

---

## 1. Java Basics

> 💡 **Java** is a general-purpose, object-oriented programming language developed by James Gosling at Sun Microsystems, later acquired by Oracle. It runs on the **JVM (Java Virtual Machine)**, making it platform-independent — *"Write Once, Run Anywhere" (WORA)*.

### 🔑 Key Terminologies

| Term | Description |
|------|-------------|
| **Platform-independent** | Runs on any OS with a JVM |
| **Object-oriented** | Based on classes and objects |
| **JVM** | Runtime environment that executes Java bytecode |
| **Bytecode** | Intermediate code generated after compilation; run by the JVM |
| **JDK** | A complete development kit — includes JRE + compiler + tools |
| **JRE (Java Runtime Environment)** | Provides libraries + JVM needed to *run* Java programs |
| **JIT (Just-In-Time compiler)** | Improves performance by compiling bytecode to native machine code at runtime |
| **Garbage Collector** | Automatically reclaims memory used by unreachable objects |
| **Platform** | A hardware/software environment where a program executes |

### 🧠 Object-Oriented Concepts

An object is the real-world entity that possesses both **state** (fields/attributes) and **behavior** (methods).

| Concept | Meaning |
|---------|---------|
| 🧱 **Class** | A blueprint/template for creating objects |
| 📦 **Object** | An instance of a class |
| 🧬 **Inheritance** | A class acquires properties & behavior of another class |
| 🎭 **Polymorphism** | One entity can take many forms (method overloading/overriding) |
| 🔒 **Encapsulation** | Wrapping data (fields) & code (methods) into a single unit — access controlled via access modifiers |
| 🎨 **Abstraction** | Hiding internal implementation details, exposing only functionality |

> ⚠️ **Note:** Java does **not** support multiple inheritance via classes (to avoid the *diamond problem*) — it's achieved via **interfaces** instead.

### 🏗️ Constructors

A constructor is a special block of code used to initialize an object. It has the **same name as the class** and **no return type**.

| Type | Description |
|------|-------------|
| **Default Constructor** | Auto-provided by Java if no constructor is defined; initializes with default values |
| **Parameterized Constructor** | Accepts arguments to initialize an object with custom/user-defined values |

> 📝 Constructors can be **overloaded** — a class can have multiple constructors with different parameter lists.

---

## 2. Java Program to Print "Hello World"

```java
class GFG {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
```

**Output:**
```
Hello World!
```

### 🔍 How the Program Works

| Element | Purpose |
|---------|---------|
| `class GFG` | Defines a class named `GFG` |
| `public static void main(String[] args)` | The entry point of every Java application |
| `System.out.println()` | Prints text to the console, followed by a new line |

---

## 3. Data Types in Java

> Data types specify the different sizes and values that can be stored in a variable. There are **two categories**.

### 3.1 Primitive Data Types

Built-in, predefined types in Java. They store simple values directly (not memory addresses).

| Type | Size | Example |
|------|------|---------|
| `byte` | 1 byte | `byte b = 10;` |
| `short` | 2 bytes | `short s = 100;` |
| `int` | 4 bytes | `int i = 1000;` |
| `long` | 8 bytes | `long l = 10000L;` |
| `float` | 4 bytes | `float f = 10.5f;` |
| `double` | 8 bytes | `double d = 10.5;` |
| `char` | 2 bytes | `char c = 'A';` |
| `boolean` | 1 bit | `boolean flag = true;` |

### 3.2 Non-Primitive (Reference) Data Types

Created by the programmer (not built into Java) — includes `String`, **Arrays**, **Classes**, and **Interfaces**.

> 📌 Non-primitive types store a **reference/address** to the actual data, not the value itself.

---

## 4. Java Comments

Comments are non-executable lines used to explain code and improve readability.

### 4.1 Single Line Comment

```java
// This is a single line comment
class Java {
    public static void main(String[] args) {
        System.out.println("GFG"); // prints GFG
    }
}
```

### 4.2 Multi-line Comment

```java
/*
 If you need to comment on multiple lines of code,
 you can utilize the syntax of a block comment (/* */)
 Simply enter your comment message between the /* and */
*/
class Java {
    public static void main(String[] args) {
        System.out.println("GFG");
    }
}
```

### 4.3 Javadoc Comment

Used when writing or exporting software packages — the built-in method is used to generate an HTML documentation page for reference or programming purposes.

```java
/**
 * This is a Javadoc comment
 * @author GFG
 */
```

---

## 5. Java Variables

> A variable is the name of a memory location that holds data. Every variable **must be declared** before use.

### Syntax
```java
data_type variable_name;
```

### Types of Variables

| Type | Description |
|------|-------------|
| **Local Variable** | Declared inside a method or block; scope limited to that block |
| **Instance Variable** | Declared inside a class but outside any method; each object gets its own copy |
| **Static Variable** | Declared with the `static` keyword; shared across all instances of the class |

```java
class GFG {
    // Instance variable
    int age = 15;

    // Static variable
    static String flag = "GFG";

    public static void main(String[] args) {
        // Local variable
        int price = 90;

        System.out.println("age: " + new GFG().age);
        System.out.println("Price: " + price);
        System.out.println("flag: " + flag);
    }
}
```

**Output:**
```
age: 15
Price: 90
flag: GFG
```

---

## 6. Access Modifiers in Java

> Access modifiers control the **scope of a class, method, variable, or constructor**. They provide security by restricting unauthorized access.

| Modifier | Same Class | Same Package | Subclass (diff package) | Other Package |
|----------|:----------:|:-------------:|:------------------------:|:--------------:|
| 🟢 `public` | ✅ | ✅ | ✅ | ✅ |
| 🟡 `protected` | ✅ | ✅ | ✅ | ❌ |
| 🔵 *default* (no modifier) | ✅ | ✅ | ❌ | ❌ |
| 🔴 `private` | ✅ | ❌ | ❌ | ❌ |

---

## 7. Operators in Java

> An operator performs operations on one, two, or three operands and returns a result.

### Precedence & Associativity

| Operators | Associativity | Type |
|-----------|:--------------:|------|
| `()` `[]` `.` | Left to right | Unary postfix |
| `++` `--` `+` `-` `!` `~` | Right to left | Unary prefix |
| `*` `/` `%` | Left to right | Multiplicative |
| `+` `-` | Left to right | Additive |
| `<<` `>>` `>>>` | Left to right | Shift |
| `<` `<=` `>` `>=` `instanceof` | Left to right | Relational |
| `==` `!=` | Left to right | Equality |
| `&` | Left to right | Bitwise AND |
| `^` | Left to right | Bitwise XOR |
| `\|` | Left to right | Bitwise OR |
| `&&` | Left to right | Logical AND |
| `\|\|` | Left to right | Logical OR |
| `?:` | Right to left | Ternary/Conditional |
| `=` `+=` `-=` `*=` `/=` `%=` | Right to left | Assignment |

### Categories

| Category | Operators |
|----------|-----------|
| **Arithmetic** | `+` `-` `*` `/` `%` |
| **Relational** | `==` `!=` `>` `<` `>=` `<=` |
| **Logical** | `&&` `\|\|` `!` |
| **Bitwise** | `&` `\|` `^` `~` `<<` `>>` `>>>` |
| **Assignment** | `=` `+=` `-=` `*=` `/=` `%=` |
| **Unary** | `+` `-` `++` `--` `!` |
| **Ternary** | `condition ? expr1 : expr2` |

> 💡 **DSA Tip:** Bitwise operators (`&`, `\|`, `^`, `<<`, `>>`) show up frequently in bit-manipulation problems — know them cold.

---

## 8. Identifiers in Java

> Names given to entities such as classes, methods, variables, and interfaces are called identifiers.

### 📏 Rules of Defining Java Identifiers

- Can contain letters (A–Z, a–z), digits (0–9), and `_`
- Cannot start with a digit
- Case-sensitive
- Cannot use Java keywords as identifiers (e.g. `class`, `int`, `public`)
- No spaces allowed
- Special characters (except `_` and `$`) are not allowed

---

## 9. Control Flow in Java

The order in which statements are executed. Java offers several control structures.

### 9.1 `if-else`

```java
import java.io.*;

class GFG {
    public static void main(String[] args)
    {
        int x = 4, y = 4;

        if (x == y) {
            System.out.print("x and y are equal");
        }
        else {
            System.out.print("x and y are not equal");
        }
    }
}
```

**Output:**
```
x and y are equal
```

### 9.2 Nested `if`

Used if a decision structure is involved in another decision structure.

```java
import java.util.*;

class NewsAlert {
    public static void main(String[] args)
    {
        int a = 5;
        int b = 10;

        // First if statement
        if (a > 2) {
            if (b < 15) {
                System.out.println(
                    "a is greater than 2 and b is less than 15");
            }
            else {
                System.out.println(
                    "a is greater than 2, but b is not less than 15");
            }
        }
        else {
            System.out.println("a is not greater than 2");
        }
    }
}
```

**Output:**
```
a is greater than 2 and b is less than 15
```

> ⚠️ **Note:** Excessive nesting reduces readability — consider `switch` or early returns as alternatives where possible.

### 9.3 Switch Statement

A switch statement allows a variable to be tested for equality against a list of values (cases).

```java
public class GFG {
    public static void main(String[] args)
    {
        int day = 4;
        String dayString;

        switch (day) {
        case 1:
            dayString = "Monday";
            break;
        case 2:
            dayString = "Tuesday";
            break;
        case 3:
            dayString = "Wednesday";
            break;
        case 4:
            dayString = "Thursday";
            break;
        case 5:
            dayString = "Friday";
            break;
        case 6:
            dayString = "Saturday";
            break;
        case 7:
            dayString = "Sunday";
            break;
        default:
            dayString = "Invalid day";
            break;
        }
        System.out.println("Day " + day + " is " + dayString);
    }
}
```

**Output:**
```
Day 4 is Thursday
```

> 💡 **Tip:** Always include a `break` statement to prevent *fall-through* to the next case (unless fall-through is intentional).

### 9.4 Loops in Java

Loops are used to repeatedly execute a block of code as long as a condition holds true — the backbone of most DSA traversal & iteration logic.

| Loop | Syntax | Use Case |
|------|--------|----------|
| **for** | `for(init; condition; update)` | When the number of iterations is known |
| **while** | `while(condition)` | When iterations are unknown; checks condition first |
| **do-while** | `do {...} while(condition);` | Executes at least once before checking condition |

```java
// for loop
for (int i = 0; i < 5; i++) {
    System.out.println(i);
}

// while loop
int i = 0;
while (i < 5) {
    System.out.println(i);
    i++;
}

// do-while loop
int i = 0;
do {
    System.out.println(i);
    i++;
} while (i < 5);
```

---

## 10. Methods in Java

> A method is a collection of statements grouped together to perform an operation.

### Syntax of a Method

```java
returnType methodName(parameters) {
    // method body
}
```

### Example

```java
class GFG {
    public static void main(String[] args)
    {
        int num1 = 5;
        int num2 = 10;
        int sum = addNumbers(num1, num2);
        System.out.println("Sum is: " + sum);
    }

    // User-defined method
    public static int addNumbers(int a, int b) {
        return a + b;
    }
}
```

**Output:**
```
Sum is: 15
```

### Types of Methods

| Type | Description |
|------|-------------|
| **Predefined method** | Already defined in Java class libraries (e.g. `length()`, `sqrt()`) |
| **User-defined method** | Written by the programmer according to requirements |
| **Recursive method** | A method that calls itself — core to DSA topics like backtracking, DP, trees, divide & conquer |

---

## 11. Java Input/Output (I/O)

The `java.util.Scanner` class is used to take user input, and `System.out.print()` / `println()` is used for output — essential for reading test cases in DSA problems.

```java
import java.util.Scanner;

class GFG {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.println("Hello, " + name + "!");
    }
}
```

### 🖨️ Output Methods

| Method | Description |
|--------|-------------|
| `System.out.print(x)` | Prints `x` without a newline |
| `System.out.println(x)` | Prints `x` followed by a newline |
| `System.out.printf(...)` | Prints formatted output |

### ⌨️ Common Scanner Methods (for reading input in problems)

| Method | Reads |
|--------|-------|
| `sc.nextInt()` | An `int` |
| `sc.nextLong()` | A `long` |
| `sc.nextDouble()` | A `double` |
| `sc.next()` | A single token (word) |
| `sc.nextLine()` | An entire line |

---

## 12. DSA Quick Reference

> 🚀 Extra syntax you'll reach for constantly while solving DSA problems in Java.

### 📦 Common Data Structures

| Structure | Declaration |
|-----------|-------------|
| Array | `int[] arr = new int[5];` |
| ArrayList | `ArrayList<Integer> list = new ArrayList<>();` |
| LinkedList | `LinkedList<Integer> ll = new LinkedList<>();` |
| Stack | `Stack<Integer> stack = new Stack<>();` |
| Queue | `Queue<Integer> queue = new LinkedList<>();` |
| Deque | `Deque<Integer> deque = new ArrayDeque<>();` |
| HashMap | `HashMap<Integer, Integer> map = new HashMap<>();` |
| HashSet | `HashSet<Integer> set = new HashSet<>();` |
| TreeMap (sorted) | `TreeMap<Integer, Integer> tmap = new TreeMap<>();` |
| TreeSet (sorted) | `TreeSet<Integer> tset = new TreeSet<>();` |
| PriorityQueue (min-heap) | `PriorityQueue<Integer> pq = new PriorityQueue<>();` |
| PriorityQueue (max-heap) | `PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());` |

### 🛠️ Useful Utility Methods

| Task | Syntax |
|------|--------|
| Sort an array | `Arrays.sort(arr);` |
| Sort a List | `Collections.sort(list);` |
| Sort with comparator | `Arrays.sort(arr, (a, b) -> a - b);` |
| Binary search (array) | `Arrays.binarySearch(arr, key);` |
| Max of two values | `Math.max(a, b);` |
| Min of two values | `Math.min(a, b);` |
| Fill an array | `Arrays.fill(arr, value);` |
| Copy an array | `Arrays.copyOf(arr, newLength);` |
| Convert array to List | `Arrays.asList(arr);` |
| 2D array declaration | `int[][] grid = new int[m][n];` |
| String to char array | `str.toCharArray();` |
| StringBuilder (mutable strings) | `StringBuilder sb = new StringBuilder();` |

### ♻️ Recursion Template

```java
static int recurse(int n) {
    // Base case
    if (n <= 1) return n;

    // Recursive case
    return recurse(n - 1) + recurse(n - 2);
}
```

### ⏱️ Time Complexity Cheatsheet

| Notation | Name | Example |
|----------|------|---------|
| `O(1)` | Constant | Array access |
| `O(log n)` | Logarithmic | Binary search |
| `O(n)` | Linear | Single loop |
| `O(n log n)` | Linearithmic | Merge sort, Quick sort (avg) |
| `O(n²)` | Quadratic | Nested loops, Bubble sort |
| `O(2ⁿ)` | Exponential | Recursive Fibonacci (naive) |
| `O(n!)` | Factorial | Permutations |

---

## 📌 Quick Recap Cheat Table

| Concept | Keyword/Syntax |
|---------|-----------------|
| Class | `class ClassName { }` |
| Object creation | `ClassName obj = new ClassName();` |
| Inheritance | `class Child extends Parent { }` |
| Interface implementation | `class A implements B { }` |
| Array declaration | `int[] arr = new int[5];` |
| String comparison | `str1.equals(str2)` |
| Type casting | `(int) doubleValue` |

---

> ⭐ **Tip for DSA Prep:** Bookmark the [DSA Quick Reference](#12-dsa-quick-reference) and [Control Flow](#9-control-flow-in-java) sections — they're the ones you'll reach for mid-problem, every single time.

---
