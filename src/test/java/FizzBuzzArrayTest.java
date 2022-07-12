import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzArrayTest {

    @Test
    void fizzBuzzStringsTest() {
        FizzBuzzArray arr = new FizzBuzzArray();
        String[] stringArray = new String[]{"fun", "tub", "flat", "falltub"};
        String[] result = arr.fizzBuzzStrings(stringArray);
        String[]methodOutput = {"Fizz", "Buzz", "Fizz", "FizzBuzz"};

//      assertEquals(new String[]{"Fizz", "Buzz", "Fizz", "FizzBuzz"}, result, "ok");
        assertArrayEquals(methodOutput, result);
    }





    @Test
    void fizzStringTest() {
        FizzBuzz f = new FizzBuzz();
        String wordThatStartsWithF = f.fizzBuzzString("fun");

        assertEquals("Fizz", wordThatStartsWithF, "program printed Fizz");
    }

    @Test
    void buzzStringTest() {
        FizzBuzz b = new FizzBuzz();
        String wordThatEndsWithB = b.fizzBuzzString("tub");

        assertEquals("Buzz", wordThatEndsWithB, "program printed Buzz");
    }

    @Test
    void fizzBuzzStringTest() {
        FizzBuzz f = new FizzBuzz();
        String testWord = f.fizzBuzzString("figtub");

        assertEquals("FizzBuzz", testWord, "program printed FizzBuzz");
    }

    @Test
    void nullStringTest() {
        FizzBuzz f = new FizzBuzz();
        String nullTest = f.fizzBuzzString(null);

        assertNull(nullTest);
    }
}