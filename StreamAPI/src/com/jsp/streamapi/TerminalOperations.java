package com.jsp.streamapi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class TerminalOperations {
	static List<Integer> intList=new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9));
	HashMap<Integer, String> map=new HashMap<>(Map.of(1,"Jayant",2,"Ayush"));
	String[] strArray= {"first","second","third","fourth"};
	
	public static void main(String[] args) {
		OptionalInt min = IntStream.of(1,2,3,-1).min();
		//min()-> terminal operation method
		//of()-> gives me the stream
		//System.out.println(min.getAsInt());
		OptionalLong max=LongStream.of(1,2,3).max();
		//System.out.println(max);
		
		OptionalDouble average = DoubleStream.of(1,2.6,3.5).average();
		//System.out.println(average);
		Optional<Integer> listMin = intList.stream().min(Comparator.naturalOrder());
		//Optional return type- the optional is an object the may or may not contains the value
		//System.out.println(listMin);
		//System.out.println(listMin.isEmpty());
		//System.out.println(listMin.isPresent());
		//System.out.println(listMin.get());
		//System.out.println(listMin.orElse(0));
		
		Optional<String> optional = Optional.of("Rohan");
		// System.out.println(optional);
		// System.out.println(optional.get());
		
		// Another way to creating object from the optional
		Optional<String> os = Optional.ofNullable(null);
		//System.out.println(os);
		//System.out.println(os.get()); //exception
		//System.out.println(os.orElse("no-value"));
		
	//	intList.stream().forEach(System.out::println);
		//System.out.println(intList.stream().findAny());
		//findAny()-> returns the first encountered value  
		//System.out.println(intList.parallelStream().findAny());
		//System.out.println(intList.parallelStream().findFirst());
		
		System.out.println(intList.stream().allMatch(e-> e>0));
	}

}
