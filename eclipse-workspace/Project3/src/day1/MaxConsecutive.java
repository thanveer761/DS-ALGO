package day1;

import org.junit.Test;

public class MaxConsecutive {
	@Test
	public void testData1() {
		int[]	nums= {1,1,0,1,1,1};
		int maxConsecutive = maxConsecutive(nums);
		System.out.println(maxConsecutive);
	}
	/*initialize  count as 0
	 * traverse through each index
	 * if nums[i]==1
	 * 
	 */
	public int maxConsecutive(int[] nums) {
		int count=0, max=0;

		for (int i = 0; i < nums.length; i++) {
			if(nums[i]==1) {
				count++;
			}else count=0;
			max=Math.max(count, max);
		}

		return max;
		}
}
