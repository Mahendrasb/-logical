package arrayslogical;

import java.util.Arrays;

public class sortArray {
	public static void main(String[] args) {
		int a[]= {45,7,65,88,94,23,43,22,12,4,6,2};
		System.out.println("array element before sorting");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.println("Array Elements after sorting");
		//using predefined method
//		Arrays.sort(a);
//		for(int i=0;i<a.length;i++) {
//			System.out.print(a[i]+" ");
//		}
		//without using method
		System.out.println("assending");
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				int temp=0;
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			
				System.out.print(a[i]+" ");
		
		}
		System.out.println();
		System.out.println("decending");
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				int temp=0;
				if(a[i]<a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			
				System.out.print(a[i]+" ");
		
		}
		System.out.println();
		System.out.println("using single for loop");
		for(int i=0;i<a.length-1;i++) {
			int temp=0;
			if(a[i]>a[i+1]) {
				temp=a[i];
				a[i]=a[i+1];
				a[i+1]=temp;
				i=-1;
			}
			
			//System.out.print(a[i]+" ");
		}
		for(int element:a) {
			System.out.print(element+" ");
		}
	}
}
