package com.adventure.sprint2;

import main.com.adventure.world.objects.doors.DoorFactory;
import main.com.adventure.world.objects.keys.KeyFactory;
import main.com.adventure.world.objects.doors.Door;
import main.com.adventure.world.objects.keys.Key;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class S2M3Test {

    @Test
    public void testKeyConstructors() {
        try {
            Key.class.getConstructor();
        } catch (NoSuchMethodException e) {
            assertFalse(true, "Key should have a constructor that takes an int");
        }

        try {
            Key.class.getConstructor(int.class);
        } catch (NoSuchMethodException e) {
            assertFalse(true, "Key should have a constructor that takes an int");
        }
    }

    @Test
    public void testDoorConstructors() {
        try {
            Door.class.getConstructor();
        } catch (NoSuchMethodException e) {
            assertFalse(true, "Door should have a constructor that takes a boolean and an int");
        }

        try {
            Door.class.getConstructor(boolean.class, int.class);
        } catch (NoSuchMethodException e) {
            assertFalse(true, "Door should have a constructor that takes a boolean and an int");
        }
    }

    @Test
    public void testKeyAndDoor() {
        Key key = KeyFactory.getKey(1, "key");

        Door door = DoorFactory.buildDoor(false, 1);
        door.useItem(key);
        assertTrue(door.isOpen());

        door = DoorFactory.buildDoor(false, 2);
        door.useItem(key);
        assertFalse(door.isOpen());

        door.setIsOpen(false);
        key = KeyFactory.getKey(2, "key");
        door.useItem(key);
        assertTrue(door.isOpen());
    }
}
