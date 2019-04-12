
public class RemoveSpecialCharachters {

	
	public static void removeSpeChar(String sentence) {
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s= "传/傳  1234509!";
				
				// regular expression
				
		s= s.replaceAll("[^a-zA-Z0-Z9! ]", "");
		System.out.println(s);

	}

}
