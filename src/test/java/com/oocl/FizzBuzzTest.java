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
}