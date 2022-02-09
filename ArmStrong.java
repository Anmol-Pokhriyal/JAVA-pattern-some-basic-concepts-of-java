
public class ArmStrong {
	public static void main(String[] args) {
		
		int n = 371;
		int armStrong=0;
		int num=n;

		while(num > 0)
		{
			int remainder = num % 10; // 5, 4, 3
			num = num / 10;
			armStrong = armStrong +(remainder*remainder*remainder);

			
		}
		if(armStrong==n) 
		{
System.out.println("ArmStrong Number is: "+armStrong);
		}
		else
		{
			System.out.println(n + " Not a ArmStrong");

		}
	
	}

}
