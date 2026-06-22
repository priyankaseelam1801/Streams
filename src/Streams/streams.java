package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//import org.junit.Test;

public class streams {
	
	//@Test
	//count the number of names starting with alphabet A in the list 	
	public static void main (String [] args) {
	//public void regular(){
		
	
	ArrayList<String> al = new ArrayList<String>();
	al.add("Abhishek");
	al.add("Don");
	al.add("Akhil");
	al.add("Aman");
	al.add("Ram");
	int count = 0;
	for(int i=0;i<al.size();i++) {
		
		String actual = al.get(i);
		if(actual.startsWith("A"))
		{
			count++;
		}
	}
System.out.println(count);
al.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
al.stream().filter(s->s.length()>4).limit(1).forEach(s->System.out.println(s));
//al.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));

long d = Stream.of("Abhishek","Don","Akhil","Aman","Ram").filter(s->
{
	s.startsWith("A");
	return true;
}).count();
System.out.println(d);
//print names which has last letter as "a" with UPPERCASE
//Stream.of("Abhishek","Don","Akhila","Aman","Rama").filter(s->s.endsWith("a")).
//map(s->s.toUpperCase()).forEach(s->System.out.println(s));
//print names which has first letter as "A" with uppercase and sorted
Stream.of("Abhishek","Don","Akhila","Aman","Rama").filter(s->s.startsWith("A")).
map(s->s.toUpperCase()).forEach(s->System.out.println(s));

List<String> names = Arrays.asList("Aarav","Aman","Akhila","Don","Abhishek");
names.stream().filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));

ArrayList<String> name = new ArrayList<String>();
name.add("Karthik");
name.add("Vivek");
name.add("Vinay");
name.add("Vishal");
name.add("Varun");
//Merging  to diff lists
//filter/map/match
Stream<String> newStream = Stream.concat(name.stream(),names.stream());
//newStream.forEach(s->System.out.println(s));
boolean flag = newStream.anyMatch(s->s.equalsIgnoreCase("Akhila"));
System.out.println(flag);
//Assert.assertTrue(flag);


//list 
//new list
// new list
	List<String> ls = Stream.of("Abhishek","Don","Akhila","Aman","Rama").filter(s->s.endsWith("a")).
	map(s->s.toUpperCase()).collect(Collectors.toList());
	System.out.println(ls.get(0));
	
	
	List<Integer> list = Arrays.asList(3,2,2,7,5,1,9,7);
	//print unique numbers from this array
	//sort the array  1,2,3,5,7,9
	//list.stream().distinct().forEach(s->System.out.println(s));
	List<Integer> li = list.stream().distinct().sorted().collect(Collectors.toList());
	//.limit(3)).forEach(s->System.out.println(s));
	System.out.println(li.get(2));
}
}
