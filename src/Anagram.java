import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Anagram {

	public boolean isAnagram() {
	char[] word1 = "icema".toCharArray();
	char[] word2 = "cienma".toCharArray();

	Map<Character, Integer> lettersInWord1 = new HashMap<Character, Integer>();

	for (char c : word1) {
	    int count = 1;
	    if (lettersInWord1.containsKey(c)) {
	        count = lettersInWord1.get(c) + 1;
	    }
	    lettersInWord1.put(c, count);
	}

	for (char c : word2) {
	    int count = -1;
	    if (lettersInWord1.containsKey(c)) {
	        count = lettersInWord1.get(c) - 1;
	    }
	    lettersInWord1.put(c, count);
	}

	for (char c : lettersInWord1.keySet()) {
	    if (lettersInWord1.get(c) != 0) {
	        return false;
	    }
	}

	return true;	
			
	}
	
	
	public boolean isAnagrams(String firstWord, String secondWord) {
	     char[] word1 = firstWord.replaceAll("[\\s]", "").toCharArray();
	     char[] word2 = secondWord.replaceAll("[\\s]", "").toCharArray();
	     Arrays.sort(word1);
	     Arrays.sort(word2);
	     return Arrays.equals(word1, word2);
	}
	
	
	public static void main(String[] args) {
	
		Anagram a = new Anagram();
		//System.out.println(a.isAnagram());
		System.out.println(a.isAnagrams("mary", "yram"));;
		
	}
}
