
public class findingMissingNumInArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("hi");
		
		int arr[] = {-2,0,1,2,3,4,5};
		
		int sum = 0;
		for(int i=0;i<arr.length;i++) {
			
			sum = sum+arr[i];
		}
		
		System.out.println(sum);
		int sum1= 0;
		
		for (int j=-2; j<=5;j++) {
			
			sum1=sum1+j;
		}
		
		System.out.println(sum1);
		
		int res = sum1-sum;
		
		System.out.println("missing no is " + res);

	}

}
