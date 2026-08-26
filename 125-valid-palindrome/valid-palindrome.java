class Solution {
    public boolean isPalindrome(String s) {
          StringBuilder s2= new StringBuilder();
        for (int j = 0; j < s.length(); j++) {
            char c=s.charAt(j);
            if(Character.isLetterOrDigit(c)){
                s2.append(c);
            }

        }
        String s1 = s2.toString();
        String finalString=s1.toLowerCase();


        int len = s1.length();
        int mid=len/2;

        for (int i = 0; i <len/2; i++) {
            if (finalString.charAt(i) != finalString.charAt(len - 1 - i)) {
                return false;

            }

        }
        return true;

    }


        
    }
