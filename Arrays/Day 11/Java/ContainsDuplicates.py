class Solution(object):
    def containsDuplicate(self, nums):
        """
        :type nums: List[int]
        :rtype: bool
        """
        
        non_duplicates = set()

        for num in nums:
            if num in non_duplicates:
                return True
            non_duplicates.add(num)

        return False
