package day1;

import org.junit.Test;

public class FindMaxSubArray {
	
	@Test
	public void testData1() {
		int[] nums= {-2,1,-3,4,-1,2,1,-5,4};
		int output = findMaxSubArray(nums);
		System.out.println(output);

	}
	/*
	 * int left=0 right=0
	 * if nums[i]
	 */
	public int findMaxSubArray(int[] nums) {
		  int left = 0, right = 0;
	        int sum = 0, max = Integer.MIN_VALUE;
	        while(right <= nums.length-1){
	            sum += nums[right];
	            max = Math.max(sum, max);
	            
	            if(sum <= 0){
	                left = right;
	                sum = 0;
	            }
	            
	            right++;
	        }
	        
	        return max;
	    }

}
