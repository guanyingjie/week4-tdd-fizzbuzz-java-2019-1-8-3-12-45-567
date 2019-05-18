package com.thoughtworks.tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class FizzBuzzTest {
    private ByteArrayOutputStream output = new ByteArrayOutputStream();
    private FizzBuzz fizzBuzz;

    @BeforeEach
    void setUp() {
        fizzBuzz = new FizzBuzz(new Fizz(), new Buzz(), new Whizz());
        System.setOut(new PrintStream(output));
    }

    private boolean isOutputEndWith(String s) {
        String expect = s.concat(System.lineSeparator());
        return output.toString().endsWith(expect);
    }
    @Test
    public void should_return_number_when_input(){
        fizzBuzz.count(1);
        assertTrue(isOutputEndWith("1"));

        fizzBuzz.count(4);
        assertTrue(isOutputEndWith("4"));
    }
    @Test
    public void should_return_Fizz_when_input_3(){
        String expectOutput = "Fizz";
        fizzBuzz.count(3);
        assertTrue(isOutputEndWith(expectOutput));
    }
    @Test
    public void should_return_Buzz_when_input_5(){
        String expectOutput = "Buzz";
        fizzBuzz.count(5);
        assertTrue(isOutputEndWith(expectOutput));
    }
    @Test
    public void should_return_Whizz_when_input_7(){
        String expectOutput = "Whizz";
        fizzBuzz.count(7);
        assertTrue(isOutputEndWith(expectOutput));
    }
    @Test
    public void should_return_FizzBuzz_when_input_3and5(){
        String expectOutput = "FizzBuzz";
        fizzBuzz.count(15);
        assertTrue(isOutputEndWith(expectOutput));
    }
    @Test
    public void should_return_FizzWhizz_when_input_3and7(){
        String expectOutput = "FizzWhizz";
        fizzBuzz.count(21);
        assertTrue(isOutputEndWith(expectOutput));
    }
    @Test
    public void should_return_BuzzWhizz_when_input_5and7(){
        String expectOutput = "BuzzWhizz";
        fizzBuzz.count(35);
        assertTrue(isOutputEndWith(expectOutput));

    }
    @Test
    public void should_return_FizzBuzzWhizz_when_input_3and5and7(){
        String expectOutput = "FizzBuzzWhizz";
        fizzBuzz.count(105);
        assertTrue(isOutputEndWith(expectOutput));
    }

}
