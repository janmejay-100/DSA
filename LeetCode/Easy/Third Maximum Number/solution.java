class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);

        int i=0;
        int j=nums.length-1;

        //Reverse
        while(i<j){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }

        //Duplicate remove
        int k=1;
        for(int p=1; p<nums.length; p++){
            if(nums[p]!=nums[p-1]){
                k++;
            }

        if(k==3){
            return nums[p];
        }
        }
        return nums[0];
    }   
}