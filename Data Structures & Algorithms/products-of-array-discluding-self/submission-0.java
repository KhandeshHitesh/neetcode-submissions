class Solution {
    public int[] productExceptSelf(int[] nums) {

int n=nums.length;
        ArrayList<Integer> res=new ArrayList<>();
        int[] ress=new int[n];

        res.add(1);

        for(int i=1; i<n;i++){
            res.add(res.get(i-1)*nums[i-1]);
        }

int suffix=1;
        for(int i=n-1;i>=0;i--){
            res.set(i,res.get(i)*suffix);
            suffix*=nums[i];
        }

        for(int i=0;i<res.size();i++){
ress[i]=res.get(i);
        }
return ress;
        

        
    }
}  
