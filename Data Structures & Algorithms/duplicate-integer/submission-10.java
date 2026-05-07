class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap <Integer,Integer> map = new HashMap<>();
        for(int dig : nums){
            if(map.containsKey(dig))
                return true;
            map.put(dig,1);
        }
        return false;
    }
}