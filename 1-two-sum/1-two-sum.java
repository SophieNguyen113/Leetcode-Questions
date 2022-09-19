class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int [] res = new int[2];
        for(int i=0; i<nums.length;i++){
            int reqNum = target-nums[i];
            if(hm.containsKey(reqNum)){
                res[0]=hm.get(reqNum);
                res[1]=i;
            }
            hm.put(nums[i],i);
        }
        return res;
    }
}