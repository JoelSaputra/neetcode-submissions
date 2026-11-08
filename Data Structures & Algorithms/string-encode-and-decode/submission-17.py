class Solution:

    def encode(self, strs: List[str]) -> str:
        res = ""
        for s in strs:
            res += str(len(s)) + "#" + s
        return res 


    def decode(self, s: str) -> List[str]:
        result_array = []
        i = 0
        while i < len(s):
            j = i
            while s[j] != '#':
                j += 1
            count = int(s[i:j])
            result_array.append(s[j+1 : j+1 + count])

            i = j + 1 + count

        return result_array


