class Solution(object):
    def algo(self,nums,start,end):
        while(start < end):
            temp = nums[start]
            nums[start] = nums[end]
            nums[end] = temp
            start+=1
            end-=1

    def rotate(self, nums, k):
        if(k == 0 or k==len(nums)):
            return
        
        if(k>len(nums)):
            k=k%len(nums)

        length = len(nums)

        self.algo(nums,0,length-1)

        self.algo(nums,0,k-1)

        self.algo(nums,k,length-1)
        
