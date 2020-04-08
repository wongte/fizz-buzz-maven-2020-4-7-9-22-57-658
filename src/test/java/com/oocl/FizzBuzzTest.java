package com.oocl;


import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {
    @Test
    public void should_return_number() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        String result = fizzBuzz.say(1);

        Assert.assertEquals("1", result);
    }

    @Test
    public void should_return_fizz_when_number_is_multiple_by_3() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        String result = fizzBuzz.say(3);

        Assert.assertEquals("Fizz", result);
    }
}