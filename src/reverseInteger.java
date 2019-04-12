
public class reverseInteger {
	
	public static void revNum(int num) {
		
		//
		
		if (num<10 && num>-10 ) {
			
			System.out.println(num +"is a single digit num so rev would be thee same");
		}
		
		else if (num >10 || num <-10) {
			
		
			int rev=Integer.reverse(num);
			System.out.println();
		}
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int num = 2356 ; 
	
	int rev = 0;
	
	while (num!=0) {
		
		rev = rev*10+num%10;
		num = num/10;
		
		
		
	}
	
	System.out.println(rev);
	
	
	// using string buffer
	
	StringBuffer s = new StringBuffer(String.valueOf(123));
	System.out.println(s.reverse());
	
	
	

	}

}
