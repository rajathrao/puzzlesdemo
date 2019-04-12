import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateElementsFromArray {
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String names[] = {"Java", "C", "Java"} ; 
		
		for(int i =0; i<names.length;  i++) {
			
			for (int j =i+1;j<names.length; j++) {
				
				if(names[i]==names[j]) {
					
					System.out.println(names[i]);
				}
			}
		}
		
		System.out.println("-----------------------------------------------------");
		
/// Using Java hashset
		
		
		Set<String> str = new HashSet<>();
		
		for(String name:names ) {
			
			if(str.add(name)==false) {
				
				System.out.println(name);
			}
		}
		
		System.out.println("......................................................");
		
		
		/// HashMap 
		Map<String,Integer> str1 = new HashMap<String, Integer>();
		for (String name:names ) {
			
			Integer count=str1.get(name);
			
			if(count==null) {
				
				str1.put(name,1);
			}
			
			else {
				
				str1.put(name, ++count);
			}
		}
		
		/// get the value sfrom hashmap
		
		Set<Entry<String,Integer>>entrySet= str1.entrySet();
		for(Entry<String,Integer> entry: entrySet) {
			if(entry.getValue()>1) {
				
				System.out.println("duplicate element is "+ entry.getKey());
			}
			
		}
		
		
		
		
		
		

	}

}
