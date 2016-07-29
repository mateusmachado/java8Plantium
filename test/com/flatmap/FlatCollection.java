package com.flatmap;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.main.Main;

public class FlatCollection {
	
	@Test
    public void transformShouldFlattenCollection() {
        List<String> expected = Arrays.asList("Viktor", "Farcic", "John", "Doe", "Third");
        assertEquals(Main.flattenCollection(Arrays.asList("Viktor", "Farcic"), Arrays.asList("John", "Doe", "Third")), expected);
    }
}
