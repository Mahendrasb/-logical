package arrayslogical;

public class sumofele2Darray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		int arr[][]= {{1,2,3},{4,5,6},{7,8,9}};
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				sum+=arr[i][j];
				
			}
		}
		System.out.println("sum of all elements in 2d array is:"+sum);
	}

}
