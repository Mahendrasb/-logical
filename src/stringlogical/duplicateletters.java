package stringlogical;

public class duplicateletters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="programming";
		//String str1="";
		for(int i=0;i<str.length();i++) {
			for(int j=i+1;j<str.length();j++) {
				if(str.charAt(i)==str.charAt(j)) {
					System.out.println(str.charAt(i));
					
					//str1+=str.charAt(i);
				}
			}
		}
		//System.out.println(str1);

	}

}
