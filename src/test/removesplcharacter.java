package test;
//wjp remove special characters
public class removesplcharacter {
	public static void main(String[] args) {
		String str="@G#r$e!a##t&C@o$d@e%r";
		
		//approach 1(replace all)
		String planestring=str.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(planestring);
		
	}

}
