# 🧩 Day 16 – Valid Anagram

### Problem Statement

Given two strings `s` and `t`, determine whether `t` is an anagram of `s`.

An **anagram** is a word formed by rearranging the letters of another word, using all the original letters exactly once.

---

### 🔍 Example

**Input:**

```
s = "anagram"
t = "nagaram"
```

**Output:**

```
True
```

**Input:**

```
s = "rat"
t = "car"
```

**Output:**

```
False
```

---

### 💡 Approach

1. **Early Length Check:** If the strings differ in length, they cannot be anagrams.
2. **Character Frequency:** Count the occurrences of each character in both strings using dictionaries.
3. **Comparison:** If both frequency maps are identical, the strings are anagrams.

---

### 🧠 Complexity Analysis

* **Time Complexity:** `O(n)` – linear scan through both strings.
* **Space Complexity:** `O(1)` – constant extra space (assuming fixed alphabet).

---

### 🧐 Takeaway

This problem emphasizes how **hashmaps simplify comparison tasks**. Instead of relying on sorting or brute-force, understanding data structures allows for cleaner, faster solutions.

Even simple problems like this build the foundation for designing efficient data pipelines and model preprocessing logic.


