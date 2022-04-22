package day1;

import org.junit.Test;

public class ReverseVowels {

	@Test
	public void testData1() {
		String s = "hello";
		System.out.println(reverseVowels(s));
	}
	/*intialize a temp variable
	 * use for iterator trvaerse thro the loop
	 * 
	 * 
	 */
	public String reverseVowels(String s) {
		char[] ch = s.toCharArray();
		int left=0,right=ch.length-1;
		while(left<right) {
			if(isVowels(ch[left])&&isVowels(ch[right])) {
				char temp=ch[left];
				ch[left]=ch[right];
				ch[right]=temp;
				left++;
				right--;
			}else if(!isVowels(ch[left])) {
				left++;
			}
			else if(!isVowels(ch[right])){
				right--;
			}
			

		}
		return String.valueOf(ch);
	}
	public boolean isVowels(char ch) {
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u' )
			return true;
		else 
			return false;
	}
}
