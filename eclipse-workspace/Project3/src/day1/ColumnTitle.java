package day1;

import org.junit.Test;

public class ColumnTitle {

	@Test
	public void testData1() {
		String s="AB";
		int op = columnTitle(s);
		System.out.println(op);

	}
	public int columnTitle(String s) {
		int count=0;
		char[] ascii = s.toCharArray();
		for (int i = 0; i < ascii.length; i++) {
		   int temp= ascii[i]-'A'+1;
		   count=count*26+temp;
		}
		return count;
		
	}
}
