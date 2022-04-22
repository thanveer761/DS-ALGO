package day1;

import org.junit.Test;

public class InsertPosition {
	@Test
	public void testData1() {
		int[] nums = {1,3,5,6};
		int target =2;
		int op = insertPosition(nums, target);
		System.out.println(op);

	}
	/*
	 * 
	 */
	public int insertPosition(int[] nums, int target) {
		int res=0;
		for(int i=0;i<nums.length;i++)
		{
			if(nums[i]==target)
			{
				res=i;
			}
			else if(target>nums[i])
			{
				res=i+1;
			}
		}

		return res;

	}

}
