package com.upper;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static List<String> collection;

	public static void main(String[] args) {
		upperCase(Arrays.asList("osx", "win", "linux"));
	}

	public static List<String> upperCase(List<String> collection) {		
		return collection.stream().map(x -> x.toUpperCase()).collect(Collectors.toList());
	}
}
