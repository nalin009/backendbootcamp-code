# 6 - Find First Repeated Character

## 🧩 Problem

Given a string, find the **first character that appears more than once** while traversing the string from left to right.

A repeated character is a character that occurs at least two times in the given string.

For example, in `"swiss"`, the character `s` is repeated. Therefore, `s` is the first repeated character.

The goal is to identify the first character whose occurrence is detected for the second time.

---

## 📥 Input

The input is a string containing characters that need to be checked for repetition.

**Example:**

```text
swiss
```

---

## 📤 Output

Return the **first repeated character** found in the given string.

For the input `"swiss"`, the expected output is:

```text
s
```

If no character is repeated, indicate that no repeated character exists.

---

## 💡 Examples

### Example 1

**Input**

```text
swiss
```

**Output**

```text
s
```

### Example 2

**Input**

```text
hello
```

**Output**

```text
l
```

### Example 3

**Input**

```text
abcdef
```

**Output**

```text
No repeated character
```

---

## 🎯 Interview Focus

This is a common Java interview problem used to test:

* String traversal
* Duplicate detection
* `HashSet`
* `HashMap`
* Character comparison
* Maintaining the order of characters
* Understanding the difference between **first repeated** and **first non-repeated** character

While solving this problem, you may explore different approaches, such as:

* Using `HashSet`
* Using `HashMap`
* Using two loops
* Using Java Streams
* Using a character frequency array

The important part is to return the **first character whose duplicate occurrence is encountered**, not simply any repeated character.

---

## 🚀 Practice

Try solving this problem using at least two different approaches:

1. **Using `HashSet`**
2. **Using `HashMap` or another approach**

Then compare both approaches based on:

* Time complexity
* Space complexity
* Readability
* Performance
* Interview suitability
