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
        player.setHealth(10);

        Monster monster = new Monster("Ogre", 5, 10);
        Weapon noWeapon = new Weapon("bare knuckles", 3);
        player.setWeapon(noWeapon);
        CombatController controller = new CombatController(player, monster);
        controller.autosimulateCombat();

        assertTrue(controller.isPlayerDefeated());

        controller.reset();
        assertEquals(10, player.getHealth());
        assertEquals(10, monster.getHealth());

        Monster weakMonster = new Monster("bat", 1, 10);
        controller = new CombatController(player, weakMonster);
        controller.autosimulateCombat();

        assertFalse(controller.isPlayerDefeated());

        controller.reset();
        assertEquals(10, player.getHealth());
        assertEquals(10, monster.getHealth());

        Weapon bigSword = new Weapon("sword", 10);
        player.setWeapon(bigSword);

        controller.autosimulateCombat();
        assertFalse(controller.isPlayerDefeated());
    }

    @Test
    public void testReadFile() throws IOException {
        var reader = new SceneDescriptionFileReader();
        String result = reader.printTextFromFile("TestScene.txt");
        assertEquals("Roses are red\n" +
                "Violets are blue\n" +
                "Unexpected bracket\n" +
                "On line 32\n", result);
    }
}
