package com.interview.nyc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CodingPractice {
	public static void findDuplicate() {
		int[] array = {1,2,3,3,4};
		Set<Integer> set= new HashSet<>();
		for(int duplicate:array) {
			if(set.add(duplicate)==false) {
				System.out.println(duplicate);
			}
		}
		
	}
	public static void removeDuplicate() {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(2);
		list=(List<Integer>)list.stream().distinct().collect(Collectors.toList());
		System.out.println(list);
	int max=Collections.max(list);
		System.out.println(max);
		int min=Collections.min(list);
		System.out.println(min);
	}
	public static void findPrimeNumber() {
		int num = 30;
		System.out.println("prime number between 1 and: "+num);
	}
	
	
public static void main(String[] args) {
	findDuplicate();
	removeDuplicate();
	findPrimeNumber();
}
}
