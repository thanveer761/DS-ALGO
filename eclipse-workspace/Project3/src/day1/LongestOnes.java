package day1;

import org.junit.Test;


public class LongestOnes {
	
	@Test
	public void testData1() {
		int[] nums= {1,1,1,0,0,0,1,1,1,0};
		int k=2;
	longestOne(nums, k);
	}
	
	/*
	 * initialize variable left and right as 0
	 * when right==0 deduct k
	 * when k<0 move left
	 * increment k
	 */
	public void longestOne(int[]nums, int k) {
		int left=0, right =0;
		for (right = 0; right < nums.length; right++) {
			if(nums[right]==0) {
				k--;
			}
			if(k<0) {
				if(nums[left]==0) {
					k++;
				
			}
			left++;
		}
	}
		System.out.println(right-left);	
	}
}
