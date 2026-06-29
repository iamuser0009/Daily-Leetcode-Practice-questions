class Interval implements Comparable <Interval>{
    int start;
    int end;
    //constructor 
   Interval(int start, int end){
     this.start = start;
     this.end = end;
    }
    public int compareTo(Interval other)
    {
        return this.end - other.end;
    }
}


class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        List <Interval> pq = new ArrayList<>();
        for(int arr[] : intervals){
            pq.add(new Interval(arr[0], arr[1]));
        }
        Collections.sort(pq);
        int count =0;
        int lastend =Integer.MIN_VALUE;
        for(Interval inter: pq){
            if(inter.start <lastend) count++;
            else{
                lastend = inter.end;
            }
        }
        return count;

    }
}