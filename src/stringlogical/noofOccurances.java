package stringlogical;

public class noofOccurances {
	public static void main(String[] args) {
		// String str="programming";
		int arr[] = { 1, 2, 3, 2, 4, 1, 3, 4 };
		// char ch[]=str.toCharArray();
		// for(int i=0;i<ch.length;i++) {
		for (int i = 0; i < arr.length; i++) {
			int cnt = 1;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					cnt++;
					System.out.print(arr[i] + "=" + cnt + " ");

				}

			}
		}
	}
}
