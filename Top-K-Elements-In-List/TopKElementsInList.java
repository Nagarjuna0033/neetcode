/* Top K Elements in List
Solved 
Given an integer array nums and an integer k, return the k most frequent elements within the array.

The test cases are generated such that the answer is always unique.

You may return the output in any order.

Example 1:

Input: nums = [1,2,2,3,3,3], k = 2

Output: [2,3]
Example 2:

Input: nums = [7,7], k = 1

Output: [7]
Constraints:

1 <= nums.length <= 10^4.
-1000 <= nums[i] <= 1000
1 <= k <= number of distinct elements in nums. */


class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        List<Integer> list = new ArrayList<Integer>();
        
        for(int ele : nums){
            map.put(ele,map.getOrDefault(ele,0)+1);
        }

        ArrayList<Integer> freq = new ArrayList<>(map.values());
        Collections.sort(freq);
        HashSet<Integer> set = new HashSet<>();
        int n=freq.size();
        for(int i=0;i<k;i++)
        {
            set.add(freq.get(n-i-1));
        }

        for(int i : map.keySet()){
            if(set.contains(map.get(i))){
                list.add(i);
            }
        }
        
        int[] arr = new int[list.size()];
        for (int i = 0; i < list.size(); i++)
            arr[i] = list.get(i);

        return arr;
    }
}
