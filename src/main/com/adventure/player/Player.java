package main.com.adventure.player;

import main.com.adventure.settings.AppSettings;
import main.com.adventure.world.objects.Shovel;
import main.com.adventure.world.objects.Tangible;
import main.com.adventure.world.objects.Weapon;
import main.com.adventure.world.objects.keys.Key;

public class Player {

    public int level = 5;
    //TODO Add name variable here
    private int currentLocationIndex = AppSettings.getStartingLocation();
    private Key key;
    private Shovel shovel;
    private int power = 1;
    private int health = 10;

    /**
     * Sprint 2 Module 1
     * Saves the player's name. This file should store the name so it can be referenced later. After setting the name,
     * inform the user that the name has been changed by saying "Your name is now {name}".
     * @param newName - the player's name that will be saved
     */
    public void setName(String newName) {

    }

    /**
     * Sprint 2 Module 1
     * Retrieves the name of this player. The name of the player should be stored in this file, so we should reference
     * that value here.
     * @return The name of the player
     */
    public String getName() {
        return null;
    }

    /**
     * Sprint 2 Module 1
     * The canOpenDoor is calculated by taking the player's level and dividing it by 2. If the result is greater than 2, the
     * player can open doors.
     * @return true if the player's level is enough to open the door.
     */
    public boolean canOpenDoor() {
        return false;
    }





    /**
     * Sprint 2 Module 2
     * The move function will take two parameters: a direction and a list of possible directions. It will be up to this
     * function to determine if the direction is valid. If it is, the currentLocationIndex will increment (EAST) or
     * decrement (WEST) based on the direction. If the direction is invalid for any reason, the program should print
     * "{DIRECTION} is not a valid direction" to the console.
     *
     * You should also return true if the move is executed. Otherwise, return false.
     *
     * @param direction - the direction the player wishes to go
     * @param isValid - the possible directions
     * @return true if the move is executed. Otherwise, false.
     */
    public boolean move(String direction, boolean isValid) {
        return true;
    }

    /**
     * Sprint 3 Module 2
     * Will increase the players power based on the item that is passed in.
     * @param item - the weapon that will be used to adjust the player's power.
     */
    public void setWeapon(Weapon item) {
        //TODO Complete this function in Sprint 3 Module 2
    }

    /**
     * Sprint 3 Module 3
     * Retrieves the item in the backpack.
     * @param itemName - the name af the item, given by the user
     * @return the item or null if the item does not exist
     */
    public Tangible getItem(String itemName) {
        //TODO Complete this function in Sprint 3 Module 3
        return null;
    }

    /**
     * Sprint 3 Module 3
     * Removes the item from the backpack and returns that item.
     * @param item - the item you want to remove
     * @return the removed item
     */
    public boolean removeItem(Tangible item) {
        //TODO Complete this function in Sprint 3 Module 3
        return false;
    }

    /**
     * Sprint 3 Module 3
     * Prints the inventory.
     */
    public void printItems() {
        //TODO Complete this function in Sprint 3 Module 3
    }

    /**
     * Sprint 3 Module 3
     * Stores an item into the backpack.
     * @param item - item to add.
     */
    public void addItem(Tangible item) {
        //TODO Complete this function
    }

    public void setKey(Key item) {
        key = item;
    }

    public Key getKey() {
        return key;
    }

    public void setShovel(Shovel item) {
        shovel = item;
    }

    public Shovel getShovel() {
        return shovel;
    }

    //////// DON'T CHANGE THE CODE BELOW. ///////////

    public int getCurrentLocation() {
        return currentLocationIndex;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getPower() {
        return power;
    }
}
