class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        container = {}
        result = []


        for i in range(len(nums)):
            if nums[i] not in container:
                container[nums[i]] = 0
            else:
                container[nums[i]] += 1

        sorted_array = (sorted(container, key=container.get,  reverse=True))
        

        return sorted_array[0:k]
        





        