class Solution {
    public int reverse(int x) {
        int n=x;
        int dig,rev=0;;
        while(n!=0)
        {
            dig=n%10;
            if(rev>Integer.MAX_VALUE/10 || rev<Integer.MIN_VALUE/10){
                return 0;
            }
            rev=rev*10+dig;
            n=n/10;
        }
        return rev;
    }
}
