
# String Problems

This section contains problems focused on string manipulation, pattern matching, and character-based logic.

---

## 🪞 Palindrome Number

**File:** `palindrome.py`  
**Platform:** LeetCode #9  
**Difficulty:** Easy  

### 🧩 Problem Statement  
Determine whether an integer is a palindrome.  
An integer is a palindrome when it reads the same backward as forward.

### 💡 Approach  
1. Convert the integer to a string.  
2. Compare the string with its reverse (`x[::-1]`).  
3. Return `True` if both are equal, otherwise `False`.

### 🧮 Time & Space Complexity  
- **Time Complexity:** O(n) — where *n* is the number of digits.  
- **Space Complexity:** O(n) — for the string conversion and reversal.

