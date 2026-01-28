class Solution {
    public String longestCommonPrefix(String[] strs) {
        String sub, lcp = "";
        int k = 0;
        boolean containedByAll = true;
        
               
            for(int j = 1; j <= strs[0].length(); j++){
                 containedByAll = true;
                sub = strs[0].substring(0, j);
                k = 0;
                while(k < strs.length){
                    if(!strs[k].startsWith(sub)){
                        containedByAll = false;
                        break;
                    }
                    k++;
                }
                if(containedByAll && lcp.length() < sub.length()){
                    lcp = sub;
                }
            }
        
        return lcp;
    }
}
