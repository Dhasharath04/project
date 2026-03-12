class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs==null||strs.length==0)
        {
        return "";
        }
        int n=strs.length;
        String pri=strs[0];
        for(int i=1;i<n;i++)
        {
            while(strs[i].indexOf(pri)!=0){
                pri=pri.substring(0,pri.length()-1);
                if(pri.isEmpty())
                return "";
            }
        }
        return pri;
    }
}