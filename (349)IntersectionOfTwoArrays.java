class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<Integer>();
        for(int num : nums1)
        {
            set.add(num);
        }
        HashSet<Integer> resultset = new HashSet<Integer>();
        for(int num : nums2)
        {
            if(set.contains(num)){
                resultset.add(num);
            }
        }
        int arr[]=new int[resultset.size()];
        int index=0;
        for(int num : resultset)
        {
            arr[index++]=num;
        }
        return arr;
    }
}
