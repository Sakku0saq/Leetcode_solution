class Solution {
    public boolean checkValidString(String s) {
        int minOpen=0;
        int maxOpen=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                minOpen++;
                maxOpen++;
            }
            else if(s.charAt(i)==')'){
                minOpen--;
                maxOpen--;
            }
            else{
                minOpen--;
                maxOpen++;
            }
            if(maxOpen<0){
            return false;
        }

        
        minOpen=Math.max(minOpen,0);
        }
        
        
        return minOpen==0;
        
    }
}