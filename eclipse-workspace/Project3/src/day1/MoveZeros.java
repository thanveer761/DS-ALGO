package day1;

import java.util.Arrays;

import org.junit.Test;

public class MoveZeros {

	@Test
	
	public void testData2() {
		int[] nums= {0,1,0,3,12};
		int[] moveZeros = moveZeros(nums);
		System.out.println(Arrays.toString(moveZeros));

	}

	/*assign 2 variable left as 0 and  right as 0
	 * Traverse through each index
	 * if nums[left] is equal to 0
	 * left increment
	 * if nums[right]is not equal to 0
	 * decrement --
	 * 
	 */
	public int[] moveZeros(int[] nums) {
		int left=0, right=0;
		while(right<nums.length) {
			if(nums[right]!=0) {
				int temp=nums[right];
				nums[right]=nums[left];
				nums[left++]= temp;
			}
			right++;
			}
			return nums;
	}
}