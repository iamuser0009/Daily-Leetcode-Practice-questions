class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> list = new ArrayList<>();
        for( int i=1; i<=9; i++)
        {   int number =i;
            for( int j= i+1; j<=9; j++)
            {
                number = number*10+j;
                list.add(number);
            }
        }
         List<Integer> list2 = new ArrayList<>();
        for( int i=0; i< list.size(); i++)
        {
            if(list.get(i) >=low && list.get(i) <=high)
            list2.add(list.get(i));
        }
        Collections.sort(list2);
        return list2;
        
    }
}