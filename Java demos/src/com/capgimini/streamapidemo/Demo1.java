package com.capgimini.streamapidemo;


	import java.util.List;
	import java.util.stream.Collectors;
	import java.util.stream.Stream;

	public class Demo1 {

		public static void main(String[] args) {
			
			
	    String country []= {"India","USA","UK","Russia","Japan","France"};

		Stream<String> newCountry=Stream.of(country);
		
		newCountry.forEach(e->
		{
			System.out.println(e);
		});
		
		
		//filter
		//condition -filter
		List<String> countries=List.of("India","USA","UK","Russia","Japan","France");
	    System.out.println("*****");
		
		List<String> filteredList=countries.stream().filter(e->e.startsWith("S")).collect(Collectors.toList());
		System.out.println("Filtered elements are"+filteredList);
		
		
		//map
		//perform operation on bulk data
		
		List<Integer> numbers=List.of(2,3,4,5,6,7,8,9);
		
		List<Integer> newNumbers=numbers.stream().map(i->i*i*i).collect(Collectors.toList());
		System.out.println(newNumbers);
		
		newNumbers.forEach(e->
		{
			System.out.println(e);
		});
		}
	}
