class Solution {
    public int[] sortArrayByParityII(int[] nums) {
    //    int n=nums.length;
    //    int ans[]=new int[n];
    //    int even=0;
    //    int odd=1; 
    //    for(int x:nums){
    //     if(x%2==0){
    //         ans[even]=x;
    //         even+=2;
    //     }else{
    //         ans[odd]=x;
    //         odd+=2;
    //     }
    //    }
    //    return ans;

    // int j=1;
    // for(int i=0; i<nums.length; i+=2){
    //     if(nums[i]%2==1){
    //         while(nums[j]%2==1){
    //             j=j+2;
    //         }
    //         int temp=nums[i];
    //         nums[i]=nums[j];
    //         nums[j]=temp;
    //     }
    // }
    // return nums;

    int n=nums.length;
    int even=0;
    int odd=1;
    while(even<n && odd<n){
        if(nums[even]%2==0){
            even=even+2;
        }else if(nums[odd]%2==1){
            odd=odd+2;
        }else{
            int temp=nums[even];
            nums[even]=nums[odd];
            nums[odd]=temp;
            even=even+2;
            odd=odd+2;
        }
    }
    return nums;

    }
}