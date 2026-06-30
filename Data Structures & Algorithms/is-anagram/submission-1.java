class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length()!=t.length()){
            return false;
        }

        boolean res=true;

        HashMap<Character,Integer> table = new HashMap<Character,Integer>();



        for(int i=0;i<s.length();i++){
            table.put(s.charAt(i),table.getOrDefault(s.charAt(i),0)+1);
            table.put(t.charAt(i),table.getOrDefault(t.charAt(i),0)-1);
        }

        for(char i : table.keySet()){
            if(table.get(i)!=0){
                return false;
            }
        }
return true;
    }
}
