class Solution {
    public int[] twoSum(int[] nums, int target) {

       Map<Integer, Integer> container = new HashMap<>();
       int[] result = new int[2];

       for(int i = 0; i < nums.length; i++){
            container.put(nums[i], i);
       }

       for(int j = 0; j < nums.length; i++){
            
            if(container.containsKey(target - nums[j])){
                result[0] = container.get(nums[j]);
                result[1] = container.get(target - nums[j]);
            }
       }
       
       return result;

       

       
        
    }
}
