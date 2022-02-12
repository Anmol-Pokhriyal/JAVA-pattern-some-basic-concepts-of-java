
public class ReverseString {

	public static void main(String[] args) {
		
		String s="Ram";
char ch[]=s.toCharArray();
String reverse=" ";

for(int i=ch.length-1;i>=0;i--)
{
	reverse+=ch[i];
	
}
		

		System.out.println("Reverse is: "+reverse);
	}

}
