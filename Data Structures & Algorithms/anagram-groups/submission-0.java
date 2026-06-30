class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        int n= strs.length;

        HashMap<String, List<String>> map =new HashMap<String, List<String>>();

    for (int i=0;i<n;i++){

        char[] s= strs[i].toCharArray();
        Arrays.sort(s);

        String news= new String(s);

        map.putIfAbsent(news,new ArrayList<String>());
        map.get(news).add(strs[i]);

    }
        return new ArrayList<>(map.values());
    }
}
