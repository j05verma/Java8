package com.jsp.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamCreation {
	static Integer[] array= {3,4,5,7,8,2};
	static List<String> list = List.of("Rohan", "Deepak");
	
	public static void main(String[] args) {
		Stream<Integer> myIntegerStream=Stream.of(1,2);
		//System.out.println(myIntegerStream);
		DoubleStream myDoubleStream = DoubleStream.of(10, 20, 30);

	    IntStream intStreamFromRange = IntStream.range(1, 20);
	    IntStream intStreamFromRangeClosed = IntStream.rangeClosed(1, 20);

	    IntStream intStreamFromIterate = IntStream.iterate(0, n -> n + 1);

	    Stream<Integer> streamFromArray = Arrays.stream(array);
	    Stream<String> streamFromList = list.stream();

	    Stream<String> stringStream = list.parallelStream();
	}

}
