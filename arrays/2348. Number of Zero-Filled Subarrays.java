class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long count = 0;
        long currentZeroCount = 0;

        for(int num : nums){
            if(num==0){
                currentZeroCount++;
                count=count+currentZeroCount;
            }else{
                currentZeroCount=0;
            }
        }

        return count;
    }
}
