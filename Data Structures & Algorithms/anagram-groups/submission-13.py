class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:

        container = {}


        for i in range(len(strs)):
            x = "".join(sorted(strs[i]))

            if x in container:
                container[x].append(strs[i])

            else: 
                container[x] = [strs[i]]

        return list(container.values())