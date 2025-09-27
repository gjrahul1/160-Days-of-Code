# Two Sum

## Problem Difficulty
**Easy**

## Problem Description
Given a list of integers, your task is to find **two distinct numbers** that add up to a given target value. You need to return the **indices** of these two numbers. The order of the indices does not matter.

You can assume that:  
- Each input has exactly **one valid solution**.  
- You **cannot use the same element twice**.  

## Input
- `nums`: An array of integers. Example: `[2, 7, 11, 15]`  
- `target`: An integer value that represents the sum we are trying to find. Example: `9`  

## Output
- An array containing the **indices** of the two numbers that add up to the target.  
- The order of the indices does not matter.  

## Examples

**Example 1:**  
> Input: nums = [2, 7, 11, 15], target = 9  
> Output: [0, 1]  
> Explanation: `nums[0] + nums[1] = 2 + 7 = 9`  

**Example 2:**  
> Input: nums = [3, 2, 4], target = 6  
> Output: [1, 2]  
> Explanation: `nums[1] + nums[2] = 2 + 4 = 6`  

## Constraints
- Each input will have **exactly one solution**.  
- You cannot use the same element twice.  
- Indices can be returned in **any order**.  

## Tags
`Array` `HashMap` `Easy`
