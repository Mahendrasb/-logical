package test;

import java.util.LinkedHashSet;
import java.util.Set;

public class removeduplicatechar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="programming";
		
		//approach1-using java8
		StringBuilder sb1=new StringBuilder();
		s1.chars().distinct().forEach(c->sb1.append((char)c));
		System.out.println(sb1);
		//using index of method
		StringBuilder sb2=new StringBuilder();
		for(int i=0;i<s1.length();i++) {
			char ch=s1.charAt(i);
			int index=s1.indexOf(ch,i+1);
			if(index==-1) {
				sb2.append(ch);
			}
		}
		System.out.println(sb2);
	
		//using character array
		char[] arr=s1.toCharArray();
		StringBuilder sb3=new StringBuilder();
		boolean repeted=false;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					repeted=true;
					break;
				}
			}
			if(!repeted) {
				sb3.append(arr[i]);
			}
		}
		System.out.println(sb3);
		
		//using set interface methods
		StringBuilder sb4=new StringBuilder();
		Set<Character> set=new LinkedHashSet();
		for(int i=0;i<s1.length();i++) {
			set.add(s1.charAt(i));
		}
		for(Character c:set) {
			sb4.append(c);
		}
		System.out.println(sb4);
	}

}
