class Solution {
    public int trailingZeroes(int n) {
    //     int res=fact(n);
    //     int cnt=0;
    //     while(res>0){
    //         int digi=res%10;
    //         if(digi==0){
    //             cnt++;
    //         }
    //         res=res/10;
    //     }
    //     return cnt;
    // }
    // public int fact(int n){
    //     int fact=1;
    //     for(int i=n; i>0; i--){
    //         fact=fact*i;
    //     }
    //     return fact;

    int cnt=0;
    while(n>=5){
        n=n/5;
        cnt=cnt+n;
    }
    return cnt;
    }
}