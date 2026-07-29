class Solution {
    public boolean isSameAfterReversals(int num) {
        int digit;
        int rev = 0;
        int rev1 = 0;
        int original = num;
        while(num > 0){
            digit = num % 10;
            rev = rev * 10 + digit;
            num = num/10;
        }
        while(rev > 0){
            digit = rev % 10;
            rev1 = rev1 * 10 + digit;
            rev = rev/10;
        }
        if(rev1==original){
          return true;  
        } else{
            return false;
        }
    }
}