package day1;

import org.junit.Test;

public class MajorityElement {

	@Test
	public void testData1() {
		int[] nums= {3,2,3};
		int majorityElem = majorityElem(nums);
		
		
		
		System.out.println(majorityElem);
	}
	/*initialize i=0, j=0
	 * traverse through 2 for loops 
	 * if i and j are equal
	 * returns i
	 */
	public int majorityElem(int[] nums) {
		int count=0, temp=0;
		for (int i = 0; i < nums.length; i++) 
			if(count==0) {
				temp=nums[i];
			}
			else if(nums[i] == temp){
				count++;}
			else {
				count--;
			}
		return temp;
	}
}
