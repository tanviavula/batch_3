package com.nubes.cj.day26;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListExample1 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(5);
		list.add(4);
		
//		for(Integer ele:list) {
//			System.out.println(ele);
//		}
		
//		list.stream().forEach(ele->{
//			System.out.println(ele);
//		});
		
		Iterator<Integer> iterator = list.iterator();
		
		while(iterator.hasNext()) {
			Integer ele = iterator.next();
			if(ele == 2) {
				iterator.remove();
				System.out.println(ele+" is removed...");
			}
		}
		System.out.println(list);
		
		ListIterator<Integer> iterator1 = list.listIterator();
		
		while(iterator1.hasNext()) {
			Integer ele = iterator1.next();
			if(ele==1)
			iterator1.set(100);
			if(ele==5)
				iterator1.add(300);
			iterator1.remove();
			System.out.println(ele);
		}
		System.out.println("Backward direction");
		while(iterator1.hasPrevious()) {
			Integer ele = iterator1.previous();
			System.out.println(ele);
		}
	}
}

