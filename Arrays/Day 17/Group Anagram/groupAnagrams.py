class Solution(object):
    def groupAnagrams(self, strs):
        """
        :type strs: List[str]
        :rtype: List[List[str]]
        """
        group = {}

        for word in strs:
            seen = {}
            for char in word:
                seen[char] = seen.get(char,0) + 1
            
            key = tuple(sorted(seen.items()))
            
            if key not in group:
                group[key] = []

            group[key].append(word)

        return list(group.values())
