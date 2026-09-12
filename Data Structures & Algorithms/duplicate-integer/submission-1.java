class Solution {
    public boolean hasDuplicate(int[] nums) {
        // hashset problem
        HashSet <Integer> set = new HashSet <>();
        for(int n : nums){
            if(set.contains(n)) return true;
            set.add(n);
        }
        return false;
        
    }
}