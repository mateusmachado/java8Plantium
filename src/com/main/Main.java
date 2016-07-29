package com.main;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.person.Person;

public class Main {

	public static List<String> collection;
	Person p;

	public static void main(String[] args) {
		 upperCase(Arrays.asList("osx", "win", "linux"));
		 System.out.println(collectionLessThan4characters(Arrays.asList("osx","win", "linux")));
		 System.out.println(flattenCollection(Arrays.asList("Viktor","Farcic"), Arrays.asList("John", "Doe", "Third")));
		 System.out.println(getOldestPerson(Arrays.asList(new Person("Nina", 17), new Person("Eva", 55), new Person("Jown", 22))));				
	}

	public static List<String> upperCase(List<String> collection) {
		return collection.stream().map(x -> x.toUpperCase()).collect(Collectors.toList());
	}

	public static List<String> collectionLessThan4characters(List<String> collection) {
		return collection.stream().filter(x -> x.length() < 4).collect(Collectors.toList());
	}

	public static List<String> flattenCollection(List<String> collection1, List<String> collection2) {
		return Stream.of(collection1, collection2).flatMap(c1 -> c1.stream()).collect(Collectors.toList());
	}
	
	public static Person getOldestPerson(List<Person> people) {
		return people.stream().max(Comparator.comparing(Person::getAge)).get();
	}
}
