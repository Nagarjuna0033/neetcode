class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
         List<List<String>> group = new ArrayList<>();
        HashMap<String, List<String>> strings = new HashMap<>();

        for(String ele : strs){
            char[] chars = ele.toCharArray();
            Arrays.sort(chars);
            String tempString = new String(chars);
            if(strings.containsKey(tempString)){
                strings.get(tempString).add(ele);
            }else{
                List<String> temp = new ArrayList<>();
                temp.add(ele);
                strings.put(tempString,temp);
            }
           
        }
        for(Map.Entry<String, List<String>> ele : strings.entrySet()){
            group.add(ele.getValue());
        }
        return group;
    }
}
