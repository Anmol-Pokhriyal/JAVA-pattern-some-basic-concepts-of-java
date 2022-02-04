
/*
 
 Enter the number of rows: 
9
1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15 
16 17 18 19 20 21 
22 23 24 25 26 27 28 
29 30 31 32 33 34 35 36 
37 38 39 40 41 42 43 44 45 

 
 */

import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      Scanner sc = new Scanner(System.in); // rows value from the user    

	        System.out.println("Enter the number of rows: ");    

	        int rows = sc.nextInt();  
	        int k=1;

	        for (int i = 1; i <= rows; i++) 

	        {
	            for (int j = 1; j <= i; j++)

	            {
	                System.out.print(k+" ");
	                k++;
	            }
                 System.out.println();

	        }        

	}

}
