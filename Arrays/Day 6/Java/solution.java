class Solution {
    // Function to find the majority elements in the array
    public List<Integer> findMajority(int[] nums) {
        
        // Calculate the length of the array
        int n = nums.length;
        
        // Create a hashmop
        HashMap<Integer,Integer> freq = new HashMap();
        
        // Create a List to return as function accepts list
        List<Integer> res = new ArrayList<>();
        
        for(int ele:nums) {
            freq.put(ele,freq.getOrDefault(ele,0)+1);
        }
        
        for(Map.Entry<Integer,Integer> it:freq.entrySet()) {
            
            int ele = it.getKey();
            int val = it.getValue();
            
            if(val > n/3)
                res.add(ele);
        }
        
        if(res.size()==2 && res.get(0) > res.get(1)) {
            
            int temp = res.get(0);
            res.set(0,res.get(1));
            res.set(1,temp);
        }
        
        return res;
        
        
    }
}
