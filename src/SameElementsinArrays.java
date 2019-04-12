import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class SameElementsinArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr1 = new int[]{1,2,3};
		int[] arr2 = new int[]{3};
		List<int[]> alist = Arrays.asList(arr1);
		List<int[]> blist = Arrays.asList(arr2);

		HashSet<int[]> aset =  new HashSet<>(alist);
		aset.retainAll(blist);

		System.out.println(aset);
		
		
		

	}

}
