

class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer, String> container = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            container.put(nums[i], "yes");
        }

        return !(container.size() == nums.length);

        }

    }
