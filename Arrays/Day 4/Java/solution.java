class Solution {
    
    static void reverse(int[] arr,int start, int end) {
        while(start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }    
    }
    
    static void rotateArr(int arr[], int d) {
        int len = arr.length;
        if(d == 0 || d==len) {
            return;
        }
        
        if(d > len) {
            d = d%len;
        }
        
        //Reverse the first d elements
        reverse(arr,0,d-1);
        
        //Reverse the remaining elements
        reverse(arr,d,len-1);
        
        //Reverse the entire array
        reverse(arr,0,len-1);
    }
}
