
public class EqualstovsEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		== vs equals()
		
		String str1 = new String("SAWAN");
		String str2 = new String("SAWAN");

		System.out.println(str1==str2);         //false
		System.out.println(str1.equals(str2)); //true

	}

}
