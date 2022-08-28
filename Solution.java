class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0) {
            return false;
        }
        
        int originalNumber = x;
        int reverse = 0;
        int remainder = 0;
        
        while(x > 0){
            remainder = x % 10;
            reverse = (reverse * 10) + remainder;
            x = x // 10;
        }
        
        if(reverse == originalNumber){
            return true;
        }
        else {
            return false;
        }
        
    }
}
