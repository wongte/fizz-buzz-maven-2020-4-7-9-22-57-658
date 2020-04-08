package com.oocl;

public class FizzBuzz {
    public String say(int number) {
        String FIZZ_STRING = "Fizz";
        String BUZZ_STRING = "Buzz";
        String result = "";

        if (isDivisibleBy(number, 3)) {
            result += FIZZ_STRING;
        }
        if (isDivisibleBy(number, 5)) {
            result += BUZZ_STRING;
        }
        return result.equals("") ? String.valueOf(number) : result;
    }

    private boolean isDivisibleBy(int number, int base) {
        return number % base == 0;
    }
}
