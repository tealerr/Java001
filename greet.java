import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class greet {
    public static class Greet {
        public String greeting() {
            return "Hello";
        }
    }

    @Test
    public void testGreeting() {
        Greet greet = new Greet();
        String result = greet.greeting();
        assertEquals("Hello", result);
    }


}