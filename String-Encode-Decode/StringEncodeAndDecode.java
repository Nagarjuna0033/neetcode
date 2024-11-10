/* String Encode and Decode
Solved 
Design an algorithm to encode a list of strings to a single string. The encoded string is then decoded back to the original list of strings.

Please implement encode and decode

Example 1:

Input: ["neet","code","love","you"]

Output:["neet","code","love","you"]
Example 2:

Input: ["we","say",":","yes"]

Output: ["we","say",":","yes"]
Constraints:

0 <= strs.length < 100
0 <= strs[i].length < 200
strs[i] contains only UTF-8 characters. */

class Solution {
    public String encode(List<String> strs) {
        
        StringBuilder encoded = new StringBuilder();
        for(String str : strs){
            encoded.append(str);
            encoded.append("arjun");
        }
        return encoded.toString();
    }

    public List<String> decode(String str) {
        List<String> decoded = new ArrayList<>();
        if(str.length()==0)
        return decoded;
        String[] split = str.split("arjun");
        if(split.length==0)
        {
            decoded.add("");
            return decoded;
        }
        for(int i = 0; i < split.length; i++){
            decoded.add(split[i]);
        }

        return decoded;
    }
}

