package org.example;

import static net.sf.launch4j.Main.getName;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.Objects;

/**
 * Unit test for simple App.
 */
public class AppTest {

    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }

    @BeforeMethod
    public void setUp() {
    }

    @AfterMethod
    public void tearDown() {
    }

    @Test
    public void itShouldThrowNullPointerExceptionWhenBlahBlah() {

            String name = getName();
            try {
                Objects.requireNonNull(null);
            } catch (NullPointerException ex) {
                assertTrue(ex instanceof NullPointerException);
            }
    }

}
