# 2 - Palindrome

## 🧩 Problem

Given a string, determine whether it is a palindrome.

A palindrome is a string that reads the same from left to right and from right to left.

For example, `"madam"` is a palindrome because reversing it produces `"madam"` again.

The goal is to check whether the given string is a palindrome using Java.

---

## 📥 Input

The input is a string that needs to be checked for palindrome.

**Example:**

```text
madam
```

---

## 📤 Output

Return whether the given string is a palindrome.

If the string reads the same forward and backward, the output should indicate that it is a palindrome. Otherwise, it should indicate that it is not a palindrome.

---

## 💡 Examples

### Example 1

**Input**

```text
madam
```

**Output**

```text
Palindrome
```

### Example 2

**Input**

```text
hello
```

**Output**

```text
Not Palindrome
```

### Example 3

**Input**

```text
racecar
```

**Output**

```text
Palindrome
```

---

## 🎯 Interview Focus

This is a common Java interview problem used to test string manipulation and logical thinking.

While solving it, you may explore multiple approaches, such as:

* Using `StringBuilder.reverse()`
* Comparing characters from both ends
* Using a `for` loop
* Converting the string into a character array
* Solving it without using built-in reverse methods

The objective is to understand how different approaches affect:

* Readability
* Time complexity
* Spac
