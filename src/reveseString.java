
public class reveseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "hi";
		
		String b = "world";
		
		String a1 = a+b; 
		
		a=a1.substring(b.length()-a.length());
		b=a1.substring(0,a1.length()-b.length());
		//a=a1.substring(a1.length()-b.length());
		System.out.println(a);
		System.out.println(b);
		

	}

}
