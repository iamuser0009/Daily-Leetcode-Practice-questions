class Solution {
    public String largestNumber(int[] nums) {
        Comparator<Integer> comp = new Comparator <Integer>(){
            public int compare(Integer a, Integer b){
                String s1 = String.valueOf(a);
                String s2 = String.valueOf(b);
                return (s2 + s1).compareTo(s1 + s2);
            }
        };
         
        Integer[] arr = new Integer[nums.length];

        for (int i = 0; i < nums.length; i++) {
            arr[i] = nums[i];
        }

        Arrays.sort(arr, comp);
        StringBuilder sb = new StringBuilder();
        for(int num : arr){
            sb.append(num);
        }
        if (sb.charAt(0) == '0') {
    return "0";
}
        return sb.toString();

    }
}