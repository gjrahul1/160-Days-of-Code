
class Solution {
    // Function to find maximum product subarray
    int maxProduct(int[] arr) {
        
        if(arr == null || arr.length == 0) {
            return 0;
        }
        int minProduct = arr[0];
        int maxProduct = arr[0];
        int res = arr[0];
        
        for(int i = 1; i<arr.length; i++) {
            
            if(arr[i] == 0) {
                maxProduct = 1;
                minProduct = 1;
                res = Math.max(res,0);
                continue;
            }
            
            int tempMax = maxProduct;
            maxProduct = Math.max(arr[i],Math.max(arr[i]*maxProduct,arr[i]*minProduct));
            minProduct = Math.min(arr[i],Math.min(arr[i]*tempMax,arr[i]*minProduct));
            res = Math.max(res,maxProduct);
        }
        
        return res;
    }
}
