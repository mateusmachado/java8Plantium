import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.main.Main;

public class ToUpperCaseSpec {
	
	@Test
	public void transformShouldConvertCollectionElementsToUpperCase() {
		List<String> expected = Arrays.asList("OSX", "WIN", "LINUX");
		assertEquals(Main.upperCase(Arrays.asList("osx", "win", "linux")), expected);
	}
}