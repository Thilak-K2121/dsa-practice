class Solution {
    public boolean isValid(String s) {
        int i=-1;
        int count=0;
        char stack[]= new char[s.length()];
        for(char c : s.toCharArray())
        {
            if(c =='(' || c=='[' || c=='{')
            {
                stack[++i]=c;
            }
            else 
            {
                if(i==-1) return false;
                else if( (c==')' && stack[i]!='(') || (c==']' && stack[i]!='[') || (c=='}' && stack[i]!='{') )
                {
                return false;
                }
            i--;
            }
        }
        return i==-1;
    }
}
