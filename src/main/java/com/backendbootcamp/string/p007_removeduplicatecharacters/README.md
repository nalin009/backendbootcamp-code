# 7 - Remove Duplicate Characters

## 🧩 Problem

Given a string, remove all duplicate characters while **preserving the original order of their first occurrence**.

Each character should appear only once in the final string.

For example, in `"programming"`:

* `p` appears for the first time → keep it
* `r` appears for the first time → keep it
* `o` appears for the first time → keep it
* `g` appears for the first time → keep it
* `r` appears again → remove it
* `a` appears for the first time → keep it
* `m` appears for the first time → keep it
* `m` appears again → remove it
* `i` appears for the first time → keep it
* `n` appears for the first time → keep it
* `g` appears again → remove it

Therefore:

```text
programming → progamin
```

The goal is to remove duplicate characters without changing the order of the characters that are kept.

---

## 📥 Input

The input is a string containing characters from which duplicate occurrences need to be removed.

**Example:**

```text
programming
```

---

## 📤 Output

Return a new string containing only the **first occurrence of each character**, while preserving their original order.

For the input `"programming"`, the expected output is:

```text
progamin
```

---

## 💡 Examples

### Example 1

**Input**

```text
programming
```

**Output**

```text
progamin
```

### Example 2

**Input**

```text
banana
```

**Output**

```text
ban
```

### Example 3

**Input**

```text
hello
```

**Output**

```text
helo
```

---

## 🎯 Interview Focus

This is a common Java interview problem used to test:

* String traversal
* Duplicate detection
* `HashSet`
* `LinkedHashSet`
* `StringBuilder`
* Maintaining insertion order
* Understanding the difference between **removing duplicates** and **sorting characters**

While solving this problem, you may explore different approaches, such as:

* Using `HashSet`
* Using `LinkedHashSet`
* Using `StringBuilder` with a `Set`
* Using a character frequency array
* Using Java Streams

The important part is to **preserve the original order of the first occurrence** of every character.

---

## 🚀 Practice

Try solving this problem using at least two different approaches:

1. **Using `HashSet` with `StringBuilder`**
2. **Using `LinkedHashSet`**

Then compare both approaches based on:

* Time complexity
* Space complexity
* Readability
* Performance
* Interview suitability
