package com.reduce;

import com.main.Main;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ReduceTest {
    @Test
    public void sumAllElements() {
        assertEquals(3, Main.sumAllElements(1,3));
    }
}
