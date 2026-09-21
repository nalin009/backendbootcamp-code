# 4 - Count Character Frequency

## 🧩 Problem

Given a string, count how many times each character appears in the string.

For example, in the string `"banana"`:

* `b` appears 1 time
* `a` appears 3 times
* `n` appears 2 times

The goal is to calculate the frequency of each character using Java.

---

## 📥 Input

The input is a string containing characters whose frequencies need to be counted.

**Example:**

```text
banana
```

---

## 📤 Output

Display each character along with the number of times it appears in the given string.

For the input `"banana"`, the expected output is:

```text
b: 1
a: 3
n: 2
```

Each character should be counted separately.

---

## 💡 Examples

### Example 1

**Input**

```text
banana
```

**Output**

```text
b: 1
a: 3
n: 2
```

### Example 2

**Input**

```text
hello
```

**Output**

```text
h: 1
e: 1
l: 2
o: 1
```

### Example 3

**Input**

```text
java
```

**Output**

```text
j: 1
a: 2
v: 1
```

---

## 🎯 Interview Focus

This is a common Java interview problem used to test:

* String traversal
* Character frequency counting
* `Map` and `HashMap`
* Loops
* Key-value data structures
* Handling duplicate characters

While solving this problem, you may explore different approaches, such as:

* Using `HashMap`
* Using `getOrDefault()`
* Using `containsKey()`
* Using an array for character frequencies
* Using Java Streams

The objective is to understand how different approaches affect readability, performance, and memory usage.

---

## 🚀 Practice

Try solving this problem using at least two different approaches:

1. **Using `HashMap`**
2. **Using an array or another approach without `HashMap`**

Then compare both approaches based on:

* Time complexity
* Space complexity
* Readability
* Performance
* Interview suitability
