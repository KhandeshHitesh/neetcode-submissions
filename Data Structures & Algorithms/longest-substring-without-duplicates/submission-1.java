class Solution {
    public int lengthOfLongestSubstring(String s) {

        HashMap<Character,Integer> map = new HashMap<Character,Integer>();

        int res=0;
        int start=0;
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                if(map.get(s.charAt(i))>=start)
                start=map.get(s.charAt(i))+1;
            }
            map.put(s.charAt(i),i);
            res=Math.max(res,i-start+1);
        }
        return res;
    }
}
