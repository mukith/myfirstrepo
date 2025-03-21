package com.example;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AppTest {
    @Test
    public void testAddNumbers() {
        App app = new App();
        assertEquals(5, app.addNumbers(2, 3));
    }
}
