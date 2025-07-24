package com.dkfedko;

import main.java.com.dkfedko.Methods;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MethodsTest {
    private Methods methods = new Methods();

    @Test
    void testShouldConvertIntToChar() {

        //arrange
        int[] java = new int[]{106, 97, 118, 97};
        char[] expected = {'j', 'a', 'v', 'a'};

        //act
        char[] actual = methods.displayResult(java);

        //assert
        assertArrayEquals(expected, actual);
    }

    @Test
    void testShouldReturnMaxOfTwoInt() {

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
    void testShouldReturnMaxOfThree() {

        //arrange
        int a = 3;
        int b = 5;
        int c = 8;
        int actual = 8;

        //act
        int expected = methods.maxOfThree(a, b, c);

        //assert
        assertEquals(actual, expected);
    }

    @Test
    void testShouldReturnMaxOfFive() {

        //arrange
        int size = 18;
        int topEdge = 16;
        int bottomEdge = 3;
        int length = 12;
        int weight = 74;

        int actual = 74;

        //act
        int expected = methods.maxOfFive(size, topEdge, bottomEdge, length, weight);

        //assert
        assertEquals(actual, expected);
    }
    @Test
    void testShouldFindEvenSymbolsInArray() {

        //arrange
        int[] truckUnits = new int[]{1022, 1035, 1047, 1064, 1032};
        int[] expected = {1022, 0, 0, 1064, 1032};

        //act
        int[] actual = methods.revealEven(truckUnits);

        //assert
        assertArrayEquals(expected, actual);
    }

    @Test
    void testShouldCheckIfThereIsEqualValue() {

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
    void testShouldReturnMinusOneifValleNotExists() {

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
    void testShouldReturnFactorialValue() {

        //arrange
        int value = 5;
        long expected = 120;

        //act
        long actual = methods.recursiveFactorial(value);

        //assert
        assertEquals(expected, actual);
    }

    @Test
    void testFibonacciValue() {

        //arrange
        int value = 8;
        int expected = 21;

        //act
        int actual = methods.getFibonacciValue(value);

        //assert
        assertEquals(expected, actual);
    }

    @Test
    void testShouldCheckIfThereIsSymbolsThatDivideByValle() {

        //arrange
        int[] array = new int[]{1, 2, 3, 15};
        int value = 3;
        int[] expected = {0, 0, 3, 15};

        //act
        int[] actual = methods.getArrayDivideValue(array, value);

        //assert
        assertArrayEquals(expected, actual);
    }

    @Test
    void testShouldCheckMethodToMultiplyArrays() {

        //arrange
        int[] truckUnits = new int[]{2, 3, 8, 4, -5, -3};
        int [] digits = new int [] {16, 8, 4, 2, -2, 2};
        int[] expected = {32, 24, 32, 8, 10, -6};

        //act
        int [] actual = Methods.getMultipliedArray (truckUnits, digits);

        //assert
        assertArrayEquals(expected, actual);
    }

    @Test
    void testShouldCheckIfElementInArrayRepeats(){

        //arrange
        byte[] array  =new byte[] {21,5,8,9,4,8,9,6};
        boolean expected  = true;

        //act
        boolean actual = methods.ifElementsRepeat(array);

        //assert
        assertEquals(expected,actual);
    }
    @Test
    void testShouldCheckBubbleSortMethods(){

        //arrange
        int[] array  = new int[] {9,8,7,6,5,4,3,2,1};
        int [] expected = {1,2,3,4,5,6,7,8,9};

        //act
        int[] actual = methods.bubbleSort(array);

        //assert
        assertArrayEquals(expected,actual);
    }

}
