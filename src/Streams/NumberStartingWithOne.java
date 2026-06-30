package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumberStartingWithOne {

	
	//2. Given a list of integers, find out all the numbers starting with 1 using Stream functions?
	
	public static void main(String[] args) {
		
	//	List<Integer> numbers = Arrays.asList(10,15,8,49,25,98,32);
	//	numbers.stream().map(s->s + "").filter(s->s.startsWith("1")).forEach(System.out::println);
		
	//Array	
	int [] arr = {10,15,8,49,25,98,32};
	List<String> list = Arrays.stream(arr).boxed().map(s->s + "").filter(s->s.startsWith("1")).collect(Collectors.toList());
	System.out.println(list);
		
	}
	
}
