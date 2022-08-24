import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GreetingsTest {


    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @Test
    public void greetingsTest() {
        System.out.println("TESTING sayHello");

        String expected = "Hello";
        String actual = new Greetings().sayHello();

        assertEquals(expected, actual);

    }

    @Test
    public void greetName () {
        System.out.println("TESTING greetName");

        String expected = "Hello, bob";
        String actual = new Greetings().greetName("bob");

        assertEquals(expected, actual);
    }

    @Test
    public void greetNameIsNull () {
        System.out.println("TESTING greetNameIsNull");

        String expected = "Hello, my friend";
        String actual = new Greetings().greetName(null);

        assertEquals(expected, actual);
    }

    @Test
    public void greetNameInUpperCase () {
        System.out.println("TESTING greetNameInUpperCase");

        String expected = "HELLO BOB!";
        String actual = new Greetings().greetName("BOB");

        assertEquals(expected, actual);
    }

    @Test
    public void greetNameArray () {
        System.out.println("TESTING greetNameArray");

        String expected = "Hello, Jill, and Jane";
        String[] array = {"Jill", "Jane"};
        String actual = new Greetings().greetName(array);

        assertEquals(expected, actual);
    }

    @Test
    public void greetNameArbitraryArray () {
        System.out.println("TESTING greetNameArbitraryArray");

        String expected = "Hello, Jill, Kaj, and Jane";
        String[] array = {"Jill", "Kaj", "Jane"};
        String actual = new Greetings().greetName(array);

        assertEquals(expected, actual);
    }

    @Test
    public void greetNameMix () {
        System.out.println("TESTING greetNameMix");

        String expected = "Hello, Jill, and Jane. AND HELLO KAJ!";
        String[] array = {"Jill", "KAJ", "Jane"};
        String actual = new Greetings().greetName(array);

        assertEquals(expected, actual);
    }

    @Test
    public void greetNameCommaInput () {
        System.out.println("TESTING greetNameCommaInput");

        String expected = "Hello, Jill, Kaj, and Jane";
        String[] array = {"Jill", "Kaj,Jane"};
        String actual = new Greetings().greetName(array);

        assertEquals(expected, actual);
    }






}
