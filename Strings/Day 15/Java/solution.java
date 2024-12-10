class Solution {
    public String addBinary(String s1, String s2) {
        StringBuilder result = new StringBuilder();
        int carry = 0;
        
        int i = s1.length() - 1;
        int j = s2.length() - 1;
        
        while (i >= 0 || j >=0) {
            int sum = carry;
            
            if(i >= 0)
                sum += s1.charAt(i--) - '0';
            if (j >= 0)
                sum += s2.charAt(j--) - '0';
            
            result.append(sum % 2);
            carry = sum / 2;
        }
        
        if (carry != 0) {
            result.append(carry);
        }
        
        String final_result = result.reverse().toString();
        
        int FirstNonZeroIndex = 0;
        
        while (FirstNonZeroIndex < final_result.length() && 
        final_result.charAt(FirstNonZeroIndex) == '0') {
                        FirstNonZeroIndex++;       
    }
    
    return final_result.substring(FirstNonZeroIndex);
}
}
