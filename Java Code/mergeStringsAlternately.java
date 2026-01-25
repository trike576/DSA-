class Solution {
    public String mergeAlternately(String word1, String word2) {
        // Variables
        int len1 = word1.length(), len2 = word2.length();
        int currCharNo1 = 0, currCharNo2 = 0;
        String res = "";
        // loop for iterating both strings
        while (currCharNo1 < len1 && currCharNo2 < len2){
            res += word1.charAt(currCharNo1);
            res += word2.charAt(currCharNo2);
            currCharNo1++;
            currCharNo2++;
        }
        // Loop to add remaining characters of word1 into result string
        while(currCharNo1 < word1.length()){
            res += word1.charAt(currCharNo1);
            currCharNo1++;
        }

        // Loop to add remaining characters of word2 into result string
        while(currCharNo2 < word2.length()){
            res += word2.charAt(currCharNo2);
            currCharNo2++;
        }
        return res;
    }
}
