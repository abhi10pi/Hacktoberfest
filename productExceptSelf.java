class Solution {
    public int[] productExceptSelf(int[] nums) {
      int n=nums.length;
      int left[]=new int[n];
      int right[]=new int[n];
      int output[]=new int[n];

      int leftP=1;
      for(int i=0;i<n;i++){
        left[i]=leftP;
        leftP*=nums[i];
      }

      int rightP=1;
      for(int i=n-1;i>=0;i--){
        right[i]=rightP;
        rightP*=nums[i];
      }

      for(int i=0;i<n;i++){
        output[i]=left[i]*right[i];
      }
      return output;
    }
}
