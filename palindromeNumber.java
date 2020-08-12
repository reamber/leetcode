class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){//negatives are non palindrom
            return false;
        }

        //apply the same reverse integer logic here
        long answer = 0;
        int copy = x;
        while( copy != 0){
            answer = answer * 10 + copy%10;
            copy /= 10;
            if(answer > Integer.MAX_VALUE||answer < Integer.MIN_VALUE){
                return false;
            }   
        }
        return (answer == x);
    }
}