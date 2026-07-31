class Solution {
    public int minimumPushes(String word) {
      HashMap<Character, Integer> map = new HashMap<>();
      for(char ch : word.toCharArray()){
        map.put(ch , map.getOrDefault(ch, 0)+1);
      }
      List<Integer>list = new ArrayList<>();
      for(int num : map.values()){
          list.add(num);
      }
      Collections.sort(list);
      int n = list.size();
      int diff =0;
      int multiple =1;
      int ans =0;
      for(int i=n-1; i>=0; i--){
        int num = list.get(i);
        ans+= num*multiple;
        diff++;
        if( diff ==8){
            multiple++;
            diff =0;
        }
      }
      return ans;

    }
}