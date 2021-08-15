package GroupProject;

public class Task06 {

	public static void main(String[] args) {
		// Write a Java Program to print the first 10 numbers of Fibonacci series
		
		int[][] a = {
				{2, 4, 6, 8, 10},
				{1, 3, 5, 7, 9},
			};
	        int even = 0;
	        for (int i = 0; i < a.length; i++) {
	          for(int j=0; j<a[i].length; j++){
	          if (i % 2 == 0)
	                even += a[i][j];
	           }
	          System.out.println(even);

	}
	}
}
