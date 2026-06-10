class Solution {
    public int[] twoSum(int[] nums, int target) {

       Map<Integer, Integer> container = new HashMap<>();
       int[] result = new int[2];

       for(int i = 0; i < nums.length; i++){
            container.put(nums[i], i);
       }

       for(int i = 0; i < nums.length; i++){
            
            if(container.containsKey(target - nums[i])){
                result[0] = container.get(target - nums[i]);
                result[1] = container.get(nums[i]);
            }
       }

       return result;

       

       
        
    }
}
