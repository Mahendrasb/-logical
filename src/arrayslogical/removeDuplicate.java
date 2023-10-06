package arrayslogical;

import java.util.*;

public class removeDuplicate {

	public static void main(String[] args) {
		int a[]= {1,2,3,2,3,1,4,2,3,4,2,5,6,7,5,4,6};
		//using set 
		System.out.println("Using set");
		Set hash_set=new HashSet();
		for(int i=0;i<a.length;i++) {
			hash_set.add(a[i]);
			
		}
		System.out.println(hash_set);
		System.out.println("original array:");
		for(int element:a) {
			System.out.print(element+" ");
		}
		System.out.println();
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					a[i]=-1;
				}
			}
			System.out.print(a[i]+" ");
		}
		System.out.println("removed array");
		for(int i=0;i<a.length;i++) {
			//System.out.print(a[i]+" ");
			if(a[i]!=-1) {
				System.out.print(a[i]+" ");
			}
		}
		

}
}
