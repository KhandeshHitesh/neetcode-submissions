class Solution {
    public boolean hasDuplicate(int[] nums) {

        HashMap<Integer,Integer> table = new HashMap<Integer,Integer>();
        boolean res = false;

        for(int i : nums){
            if (table.getOrDefault(i,0)==1){
                res=true;
                break;
            }

            table.put(i,1);
        }
        return res;
    }

}