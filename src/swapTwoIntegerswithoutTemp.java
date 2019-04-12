
public class swapTwoIntegerswithoutTemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 5;
		int y =6;
		int temp;
		
	// with third variable
	temp = x;
	x=y;
	y = temp;
	
	System.out.println(x);
	
		
	// without a temp variable
	
	// mathematical operations
	x = x+y;
	y = x-y;
	x = x-y;
	
	// multiply by multiplication operator 
	
	x = x*y;  // 6*5 = 30 = x
	y=x/y;    // 5/6 = 5 = y
	x = x/y;  // 30/6
	
	/// XOR operator 
	y=y^x;
	x= x^y;
	
	
	

	}

}
