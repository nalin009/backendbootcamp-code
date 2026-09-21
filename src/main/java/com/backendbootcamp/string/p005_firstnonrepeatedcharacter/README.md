# 5 - Find the non-repeated character

## 🧩 Problem

Given a string, find the **first character that does not repeat** anywhere else in the string.

A non-repeated character is a character that appears **exactly once** in the given string.

For example, in `"swiss"`:

* `s` appears 3 times
* `w` appears 1 time
* `i` appears 1 time

The first non-repeated character is `w`.

The goal is to find the first character whose frequency is exactly `1`.

---

## 📥 Input

The input is a string containing characters that need to be checked for repetition.

**Example:**

```text
swiss
```

---

## 📤 Output

Return the **first non-repeated character** from the given string.

For the input `"swiss"`, the expected output is:

```text
w
```

If every character is repeated, indicate that no non-repeated character exists.

---

## 💡 Examples

### Example 1

**Input**

```text
swiss
```

**Output**

```text
w
```

### Example 2

**Input**

```text
aabbcdde
```

**Output**

```text
c
```

### Example 3

**Input**

```text
aabbcc
```

**Output**

```text
No non-repeated character
```

---

## 🎯 Interview Focus

This is a common Java interview problem used to test:

* String traversal
* Character frequency counting
* `HashMap`
* `LinkedHashMap`
* Maintaining insertion order
* Understanding duplicate characters
* Finding the first occurrence that satisfies a condition

While solving this problem, you may explore different approaches, such as:

* Using `HashMap`
* Using `LinkedHashMap`
* Using two loops
* Using Java Streams
* Using a character frequency array

The important part is not only finding a character that occurs once, but finding the **first** character that occurs only once.

---

## 🚀 Practice

Try solving this problem using at least two different approaches:

1. **Using `HashMap` with two traversals**
2. **Using `LinkedHashMap`**

Then compare both approaches based on:

* Time complexity
* Space complexity
* Readability
* Performance
* Interview suitability
