package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EvenNumber {
//1. Given a list of integers, find out all the even numbers that exist in the list using Stream functions?

public static void main(String[] args) {

	List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
	//numbers.stream().filter(n->n%2==0).forEach(System.out::println);
	
	Map<Boolean,List<Integer>> evenOddMap = numbers.stream().collect(Collectors.partitioningBy(n->n%2==0));
	System.out.println(evenOddMap.get(true));
	
}

}
