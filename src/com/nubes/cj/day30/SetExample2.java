package com.nubes.cj.day30;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SetExample2 {
	public static void main(String[] args) {
		List<Integer> list1 = IntStream.rangeClosed(1, 10).boxed().collect(Collectors.toList());
		List<Integer> list2 = IntStream.rangeClosed(5, 30).boxed().collect(Collectors.toList());
		List<Integer> list3 = IntStream.rangeClosed(10, 20).boxed().collect(Collectors.toList());
		list1.addAll(list2);
		list1.addAll(list3);
	    
		Set<Integer> set = new HashSet<>();
		
		for(Integer ele:list1) {
			System.out.println(ele+" is added to the set");
			if(set.add(ele)) {
				System.out.println("Duplicate element...."+ele);
			}
		}
		System.out.println(set);
		
		
	}
}
