class Solution {
    public long minimumMaxValue(int n, int index, int value) {
        if (value == 1 && n > 1) {
            return -1;
        }
        int factor = function(value);
       
        //left possible
         if(index > (value-factor)/2) {
            return -1;
        };
        //rightpossible
         int right = n - 1 - index;

        if (right == 0) {
            return value;
        }
        
            return (long) value+factor+ 2*(right-1) ;
        
        //left possible
       

        
        
    }
    // getting factor
    int function (int number)
    {
        for( int i=2; i*i <= number ; i++){
            if(number % i ==0) return i;
        }
        return number;
    }
}