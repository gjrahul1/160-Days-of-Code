class Solution {
    public int getSecondLargest(int[] arr) {
        
        if (arr.length < 2) {
            
            return -1;
            
        }
        
        int Max = Integer.MIN_VALUE;
        int Min = Integer.MIN_VALUE;
        
        for(int i = 0; i<arr.length; i++) {
            
            if(arr[i] > Max) {
                Min = Max;
                Max = arr[i];
                
            } else if (arr[i] > Min && arr[i] < Max) {
                Min = arr[i];
            }
        }
        return (Min == Integer.MIN_VALUE) ? -1 : Min;
    }
}
