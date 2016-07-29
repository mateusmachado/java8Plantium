package com.oldestPerson;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

import com.main.Main;
import com.person.Person;

public class PersonTest {
	
	@Test
    public void getOldestPerson() {
      Person sara = new Person("Sara", 4);
      Person viktor = new Person("Viktor", 40);
      Person eva = new Person("Eva", 42);
	  assertEquals(eva, Main.getOldestPerson(Arrays.asList(sara,viktor,eva)));
    }
}
