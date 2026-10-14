class Solution {
    public String maxSumOfSquares(int num, int sum) {
        int maxsum = 9 *num;
        if( maxsum < sum) return "";
    
        int ninepossible = sum/9;
        int remainder = sum % 9;

        StringBuilder sb = new StringBuilder();
        for( int i=1 ; i<= ninepossible; i++){
            sb.append(9+"");
        }
        if(remainder >0 ) sb.append(remainder+"");
        while (sb.length() < num) sb.append("0");
        return sb.toString();

        
    }
}