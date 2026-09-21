# 9 - Reverse Words in a Sentence

## 🧩 Problem

Given a sentence containing multiple words, reverse the **order of the words** in the sentence.

The characters within each individual word should remain unchanged.

For example:

```text
"Java is powerful"
```

should become:

```text
"powerful is Java"
```

Notice that the words are reversed, but the characters inside each word are not.

The goal is to reverse the order of words while preserving the original spelling of each word.

---

## 📥 Input

The input is a sentence containing multiple words separated by spaces.

**Example:**

```text
Java is powerful
```

---

## 📤 Output

Return the sentence with the words arranged in reverse order.

For the input:

```text
Java is powerful
```

the expected output is:

```text
powerful is Java
```

---

## 💡 Examples

### Example 1

**Input**

```text
Java is powerful
```

**Output**

```text
powerful is Java
```

### Example 2

**Input**

```text
I love Java
```

**Output**

```text
Java love I
```

### Example 3

**Input**

```text
Backend development is fun
```

**Output**

```text
fun is development Backend
```

---

## 🎯 Interview Focus

This is a common Java interview problem used to test:

* String manipulation
* Array traversal
* `split()`
* Loops
* StringBuilder
* Handling whitespace
* Difference between reversing a **string** and reversing **words**

While solving this problem, you may explore different approaches, such as:

* Using `split()` and a loop
* Using `StringBuilder`
* Using `Collections.reverse()`
* Reversing the words without using built-in reverse methods
* Using Java Streams

The important part is to reverse the **order of words**, not the characters inside each word.

---

## 🚀 Practice

Try solving this problem using at least two different approaches:

1. **Using `split()` and a loop**
2. **Using `StringBuilder` or another approach**

Then compare both approaches based on:

* Time complexity
* Space complexity
* Readability
* Performance
* Handling multiple spaces
* Interview suitability
