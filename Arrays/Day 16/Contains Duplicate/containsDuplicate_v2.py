class Solution(object):
    def containsDuplicate(self, nums):
        """
        :type nums: List[int]
        :rtype: bool
        """
        
        seen = set()

        for i, num in enumerate(nums):
            if num in seen:
                return True
            seen.add(num)
        return False
