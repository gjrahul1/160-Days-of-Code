class Solution(object):
    def isPalindrome(self, x):
        """
        :type x: int
        :rtype: bool
        """
        result = False
        x = str(x)
        
        if x == x[::-1]:
            result = True

        return result
