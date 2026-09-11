class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int ans[]=merge(nums1,nums2);
        if(ans.length%2==0){
            double result=(double)(ans[ans.length/2]+ans[(ans.length/2)-1])/2;
            return result;
        }else{
            double result=(double)ans[ans.length/2];
            return result;
        }
      
        
    }
    public int [] merge(int []arr1, int []arr2){
        int [] ans=new int[arr1.length+arr2.length];

        int p1=0,p2=0,p3=0;

        while(p1<arr1.length || p2<arr2.length){
            int num1=p1<arr1.length ? arr1[p1]:Integer.MAX_VALUE;
            int num2=p2<arr2.length ? arr2[p2]:Integer.MAX_VALUE;
            if(num1<num2){
                ans[p3]=num1;
                p1++;
            }else{
                ans[p3]=num2;
                p2++;
            }
            p3++;
        }
        return ans;
    }
}