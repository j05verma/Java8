package com.jsp.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ReduceExample {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(List.of(2,3,4,5));
		Optional<Integer> sum = list.stream().reduce((acc,n)->acc+n);
		//acc-> accumulator n-> normal value
		System.out.println(sum);
		
		list.stream().reduce((acc,n)->{
			System.out.println("acc: "+acc+", n :"+n);
			return acc+n;
		});
		
		
		List<String> list1 = new ArrayList<>(List.of("Java", "is", "awesome"));
		   String result = list1.stream().reduce("", (acc, w)-> acc + " " + w);
		    System.out.println(result);
	}

}
