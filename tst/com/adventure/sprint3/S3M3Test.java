package com.adventure.sprint3;

import main.com.adventure.GameInputProcessor;
import main.com.adventure.player.Backpack;
import main.com.adventure.player.Player;
import main.com.adventure.settings.Command;
import main.com.adventure.settings.CommandVerb;
import main.com.adventure.world.objects.keys.Key;
import main.com.adventure.world.objects.doors.OmniDoor;
import main.com.adventure.world.objects.keys.KeyFactory;
import main.com.adventure.world.objects.keys.OmniKey;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class S3M3Test {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @BeforeEach
    public void setup() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void testBackpackAddRemoveItem() {
        Key key = KeyFactory.getKey(1, "1");
        Key secondKey = KeyFactory.getKey(2, "2");
        Backpack backpack = new Backpack();
        backpack.addItem(key);
        backpack.addItem(secondKey);
        assertNotNull(backpack.getItem(key.getName()));
        assertNotNull(backpack.getItem(secondKey.getName()));
        backpack.removeItem(key);
        backpack.removeItem(secondKey);
        assertNull(backpack.getItem(key.getName()));
        assertNull(backpack.getItem(secondKey.getName()));
    }

    @Test
    public void testBackpackLimit() {
        final String invalidKey = "Invalid";
        Backpack backpack = new Backpack();
        backpack.addItem(KeyFactory.getKey(1, "1"));
        backpack.addItem(KeyFactory.getKey(2, "2"));
        backpack.addItem(KeyFactory.getKey(3, "3"));
        backpack.addItem(KeyFactory.getKey(4, "4"));
        backpack.addItem(KeyFactory.getKey(5, "5"));
        backpack.addItem(KeyFactory.getKey(42, invalidKey));
        backpack.printItems();
        assertFalse(outContent.toString().contains(invalidKey));
        assertTrue(outContent.toString().contains("5"));
    }

    @Test
    public void testPrintBackpack() {
        Key key = new Key();
        Backpack backpack = new Backpack();
        backpack.addItem(key);
        backpack.printItems();
        assertTrue(outContent.toString().contains(key.getName()));
        assertTrue(outContent.toString().contains("Here are the items in your backpack"));
    }

    @Test
    public void testBackpackViaPlayer() {
        Key key = KeyFactory.getKey(1, "1");
        Key secondKey = KeyFactory.getKey(2, "2");
        Player player = new Player();
        player.addItem(key);
        player.addItem(secondKey);
        assertNotNull(player.getItem(key.getName()));
        assertNotNull(player.getItem(secondKey.getName()));
        player.removeItem(key);
        player.removeItem(secondKey);
        assertNull(player.getItem(key.getName()));
        assertNull(player.getItem(secondKey.getName()));
    }

    @Test
    public void testPrintItemsCommand() {
        GameInputProcessor processor = mock(GameInputProcessor.class);
        when(processor.prompt()).thenReturn("inventory");
        when(processor.getNextCommand()).thenCallRealMethod();
        Command command = processor.getNextCommand();
        assertEquals(CommandVerb.INVENTORY, command.getVerb());
    }

    @Test
    public void testOmniDoorKey() {
        OmniDoor door = new OmniDoor();
        OmniKey key = new OmniKey();

        assertEquals(0, door.getFirstWrongPin(key));
        door.unlock(key);
        assertFalse(door.isOpen);

        key.useItem(door);
        assertEquals(-1, door.getFirstWrongPin(key));
        door.unlock(key);
        assertTrue(door.isOpen);
    }

    @Test
    public void testOmniDoorRandomGeneration() {
        OmniDoor door = new OmniDoor();
        OmniKey controlKey = new OmniKey();
        OmniKey initialKey = new OmniKey();
        OmniKey secondKey = new OmniKey();

        //copy the door's pins
        initialKey.useItem(door);
        //ensure (reasonably) the new copy is never randomly the same as before
        for (int i = 0; i < 10; i++) {
            //randomize the door's pins
            door.unlock(controlKey);
            //copy the door's new pins
            secondKey.useItem(door);
            if (initialKey.pins == secondKey.pins) {
                break;
            }
        }

        assertFalse(Arrays.equals(initialKey.pins, secondKey.pins));

    }

}
