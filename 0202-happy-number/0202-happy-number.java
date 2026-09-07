class Solution {

    boolean check(int n) {
        int rem=0;
        int sum=0;
        
        while(n>0){
            rem=n%10;
            sum+=rem*rem;
            n=n/10;
        }
   
    if (sum==1) {
        return true;
        
    }
    if (sum == 4) {
         return false; 
    }
    return check(sum);
}


    public boolean isHappy(int n) {
       if(n==1){
        return true;
       }

    
    return check(n);
        
    }
}