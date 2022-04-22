package day1;

public class Arrayssort {

	public static void main(String[] args) {
		 int intArrs[] = { 43,22,56,71 };

		  System.out.print("int arrays: [");
		  for (int i=0; i< intArrs.length; i++) {
		   System.out.print(intArrs[i]);
		   if(i < intArrs.length-1) {
		    System.out.print(",");
		   }
		  }
		  System.out.print("]");
		  
		  StringBuilder builder = new StringBuilder();
		  for (int num : intArrs) {
		   builder.append(num);
		  }
		  int number = Integer.parseInt(builder.toString());
		  
		  System.out.print(" -> converted: ");
		  System.out.println(number);
		  
		 int rev = 0;
		  while(number!=0) {
		 	 rev =rev *10 +number % 10;
		 	number =number/10;
		  }
		 System.out.println(rev);
	}

}
