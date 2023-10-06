
public class intersectionOfArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4};
		
		int c[]= {5,4,3,8};
		int cnt=0;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<c.length;j++) {
				if(a[i]==c[j]) {
					cnt++;
				}
			}
		}
			int temp[]=new int[cnt];
			int k=0;
			for(int i=0;i<a.length;i++) {
				for(int j=0;j<c.length;j++) {
					if(a[i]==c[j]) {
						temp[k++]=a[i];
					}
				}
		}
			for(int ele:temp) {
				System.out.print(ele+" ");
			}
	}

}
