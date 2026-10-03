class Solution {
    public String restoreString(String s, int[] indices) {
        char []tempstr=new char[indices.length];
        int tempnum=0;
        for(int i=0;i<s.length();i++){
            tempstr[indices[i]]=s.charAt(i);
        }
        String finalstr=new String(tempstr);
        
        return finalstr;
    }
}