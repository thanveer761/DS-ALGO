package day1;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class SubSequentString {
	@Test
	public void testData1() {
		String s = "b", t = "abc";
		boolean subSequentString = subSequentString(s, t);
		System.out.println(subSequentString);
		
	}
	public boolean subSequentString(String s, String t) {
		if (s.length() == 0) return true;
        int left = 0, right = 0;
        while (right < t.length()) {
            if (t.charAt(right) == s.charAt(left)) {
            	left++;
                if (left == s.length()) return true;
            }
            right++;
        }
        return false;
    
	}
}
