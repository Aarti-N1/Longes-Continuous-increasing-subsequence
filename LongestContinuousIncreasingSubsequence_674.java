package easy;

public class LongestContinuousIncreasingSubsequence_674 {
	public int findLengthOfLCIS(int[] nums) {
        int start=0, end=0, maxLength=0;
        while(end<nums.length){
            if(end-1>=0 && nums[end]<=nums[end-1]){
                start = end;
            }
            maxLength = Math.max(maxLength, end-start+1);
            end++;
        }
       
        return maxLength;
    }
}
