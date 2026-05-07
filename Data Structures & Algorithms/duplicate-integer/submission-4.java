
class Solution {
    public boolean hasDuplicate(int[] nums) {
       HashMap<Integer,Integer> map = new HashMap<>();
       for(int dig : nums){
            map.put(dig,map.getOrDefault(dig,0)+1);
       }
       for(int value : map.values())
            if(value>1)
                return true;
       return false;
    }
}