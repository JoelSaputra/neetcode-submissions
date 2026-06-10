

class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer, String> container = new HashMap<>();
        boolean foo = false; 

        for(int i = 0; i < nums.length; i++){
            if (container.containsKey(nums[i])){
                return true;
            }

            else{
                container.put(nums[i], "insert");
            }
            
            }

            return false;
        

        }

    }
