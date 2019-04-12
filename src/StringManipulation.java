
public class StringManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Hi How How";
		String str1 = "Hi How how";
		System.out.println(str.length());
		
		System.out.println(str.charAt(5));
		System.out.println(str.indexOf("H"));
		System.out.println(str.indexOf("H", str.indexOf("H", str.indexOf("H")+1))+1);
		
		//trim
		
		String s ="   RT  ";
		System.out.println(s.trim());
		// replace 
		
		String date = "12-24-2018";
		System.out.println(date.replace('-', '/'));
		
		//Split methid
		
		// string comparison
		
		System.out.println(str.equals(str1));
		
		

	}

}
