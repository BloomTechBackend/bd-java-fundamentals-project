package com.adventure.sprint2;

import main.com.adventure.GameInputProcessor;
import main.com.adventure.player.Player;
import main.com.adventure.settings.AppSettings;
import main.com.adventure.settings.Command;
import main.com.adventure.world.Direction;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class S2M2Test {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @BeforeEach
    public void setup() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void checkMoveInputWest() {
        if (AppSettings.story.ordinal() >= AppSettings.Story.S3M1_TestDirections.ordinal()) {
            return;
        }

        GameInputProcessor processor = mock(GameInputProcessor.class);
        when(processor.prompt()).thenReturn("move west");
        when(processor.getNextCommand()).thenCallRealMethod();

        Command command = processor.getNextCommand();
        assertEquals(command.getVerb(), Command.MOVE);
        assertEquals(command.getObjectName(), "west");
    }

    @Test
    public void checkMoveInputEast() {
        if (AppSettings.story.ordinal() >= AppSettings.Story.S3M1_TestDirections.ordinal()) {
            return;
        }

        GameInputProcessor processor = mock(GameInputProcessor.class);

        when(processor.prompt()).thenReturn("move east");
        when(processor.getNextCommand()).thenCallRealMethod();
        Command command = processor.getNextCommand();

        assertEquals(command.getVerb(), Command.MOVE);
        assertEquals(command.getObjectName(), "east");
    }

    @Test
    public void checkSimpleInput() {
        if (AppSettings.story.ordinal() >= AppSettings.Story.S3M1_TestDirections.ordinal()) {
            return;
        }

        GameInputProcessor processor = mock(GameInputProcessor.class);

        when(processor.prompt()).thenReturn(Command.LOOK + " other content that should not be included");
        when(processor.getNextCommand()).thenCallRealMethod();
        Command command = processor.getNextCommand();

        assertEquals(command.getVerb(), Command.LOOK);
        assertEquals(command.getObjectName(), "");
    }

    @Test
    public void testPlayerMovementInvalid() {
        Player player = new Player();

        var oldValue = player.getCurrentLocation();

        assertFalse(player.move(Direction.EAST, false));
        assertEquals(player.getCurrentLocation(), oldValue);
        assertEquals("EAST is not a valid direction\n", outContent.toString());
    }

    @Test
    public void testPlayerMovementWest() {
        Player player = new Player();

        var oldValue = player.getCurrentLocation();

        assertTrue(player.move(Direction.WEST, true));
        assertEquals(player.getCurrentLocation() + 1, oldValue);
    }

    @Test
    public void testPlayerMovementEast() {
        Player player = new Player();

        var oldValue = player.getCurrentLocation();

        assertTrue(player.move(Direction.EAST, true));
        assertEquals(player.getCurrentLocation() - 1, oldValue);
    }
}
