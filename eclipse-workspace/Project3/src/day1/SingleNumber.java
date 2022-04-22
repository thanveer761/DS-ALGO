package day1;

import java.util.Arrays;

import org.junit.Test;

public class SingleNumber {
	@Test
	public void testData1() {
		int[] nums = {4,1,2,1,2};
		int op = singleNumber(nums);
		System.out.println(op);
		
	}
	public int singleNumber(int[] nums) {
		  Arrays.sort(nums);
	        if(nums.length==1) return nums[0];
	        if(nums.length==0) return 0;
	        for(int i=0;i<nums.length-1;i++) 
	            if(nums[i]!=nums[i+1]) 
	            	return nums[i];
	            else i++;
	        return nums[nums.length-1];
	    }

}
