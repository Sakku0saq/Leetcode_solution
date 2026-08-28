class Solution {

    public boolean palindromeHelper(int i,int j,String s){
        while(i<j){
            char left=s.charAt(i);
            char right=s.charAt(j);
            if(left!=right){
                return false;
            }
            i++;
            j--;
           
        }
         return true;
    }
    public boolean validPalindrome(String s) {

        int i=0;
        int j=s.length()-1;
        while(i<j){
            char left=s.charAt(i);
            char right=s.charAt(j);

            if(left!=right){
                return palindromeHelper(i+1,j,s)|| palindromeHelper(i,j-1,s);

            }
            else{
                i++;
                j--;
            }
        }
        return true;
        
    }
}