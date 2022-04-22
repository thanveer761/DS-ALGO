package day1;

import java.util.HashSet;

import org.junit.Test;

public class Pract {

	@Test
	public void testData1() {
		int n=99;
		boolean pract = pract(n);
		System.out.println(pract);
	}
	public boolean pract(int n) {
		 HashSet<Integer> set = new HashSet<Integer>();
	        
	        while (n!=1){
	            int result = 0;
	            while (n!=0){
	                result += Math.pow(n%10,2);
	                n/=10;
	            }
	            if (set.contains(result)) return false;
	            set.add(result);
	             n=result;
	        }
	        return true;      

	}
	}
