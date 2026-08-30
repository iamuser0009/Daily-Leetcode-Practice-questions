class Solution {
    public long pickGifts(int[] gifts, int k) {
 PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0 ; i<gifts.length; i++)
        {
            pq.offer(gifts[i]);
        }
        while(k !=0){
            int num = pq.poll();
            num= (int)Math.sqrt(num);
            pq.offer(num);
            k--;
        }
        long ans =0;
        while(pq.size() >0)
        {
            ans+= pq.poll();
        }
        return ans;

        
    }
}