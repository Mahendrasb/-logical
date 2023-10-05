package stringlogical;

import java.util.Arrays;

public class charWuthOccurance {
public static void main(String[] args) { 
	String str="opentext";
	char charToreplace='t';
	
	if(str.indexOf(charToreplace)==-1) {
		System.out.println("character is not prest in string");
		System.exit(0);
	}
	
//	char[] arr=str.toCharArray();
//	int cnt=1;
//	for(int i=0;i<arr.length;i++) {
//		if(arr[i]==charToreplace) {
//			arr[i]=String.valueOf(cnt).charAt(0);
//			cnt++;
//		}
//	}
//	System.out.println(Arrays.toString(arr));
	int cnt=1;
	for(int i=0;i<str.length();i++) {
		char ch=str.charAt(i);
		if(ch==charToreplace) {
			str=str.replaceFirst(String.valueOf(charToreplace),String.valueOf(cnt));
			cnt++;
		}
	}
	System.out.println(str);
}
}
