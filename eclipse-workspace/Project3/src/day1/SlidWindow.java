package day1;

import java.util.Arrays;

import org.junit.Test;

public class SlidWindow {
	@Test
	public void testData1() {
		int[] nums= {1,7,4,3,1,2,1,5,1};
		int k=7;
	slidWindow(nums, k);

	}
	public void slidWindow(int[] nums, int k) {
		int left=0,sum=0;
		for (int right = 0; right < nums.length; right++) {
			sum+=nums[right];
			while(sum>k) {
			sum-=nums[left++];
			}
			if(sum==k);
			System.out.println(left+","+right);
		}
				
		

	}

}
