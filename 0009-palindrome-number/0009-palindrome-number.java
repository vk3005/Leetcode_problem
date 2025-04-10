class Solution {
    public boolean isPalindrome(int x) {
        int original = x;
        int result = 0;

        while(x>0){
            int rem = x%10;
            x=x/10;
            result=result*10+rem;
        }
        return original == result;
    }
}