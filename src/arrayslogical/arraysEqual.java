package arrayslogical;

public class arraysEqual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4};
		int b[]= {1,2,3,4};
		int c[]= {5,6,7,8};
		boolean flag=false;
		boolean flag1=false;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<b.length;j++) {
				if(a[i]==b[j]) {
					flag=true;
				}
			}
		}
		if(flag==true) {
			System.out.println("both arrays are equal");
		}else {
			System.out.println("arrays are not equal");
		}
		System.out.println();
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<c.length;j++) {
				if(a[i]==c[j]) {
					flag1=true;
				}
			}
		}
		if(flag1==true) {
			System.out.println("both arrays are equal");
		}else {
			System.out.println("arrays are not equal");
		}
	}

}
