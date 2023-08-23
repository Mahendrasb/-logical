package test;

public class removewhitespaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="    ja       va       s     t      ar   ";
//		String s1=str.trim();
//		System.out.println(s1);
		String s2=str.replaceAll("\\s", "");//\\ss=unicode character for single whitespace
		System.out.println(s2);
	}

}
