class Solution {
    public boolean isPalindrome(int x) {
        int n=x;
        int temp=n;
        int rev=0;
        while(n!=0)
        {
            int digit=n%10;
           
            rev=rev*10+digit;
            n=n/10;
        }
        if(temp==rev && temp>=0)
        {
            return true;
        }

        return false;
    }
}