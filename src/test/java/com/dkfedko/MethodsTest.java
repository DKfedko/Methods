package com.dkfedko;

import main.java.com.dkfedko.Methods;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MethodsTest {
    private Methods methods = new Methods();

    @Test
    void TestShouldPrintArrayElements() {
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
    void TestShouldConvertIntToChar() {

        //arrange
        int[] java = new int[]{106, 97, 118, 97};
        char[] expected= {'j', 'a', 'v', 'a'};

        //act
        char[] actual = Methods.displayResult(java);

        //assert
        assertArrayEquals(expected, actual);
    }

    @Test
    void TestShouldReturnMaxOfTwoInt() {

        //arrange
        int a = 5;
        int b = 6;
        int expected = 6;

        //act
        int actual = methods.maxOfTwo(a, b);

        //asset
        assertEquals(expected, actual);
    }

    @Test
    void TestShouldReturnMaxOfThree(){

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
    void TestShouldReturnMaxOfFive(){

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

    @Test

    void TestShouldPrintCharBackwards(){

        //arrange
        char[] name = new char[] {'D','a','n','y','l','o'};
        String expectedOutput = "o\n" +
                                "l\n" +
                                "y\n" +
                                "n\n" +
                                "a\n" +
                                "D\n";

        // capture System.out
        PrintStream originalOut = System.out;
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        //act
        methods.reversChar(name);

        // restore System.out
        System.setOut(originalOut);

        //assert
        assertEquals(expectedOutput, outContent.toString());
    }
    @Test
    void TestShouldPrintNestedLoops(){

    String expectedOutPut =
            "*****\n" +
            "****\n" +
            "***\n" +
            "**\n" +
            "*\n";

     //capture System.out
        PrintStream originalOut = System.out;
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        //act
        methods.showLoop();

        //restore System.out
        System.setOut(originalOut);

        //assert
        assertEquals(expectedOutPut, outContent.toString());
    }
    @Test

    void TestShouldFindEvenSymbolsInArray(){

        //arrange
        int[] truckUnits = new int[]{1022, 1035, 1047, 1064, 1032};
        int[] expected = {1022, 0, 0, 1064, 1032};

        //act
        int[] actual = methods.revealEven(truckUnits);

        //assert
        assertArrayEquals(expected, actual);
    }
    @Test

    void  TestShouldCheckIfThereIsEqualValue(){

        //arrange
        int[] truckUnits = new int[]{1022, 1035, 1048, 1057, 1047, 1064, 1032};
        int value = 1048;

        int expected = 2;

        //act
        int actual = methods.getIndexOf(truckUnits, value);

        //assert
        assertEquals(expected, actual);
    }
    @Test

    void  TestShouldReturnMinusOneifValleNotExists(){

        //arrange
        int[] truckUnits = new int[]{1022, 1035, 1048, 1057, 1047, 1064, 1032};
        int value = 1053;

        int expected = -1;

        //act
        int actual = methods.getLastIndexOf(truckUnits, value);

        //assert
        assertEquals(expected, actual);
    }
    @Test

    void TestShouldReturnFactorialValue(){

        //arrange
        int value = 5;
        long expected = 120;

        //act
        long actual = methods.recursiveFactorial(value);

        //assert
        assertEquals(expected, actual);
    }
}
