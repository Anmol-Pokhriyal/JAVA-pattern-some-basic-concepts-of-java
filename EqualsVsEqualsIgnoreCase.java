
public class EqualsVsEqualsIgnoreCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		Equals() Vs  EqualsIgnoreCase()
		
		String str1 = new String("SAWAN");
		String str2 = new String("Sawan");
		
		if(str1.equals(str2))
		{
			System.out.println("They are equal");
		}
		else
		{
			System.out.println("They are not equal");
		}
		
		if(str1.equalsIgnoreCase(str2))
		{
			System.out.println("Both strings are equal");

		}
		else
		{
			System.out.println("Strings are not equal");
	
		}
	}

}
