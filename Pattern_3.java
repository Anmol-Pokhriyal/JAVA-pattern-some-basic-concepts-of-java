import java.util.Scanner;

public class Pattern_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int size;
		
	    Scanner scan=new Scanner(System.in); 
	System.out.print("Enter the integer number: ");
	size=scan.nextInt();
	
	for (int row=1; row<=size; row++){
	  System.out.print("*");
	}
	System.out.print("\n");
	
	for (int coloum=1; coloum<=size-2; coloum++){
	  for (int row=1; row<=size; row++){
	  if(row==1||row==size){
	    System.out.print("*");
	  }
	  
	  else{
	    System.out.print(" ");
	  }
	  
	}
	  System.out.print("\n");
	}
	for(int row=1; row<=size; row++){
	  System.out.print("*");
	}
	System.out.print("\n");
	
	
	}

}

/*
 Enter the integer number: 9
*********
*       *
*       *
*       *
*       *
*       *
*       *
*       *
*********

*/
