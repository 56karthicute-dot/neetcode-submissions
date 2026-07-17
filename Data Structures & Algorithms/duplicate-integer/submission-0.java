class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap counter = new HashMap();
        for(int num:nums){
            if(counter.get(num)!=null)
            {
                return true;
            }
            else
            {
                counter.put(num,1);
            }
        }
        return false;
    }
}