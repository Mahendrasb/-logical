package arrayslogical;

import java.util.Arrays;

public class secondLargeele {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {11,22,33,44,55,66,77,88,99};
		int n=a.length;
		Arrays.sort(a);
		
		
		System.out.println("second largest:"+a[n-2]);
	}

}
