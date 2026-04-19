class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet containsD = new HashSet<>();
        for(int val : nums){
            if(containsD.contains(val)){
                return true;
            }
            containsD.add(val);
        }

        return false;
    }
}