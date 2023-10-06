package arrayslogical;

public class removeDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,2,3,4,4,5,6,6,7};
		int len=a.length;
		int temp[]=new int[len];
		int j=0;
		for(int i=0;i<len-1;i++) {
			if(a[i]!=a[i+1]) {
				temp[j++]=a[i];
			}
		}
		temp[j++]=a[len-1];
		for(int k=0;k<j;k++) {
			System.out.print(temp[k]+" ");
		}
	}

}
