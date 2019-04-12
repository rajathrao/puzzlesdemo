import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 String str = "RAJATH";
		    Map<Character, Integer> charMap = new HashMap<Character, Integer>();
		    char[] arr = str.toCharArray();
		    System.out.println(arr);

		    for (char value: arr) {

		       if (Character.isAlphabetic(value)) {
		           if (charMap.containsKey(value)) {
		               charMap.put(value, charMap.get(value) + 1);

		           } else {
		               charMap.put(value, 1);
		           }
		       }
		    }

		    System.out.println(charMap);
		    System.out.println("*********************");
		    Set<Character>keys = charMap.keySet();
		    for(Character ch : keys ) {
		    	if(charMap.get(ch)>1) {
		    		System.out.println(ch +"------------"+charMap.get(ch));
		    	}
		    }
		    

	}

}
