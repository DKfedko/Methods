package com.dkfedko;


import org.junit.jupiter.api.Test;
import main.java.com.dkfedko.Methods;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MethodsTest {
    private Methods methods = new Methods();

    @Test
    void shouldPrintArrayElements() {
        //arrange
        char[] symbols = new char[]{'D', 'a', 'n', 'y', 'l', 'o'};
        String expectedOutput = "D\n" +
                "a\n" +
                "n\n" +
                "y\n" +
                "l\n" +
                "o\n";

        // capture System.out
        PrintStream originalOut = System.out;
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // act
        methods.displayResult(symbols);

        // restore System.out
        System.setOut(originalOut);

        // assert
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    void shouldConvertIntToChar() {

        //arrange
        int[] java = new int[]{106, 97, 118, 97};
        char[] expectedCharArray = {'j', 'a', 'v', 'a'};

        //act
        char[] actualCharArray = methods.displayResult(java);

        //assert
        assertArrayEquals(expectedCharArray, actualCharArray);
    }

    @Test
    void shouldReturnMaxOfTwoInt() {

        //arrange
        int a = 5;
        int b = 6;
        int actual = 6;

        //act
        int expected = methods.maxOfTwo(a, b);

        //asset
        assertEquals(actual, expected);
    }

    @Test
    void shouldReturnMaxOfThree(){

        //arrange
        int a = 3;
        int b = 5;
        int c = 8;
        int actual = 8;

        //act
        int expected = methods.maxOfThree(a,b,c);

        //assert
        assertEquals(actual, expected);
    }
    @Test
    void shouldReturnMaxOfFive(){

        //arrange
        int size = 18;
        int topEdge = 16;
        int bottomEdge = 3;
        int length =12;
        int weight = 74;

        int actual = 74;

        //act
        int expected = methods.maxOfFive(size, topEdge, bottomEdge, length, weight);

        //assert
        assertEquals(expected, actual);
    }
}
