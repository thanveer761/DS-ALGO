package day1;

import org.junit.Test;

public class MaxAverageSubArray {
	@Test
	public void testData1() {
		int[] nums= {1,12,-5,-6,50,3};
		int k=4;
double maxAverage = maxAverage(nums, k);
System.out.println(maxAverage);
	}
	/*
	 * use 2 for loops to traverse  until k
	 * if sum of element <k 
	 * increse count++;
	 * if sum of element >k divide by 4 and return the K
	 */
	public double maxAverage(int[] nums, int k) {
		
		int count =0;
		for (int i = 0; i < k; i++) {
				count+=nums[i];
		}
		int curr =count;
			for (int i = k; i < nums.length; i++) {
				 curr -= nums[i-k];
		            curr += nums[i];
		            count = Math.max(curr, count);
			}
			return (count*1.0)/k;
	}
}
