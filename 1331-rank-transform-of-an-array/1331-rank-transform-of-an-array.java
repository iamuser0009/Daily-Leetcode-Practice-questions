class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] ans = Arrays.copyOf(arr, arr.length);
        Arrays.sort(ans);
        int rank=1;
        HashMap<Integer, Integer> map = new HashMap<>();
        for( int an: ans)
        {
            if(!map.containsKey(an)){
                map.put(an, rank++);
            }
        }
        for( int i=0; i<arr.length; i++)
        {
            arr[i]= map.get(arr[i]);
        }
        return arr;   
        
    }
}