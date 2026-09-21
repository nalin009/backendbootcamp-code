# 3 - Count vowels and consonants

## 🧩 Problem

Given a string containing alphabetic characters, count the number of **vowels** and **consonants** present in the string.

The vowels are:

```text
a, e, i, o, u
```

Both uppercase and lowercase letters should be considered.

For example, in `"Hello"`, there are 2 vowels (`e`, `o`) and 3 consonants (`H`, `l`, `l`).

The goal is to count vowels and consonants separately using Java.

---

## 📥 Input

The input is a string containing alphabetic characters.

**Example:**

```text
Hello World
```

---

## 📤 Output

Display the total number of vowels and consonants present in the given string.

For the input `"Hello World"`:

* Vowels = 3
* Consonants = 7

Spaces and other non-alphabetic characters should not be counted as either vowels or consonants.

---

## 💡 Examples

### Example 1

**Input**

```text
Hello
```

**Output**

```text
Vowels: 2
Consonants: 3
```

### Example 2

**Input**

```text
BackendBootcamp
```

**Output**

```text
Vowels: 5
Consonants: 10
```

### Example 3

**Input**

```text
Java Programming
```

**Output**

```text
Vowels: 5
Consonants: 10
```

---

## 🎯 Interview Focus

This is a common Java interview problem used to test:

* String traversal
* Character comparison
* Conditional statements
* Loops
* Handling uppercase and lowercase characters
* Handling spaces and non-alphabetic characters

While solving this problem, you may explore different approaches, such as:

* Using a `for` loop and `charAt()`
* Using `Character.isLetter()`
* Using `String.toLowerCase()`
* Using `replaceAll()`
* Using Java Streams

The objective is to understand how different approaches affect readability, performance, and memory usage.

---

## 🚀 Practice

Try solving this problem using at least two different approaches:

1. **Using a loop and character checks**
2. **Using Java built-in methods**

Then compare both approaches based on:

* Time complexity
* Space complexity
* Readability
* Performance
* Interview suitability
