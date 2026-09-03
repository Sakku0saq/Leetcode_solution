class Solution {
    public int appendCharacters(String s, String t) {
        int i=0;
        int j=0;
        int finalans=0;

        int count=0;
        int index=0;

        while(i<t.length()){
            if(j < s.length() && t.charAt(i) == s.charAt(j)){
                i++;
                j++;
                
                count++;
            }
            else{
                if(j<s.length()){
                    j++;
                }else{
                    break;
                }
            }
            index=i;



        }
        finalans=(t.length()-index);
        return finalans;
    }
}