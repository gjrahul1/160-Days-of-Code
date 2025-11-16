class Solution(object):
    def maximizeExpressionOfThree(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """

        if len(nums) >= 3:
            sorted_nums = sorted(nums)

            max_0 = sorted_nums[-1]
            max_1 = sorted_nums[-2]

            min_element = sorted_nums[0]

            return max_0+max_1-min_element
