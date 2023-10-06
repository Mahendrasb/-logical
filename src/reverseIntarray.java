
public class reverseIntarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {12,65,45,34,43,65,87};
		
		System.out.println("before reverse:");
		for(int ele:arr) {
			System.out.print(ele+" ");
		}
		System.out.println();
		System.out.println("After reverse");
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
		}
	}

}
