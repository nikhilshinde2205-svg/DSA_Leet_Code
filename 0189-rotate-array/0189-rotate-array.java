class Solution {
    public void rotate(int[] nums, int k) {
        int idx=0;
        int curr=nums[0];
        int n=nums.length;
        int count=0;
        for(int i=0;count <n;i++){
             idx=i;
             curr=nums[idx];
            do{
                
                int next=nums[(idx+k)%n];
                nums[(idx+k)%n]=curr;
                curr=next;
                idx=(idx+k)%n;
                count=count+1;
            }while(idx != i);
        }
        
    }
}