class Solution {
    public String mergeAlternately(String word1, String word2) {
        // Variables
        int len1 = word1.length(), len2 = word2.length();
        int currCharNo = 0;
        StringBuilder res = new StringBuilder();
        // loop for iterating both strings
        while (currCharNo < len1 && currCharNo < len2){
            res.append(word1.charAt(currCharNo));
            res.append(word2.charAt(currCharNo));
            currCharNo++;
        }
        // Loop to add remaining characters of word1 into result string
        while(currCharNo < word1.length()){
            res.append(word1.charAt(currCharNo));
            currCharNo++;
        }

        // Loop to add remaining characters of word2 into result string
        while(currCharNo < word2.length()){
            res.append(word2.charAt(currCharNo));
            currCharNo++;
        }
        return res.toString();
    }
}
