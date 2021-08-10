package com.adventure.sprint3;

import main.com.adventure.CombatController;
import main.com.adventure.player.Player;
import main.com.adventure.world.objects.Weapon;
import main.com.adventure.world.Monster;
import main.com.adventure.world.scenes.SceneDescriptionFileReader;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

public class S3M2Test {

    @Test
    public void testCombatSimulator() {
        Player player = new Player();
        Monster monster = new Monster("Ogre", 5, 10);
        player.setHealth(10);
        Weapon noWeapon = new Weapon("bare knuckles", 3);
        player.setWeapon(noWeapon);
        CombatController controller = new CombatController(player, monster);

        controller.autosimulateCombat();
        assertTrue(controller.isPlayerDefeated());

        player.setHealth(10);
        monster.setHealth(10);

        Weapon bigSword = new Weapon("sword", 10);
        player.setWeapon(bigSword);

        controller.autosimulateCombat();
        assertFalse(controller.isPlayerDefeated());
    }

    @Test
    public void testReadFile() throws IOException {
        var reader = new SceneDescriptionFileReader();
        String result = reader.printTextFromFile("TestScene.txt");
        assertEquals("Test file\n", result);
    }
}
