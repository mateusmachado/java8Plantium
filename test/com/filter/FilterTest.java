package com.filter;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.upper.Main;

public class FilterTest {
	@Test
	public void transformShouldConvertCollectionElementsToUpperCase() {
		List<String> expected = Arrays.asList("osx", "win");
		assertEquals(Main.collectionLessThan4characters(Arrays.asList("osx", "win", "linux")), expected);
	}
}
