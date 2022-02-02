/*
 
Enter the number of rows: 
6
******
*****
****
***
**
*

*/

import java.util.Scanner;

public class pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);

		    System.out.println("Enter the number of rows: "); //to take input from user

		    int rows = sc.nextInt();

		    for (int i= rows-1; i>=0 ; i--)

		    {

		    for (int j=0; j<=i; j++)

		    {

		    System.out.print("*");

		    }

		    System.out.println();

		    }
		    

	}

}
