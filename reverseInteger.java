class Solution {
    public int reverse(int x) {
        //123
        //123%10 = 3
        //12%10 = 2
        //1%10 = 1
        
        //300 -> 3 *10 * 10
        //20 -> 2 * 10
        //1
        long answer = 0;
        while(x != 0){
            answer = 10*answer + x%10;
            x /= 10;
            if(answer > Integer.MAX_VALUE||answer < Integer.MIN_VALUE){
                return 0;
            }
            
        }
        return (int)answer;
    }
}