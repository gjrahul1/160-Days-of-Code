# Contains Duplicate (LeetCode 217)

### 📝 Description

Given an integer array nums, return True if any value appears at least twice in the array, and return False if every element is distinct.

This problem is commonly used to test fundamental knowledge of data structures, specifically the efficiency of using hash sets for fast lookups.

### 💡 Solution

The most efficient approach to solve this problem is by utilizing a Hash Set (or set in Python). A set guarantees that every element is unique, providing an average O(1) time complexity for insertion and lookup operations.

We iterate through the input array, checking if the current number is already present in our set. If it is, we immediately know a duplicate exists and return True. If the number is not in the set, we add it and continue. If the entire array is traversed without finding a duplicate, we return False.


### ⏱️ Complexity Analysis

Time Complexity: O(n)

The time complexity is linear, O(n), where 'n' is the number of elements in the input array nums.

We iterate through the list exactly once.

The set operations (num in seen and seen.add(num)) take an average time complexity of O(1) (constant time).

Therefore, the total time complexity is dominated by the single pass through the array.

Space Complexity: O(n)

The space complexity is also linear, O(n), in the worst-case scenario.

We use a hash set (seen) to store unique elements.

In the worst case (when there are no duplicates), the set will store all 'n' elements from the input array.

If you find this solution helpful, feel free to give the repository a star!
