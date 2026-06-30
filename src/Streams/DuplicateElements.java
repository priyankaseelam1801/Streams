package Streams;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateElements {

	public static void main(String[] args) {
		
// 3. How to find duplicate elements in a given integers list in java using Stream functions?
		
		/* This will give the output of all repeated number */
		
		List <Integer> numbers = Arrays.asList(10,15,8,49,25,98,98,32,15);
		Set<Integer> set =new  HashSet<>();
		numbers.stream().filter(n -> !set.add(n)).forEach(System.out::println);
		
		/* Way 1 - Gives list of all distinct/unique values */
		List<Integer> distinctList  = Arrays.asList(1, 1, 85, 6, 2, 3, 65, 6, 45, 45, 5662, 2582, 2, 2, 266, 666, 656);
		distinctList.stream().distinct().forEach(n->System.out.println(n));	
		
		/* Way 2 -  Gives list of all distinct/unique values */ 
		Set<Integer> set1 = new HashSet<>(numbers);
        
	      // Convert the set back to a list if needed
	      List<Integer> uniqueData = set1.stream().collect(Collectors.toList());
	        
	      // Print the unique elements
	      uniqueData.forEach(System.out::println);
	      
	      /* Way 3 - Gives list of all distinct/unique values */
	      int[] arr = {10,15,8,49,25,98,98,32,15}; 
	      List<Integer> list1 = Arrays.stream(arr).boxed().distinct()
	    		  .collect(Collectors.toList());
	      
		
	}
	

}
