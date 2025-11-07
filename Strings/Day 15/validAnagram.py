class Solution(object):
    def isAnagram(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        
        #Early Check
        if len(s) != len(t):
            return False

        CountS = {}
        CountT = {}

        for ch in s:
            CountS[ch] = CountS.get(ch,0)+1

        for ch in t:
            CountT[ch] = CountT.get(ch,0)+1

        if CountS == CountT:
            return True
        else:
            return False
