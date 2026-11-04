class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        container = {}
        result = []


        for i in range(len(nums)):
            if nums[i] not in container:
                container[nums[i]] = 0
            else:
                container[nums[i]] += 1

        sorted_dict = dict(sorted(container.items(), key=lambda item: item[1],  reverse=True))
        

        return list(sorted_dict.keys())[0:k]
        





        