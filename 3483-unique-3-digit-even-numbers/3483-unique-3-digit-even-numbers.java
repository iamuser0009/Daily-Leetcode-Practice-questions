class Solution {
    public int totalNumbers(int[] digits) {
        int count = 0;
        int[] arr = new int[10];
        
        for (int n : digits) {
            arr[n]++;
        }
        
        for (int i = 100; i <= 999; i+=2) {
            int ones = i % 10;
            int tens = (i / 10) % 10;
            int hundred = i / 100;

            arr[ones]--;
            arr[tens]--;
            arr[hundred]--;
            
            if (arr[ones] >= 0 && arr[tens] >= 0 && arr[hundred] >= 0) {
                count++; 
            }  

            
            arr[ones]++;
            arr[tens]++;
            arr[hundred]++;
        }
        
        return count;
    }
}
