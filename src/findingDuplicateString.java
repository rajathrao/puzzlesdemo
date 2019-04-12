
public class findingDuplicateString {
	
	public static void main(String[] args) {
		
		
		int [] arr = { 1, 15,10,2,10,15} ;
		
		int pos1=0;
		int pos2 =0;
		
		for(int i = 0; i<arr.length; i++) {
			
			for(int j = i+1; j<arr.length; j++) {
				
				if(arr[i]+arr[j]==25) {
					
					pos1=i;
					pos2=j;
					
					
				}
				
				
			}
			
			
		}

		System.out.println(pos1);
		
		System.out.println(pos2);
		
		
	}
	

}
