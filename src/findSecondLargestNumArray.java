
public class findSecondLargestNumArray {
	
	
	public static int secondHighest(int[] arr) 
	
	{
int first = arr[0];
int second = arr[0];
for(int elem : arr) {
	if(elem > first) 
	{
	 second = first;
	 first = elem;
		   }
		  }
		  return second;
	}	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ar []= {2,5,3,8,7};
		//System.out.println(findSecondLargestNumArray.secondHighest(ar));w
		
		

	}

}
