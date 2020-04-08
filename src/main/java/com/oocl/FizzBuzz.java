package com.oocl;

public class FizzBuzz {
    public String say(int number) {
        String FIZZ_STRING = "Fizz";
        String BUZZ_STRING = "Buzz";
        String result = "";

        if (number % 3 == 0) {
            result += FIZZ_STRING;
        }
        if (number % 5 == 0) {
            result += BUZZ_STRING;
        }
        return result.equals("") ? String.valueOf(number) : result;
    }
}
