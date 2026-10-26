class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
HashMap<Integer,Integer> hmap =new HashMap<Integer,Integer>();

for(int i : nums){
    hmap.put(i,hmap.getOrDefault(i,0)+1);
}

PriorityQueue<int[]> queue = new PriorityQueue<int[]>( (a,b) -> Integer.compare(b[1],a[1]));

for (int i : hmap.keySet()){
    queue.add(new int[] {i, hmap.get(i)});
}

int res [] = new int[k];

for(int i=0; i<k ;i++){
    res[i]=queue.poll()[0];
}

return res;


    }
}
