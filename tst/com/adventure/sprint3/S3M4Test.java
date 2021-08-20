package com.adventure.sprint3;

import main.com.adventure.settings.CommandVerb;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class S3M4Test {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @BeforeEach
    public void setup() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void testNullVerbException() {
        boolean nullExceptionCaught = false;

        try {
            CommandVerb.getVerb(null);
        } catch (Exception e) {
            String packageName = e.getClass().getPackageName();
            assertTrue(packageName.contains("com.adventure"));
            nullExceptionCaught = true;
        }

        assertTrue(nullExceptionCaught);
    }

    @Test
    public void testInvalidVerbException() {
        boolean invalidExceptionCaught = false;

        try {
            CommandVerb.getVerb("invalid command");
        } catch (Exception e) {
            String packageName = e.getClass().getPackageName();
            assertTrue(packageName.contains("com.adventure"));
            invalidExceptionCaught = true;
        }

        assertTrue(invalidExceptionCaught);
    }

}
