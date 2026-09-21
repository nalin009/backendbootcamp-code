# 8 - Count Words in a String

## 🧩 Problem

Given a string containing one or more words, count the total number of words present in the string.

Words are separated by spaces or whitespace characters.

For example, in `"Java is powerful"`, there are 3 words:

```text
Java
is
powerful
```

The goal is to correctly count the words, including handling multiple spaces between words or spaces at the beginning or end of the string.

---

## 📥 Input

The input is a string containing words separated by spaces or other whitespace characters.

**Example:**

```text
Java is powerful
```

---

## 📤 Output

Return the total number of words present in the given string.

For the input `"Java is powerful"`, the expected output is:

```text
3
```

If the input contains only spaces or is empty, the word count should be `0`.

---

## 💡 Examples

### Example 1

**Input**

```text
Java is powerful
```

**Output**

```text
3
```

### Example 2

**Input**

```text
Java   Spring   Boot
```

**Output**

```text
3
```

### Example 3

**Input**

```text
  Backend Development  is  fun
```

**Output**

```text
4
```

---

## 🎯 Interview Focus

This is a common Java interview problem used to test:

* String traversal
* Handling whitespace
* `split()`
* Regular expressions
* String manipulation
* Edge-case handling

While solving this problem, you may explore different approaches, such as:

* Using `split()`
* Using `trim()` and `split()`
* Using `StringTokenizer`
* Using a loop to detect word boundaries
* Using Java Streams

The important part is to correctly handle **multiple spaces, leading spaces, trailing spaces, and empty strings**.

---

## 🚀 Practice

Try solving this problem using at least two different approaches:

1. **Using `split()`**
2. **Using a loop without directly splitting the string**

Then compare both approaches based on:

* Time complexity
* Space complexity
* Readability
* Performance
* Edge-case handling
* Interview suitability
