class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        container = {}
        output = []
        current_value = 0
        
        for i in range(len(nums)):
            if target - nums[i] not in container:
                container[(nums[i])] = i

            else:
                output.append(container.get(target-nums[i]))
                output.append(i)

        return output
            


        