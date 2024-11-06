class Solution {
    public boolean hasDuplicate(int[] nums) {
        List<Integer> numbers = new ArrayList<Integer>();

        for(int i : nums){
            if(numbers.contains(i)){
                return true;
            }
            numbers.add(i);
        }

        return false;
    }
}
