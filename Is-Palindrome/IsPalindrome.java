/*
Is Palindrome
Solved 
Given a string s, return true if it is a palindrome, otherwise return false.

A palindrome is a string that reads the same forward and backward. It is also case-insensitive and ignores all non-alphanumeric characters.

Example 1:

Input: s = "Was it a car or a cat I saw?"

Output: true
Explanation: After considering only alphanumerical characters we have "wasitacaroracatisaw", which is a palindrome.

Example 2:

Input: s = "tab a cat"

Output: false
Explanation: "tabacat" is not a palindrome.

Constraints:

1 <= s.length <= 1000
s is made up of only printable ASCII characters.
*/


class Solution {
    public boolean isPalindrome(String s) {
        
        String removed = getString(s);
        int start = 0;
        int end = removed.length() - 1;
        while(start <= end){
            
            if(removed.charAt(start) != removed.charAt(end)){
                return false;
            }

            start++;
            end--;
        }

        return true;

    }

    public static String getString(String s){
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        s = s.toLowerCase();
        return s;
    }
}
