package day1;

import org.junit.Test;

public class ClimbingStairs {

	@Test
	public void testData1() {
		int n = 3;
		int climbinStairs = climbinStairs(n);
		System.out.println(climbinStairs);
	}

	public int climbinStairs(int n) {

		int sum=0;
		if(n==1)
			return 1;
		if (n==2)
			return 2;
		if(n>=1||n<=45)
		{

			int a=1;
			int b=2;
			for(int i=3;i<=n;i++)
			{
				sum= a+b;
				a=b;
				b=sum;
			}
		}
		return sum;
	}}
