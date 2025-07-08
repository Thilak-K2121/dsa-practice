class Solution 
{
    public int myAtoi(String s) 
    {
        int isNegative=0;
        int res=0;
        int n=s.length();
        int i=0;
        
        while(i<n && s.charAt(i)==' ')
        {
            i++;
        }
        if(i<n  && (s.charAt(i)=='-' || s.charAt(i)=='+'))
        {
            isNegative=s.charAt(i)=='-'? 1 : 0;
            i++;
        }
        while(i<n && Character.isDigit(s.charAt(i)))
        {
            int digit=s.charAt(i)-'0';
            if (res > (Integer.MAX_VALUE - digit) / 10) {
                return isNegative == 1 ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }
            res=res*10+(digit);
            i++;
        }
        if(isNegative==1)
        {
            res=res*-1;
        }
        return res;
    }
}
