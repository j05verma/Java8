package com.jsp.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AccumulatorsExample {

	public static void main(String[] args) {
		List<String> list=new ArrayList<>(List.of("Java","Hibernate","Spring","abcd","ab","cd"));
		String joinedString = list.stream().collect(Collectors.joining(" ", ">>> ", " <<<"));
		System.out.println(joinedString);
		// O/P-> >>> Java Hibernate Spring abcd ab cd <<<
		
		Map<String, Integer> map = list.stream().collect(Collectors.toMap(s1->s1, s1->s1.length()));
		System.out.println(map);
		// O/P-> {Java=4, ab=2, cd=2, Hibernate=9, Spring=6, abcd=4}
		
//		List<Integer> list1 = Stream.of(1,2,3).collect(Collectors.toUnmodifiableList());
//		System.out.println(list1);
		
		Map<Integer, List<String>> collect = list.stream().collect(Collectors.groupingBy(String::length));
		System.out.println(collect);
		// O/P-> {2=[ab, cd], 4=[Java, abcd], 6=[Spring], 9=[Hibernate]}
		
//		Map<Integer, Set<String>> collect1 = list.stream().collect(Collectors.groupingBy(String::length, Collectors.toSet()));
//		System.out.println(collect1);
		
		Map<Boolean, List<String>> partitioned = list.stream().collect(Collectors.partitioningBy(s->s.contains("a")));
		System.out.println(partitioned);
		// O/P-> {false=[Spring, cd], true=[Java, Hibernate, abcd, ab]}

	}

}
