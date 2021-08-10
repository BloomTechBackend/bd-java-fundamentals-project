package com.adventure.sprint3;

import main.com.adventure.GameInputProcessor;
import main.com.adventure.settings.AppSettings;
import main.com.adventure.settings.Command;
import main.com.adventure.settings.CommandVerb;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class S3M1Test {

    GameInputProcessor processor;

    @BeforeEach
    public void setup() {
        processor = mock(GameInputProcessor.class);
    }

    @Test
    public void testCommandMove() {
        if (AppSettings.story.ordinal() < AppSettings.Story.S3M1_TestDirections.ordinal()) {
            return;
        }

        when(processor.prompt()).thenReturn("move west");
        when(processor.getNextCommand()).thenCallRealMethod();

        Command command = processor.getNextCommand();
        assertEquals(CommandVerb.MOVE, command.getVerb());
        assertEquals("west", command.getObjectName());

        when(processor.prompt()).thenReturn("move east");
        command = processor.getNextCommand();
        assertEquals(CommandVerb.MOVE, command.getVerb());
        assertEquals("east", command.getObjectName());
    }

    @Test
    public void testCommandUse() {
        if (AppSettings.story.ordinal() < AppSettings.Story.S3M1_TestDirections.ordinal()) {
            return;
        }

        when(processor.prompt()).thenReturn("use key");
        Command command = processor.getNextCommand();
        assertEquals(CommandVerb.USE, command.getVerb());
        assertEquals("key", command.getObjectName());
    }

    @Test
    public void testCommandHelp() {
        if (AppSettings.story.ordinal() < AppSettings.Story.S3M1_TestDirections.ordinal()) {
            return;
        }

        when(processor.prompt()).thenReturn("help");
        Command command = processor.getNextCommand();
        assertEquals(CommandVerb.HELP, command.getVerb());
        assertEquals("", command.getObjectName());
    }

    @Test
    public void testCommandInvalid() {
        if (AppSettings.story.ordinal() < AppSettings.Story.S3M1_TestDirections.ordinal()) {
            return;
        }

        when(processor.prompt()).thenReturn("Bad command");
        Command command = processor.getNextCommand();
        assertEquals(CommandVerb.INVALID, command.getVerb());
    }
}