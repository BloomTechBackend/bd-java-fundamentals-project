package com.adventure.sprint2;

import main.com.adventure.player.Player;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class S2M1Test {

    private Player player;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @BeforeEach
    public void setup() {
        player = new Player();
        System.setOut(new PrintStream(outContent));
        checkPlayerLevel();
    }

    private void checkPlayerLevel() {
        assertEquals(player.level, 5, "The player's level should always be 5");
    }

    @Test
    void canOpenDoor() {
        checkPlayerLevel();
        assertEquals(player.canOpenDoor(), true, "The player should be able to open the door at level " + player.level);
        checkPlayerLevel();

        player.level = 4;
        assertEquals(player.canOpenDoor(), false, "The player should not be able to open the door at level " + player.level);

        player.level = 0;
        assertEquals(player.canOpenDoor(), false, "The player should not be able to open the door at level " + player.level);

        player.level = 10;
        assertEquals(player.canOpenDoor(), true, "The player should be able to open the door at level " + player.level);
    }

    @Test
    void setName() {
        assertEquals(player.getName(), "", "The player's name should start as a blank string.");
        String testName = "Test name";
        player.setName(testName);
        assertEquals(player.getName(), testName);
        assertEquals("Your name is now " + testName + "\n", outContent.toString());
    }
}