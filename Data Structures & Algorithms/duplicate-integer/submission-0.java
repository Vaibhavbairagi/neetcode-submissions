class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> numset = new HashSet<>();
        for(int num: nums) {
            if(numset.contains(num)) {
                return true;
            }
            numset.add(num);
        }
        return false;
    }
}