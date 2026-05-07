class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet <Integer> set = new HashSet<>();
        for(int dig : nums){
            if(set.contains(dig))
                return true;
            set.add(dig);
        }
        return false;
    }
}