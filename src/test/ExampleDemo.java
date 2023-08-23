package test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ExampleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "welcome to bharat and bharat welcome you";
		
		List<String> list = Arrays.asList(s.split(" "));
	Map<String, Long> map =	list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(map);
	}

}
