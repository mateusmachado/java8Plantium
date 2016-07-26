package com.upper;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static List<String> collection;

	public static void main(String[] args) {
		upperCase(Arrays.asList("osx", "win", "linux"));
		System.out.println(collectionLessThan4characters(Arrays.asList("osx", "win", "linux")));
	}

	public static List<String> upperCase(List<String> collection) {		
		return collection.stream().map(x -> x.toUpperCase()).collect(Collectors.toList());
	}
	
	public static List<String> collectionLessThan4characters(List<String> collection){
		return collection.stream().filter(x -> x.length() < 4).collect(Collectors.toList());
	}
}
