package com.dkfedko;


import org.junit.jupiter.api.Test;
import main.java.com.dkfedko.Methods;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MethodsTest {
    private final Methods methods = new Methods();

    @Test
    void shouldPrintArrayElements() {
        //prepare
        char[] symbols = new char[] {'D','a','n','y','l','o'};
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
}
