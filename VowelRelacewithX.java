import java.util.Scanner;

public class VowelRelacewithX {
	public static void main(String[] args) {
		
	
		    Scanner scan = new Scanner(System.in);
		    System.out.println("Enter the string");
		  
		    String str = scan.nextLine();
		    System.out.println(str.replaceAll("[AaEeIiOoUu]", "X"));

    
	}
}



