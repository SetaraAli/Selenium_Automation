package com.interview.nyc;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class JavaCodingReview {
	public static void findDuplicate() {
	int[] array = {1,2,3,3,4};
	Set<Integer> set =new HashSet<>();
	for(int duplicate:array) {
		if(set.add(duplicate)==false) {
		System.out.println(duplicate);	
		}
	}
		
			
		}
	public static void removeDuplicate() {
		List<Integer> list =new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(2);
		list.add(10);
		list=(List<Integer> )list.stream().distinct().collect(Collectors.toList());
		System.out.println(list);
	int max =Collections.max(list);
	System.out.println(max);
	int min=Collections.min(list);
	System.out.println(min);
	}
	public static void searchDuplicate() {
		int[] number = {1,3,3,5};
		Set<Integer> set = new HashSet<>();
		for(int duplicate:number) {
		if(set.add(duplicate)==false) {
		System.out.println(duplicate);	
		}
		}
		
	}
	public static void removeduplicate() {
		List<Integer> list = new ArrayList<>();
		list.add(5);
		list.add(7);
		list.add(7);
		list.add(8);
	list=(List<Integer>)list.stream().distinct().collect(Collectors.toList());
		System.out.println(list);
	int max=Collections.max(list);
	System.out.println(max);
	int min=Collections.min(list);
	System.out.println(min);
	}
	public static void oddEven() {
		int num=30;
		if(num%2==0) {
			System.out.println("yes,it is an even number: "+num);
			
			}
		else{
			System.out.println("no, it is not an odd number: "+num);
		}
	}
	public static void HighestNum() {
		int[] array= {1,2,3,7,5};
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
	int size=array.length;
	int hnum = array[size-2];
	System.out.println(hnum);
	}
	public static void reverseString() {
		String name= new String("Setara");
		String reverse =new StringBuffer(name).reverse().toString();
		System.out.println(reverse);
	}
	public static void getSplit() {
		String country = new String("United States Of America");
		for(String split:country.split(" ")) {
			System.out.println(split);
		}
			
		
	}
	public static void findmissingNum() {
		int[] num = {1,2,3,5,6};
		for(int i=0;i<num.length-1;i++) {
			if(num [i]+1!=num[i+1]) {
			System.out.println(num [i]+1);	
			}
		}
	}
	public static void primeNum() {
		int num = 30;
		System.out.println("prime number between 1 and: "+num);
		for(int i=0;i<num;i++) {
			boolean prime =true;
		for(int j=2;j<i;j++) {
			if( i%j==0) {
			prime=false;
			break;
		}	
		}
		if(prime) {
			System.out.println("find the prime num: "+i+" ");	
		}
	
		}
		
	}
	public static void removeSpecialChar() {
		String name="Setara*Ali";
		name=name.replaceAll("[^a-zA-Z0-9]", " ");
		System.out.println(name);				
	}
	public static void removeSpecialsign() {
		String num = "12^13&14";
		num=num.replaceAll("\\W", " ");
		System.out.println(num);
	}
	public static void findPalendrum() {
		//String palendrom = "MOM";
		String palindrome=new String("MOM");
		String reverse = new StringBuffer(palindrome).reverse().toString();
		if(palindrome.equals(reverse)) {
			System.out.println("yes, it is palendrom: "+reverse);
		}
		else {
			System.out.println("no,it is not palendrum: "+reverse);
		}
	}
	public static void main(String[] args) {
		/*findDuplicate();
		 removeDuplicate();
		 searchDuplicate();
		 removeduplicate();
		oddEven();
		HighestNum();
		reverseString();
		getSplit();
		findmissingNum();
		primeNum();
		removeSpecialChar();
		removeSpecialsign();*/
		findPalendrum();
		findmissingNum();
	}
	
}
