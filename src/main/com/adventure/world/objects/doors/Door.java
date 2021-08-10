package main.com.adventure.world.objects.doors;

import main.com.adventure.world.objects.keys.Key;
import main.com.adventure.world.objects.Tangible;

/**
 * Doors can be open or locked. That state should be maintained in this class.
 * A doors level cannot change once the class is created. You should create a multiple constructors that allow the Door
 * to be created:
 * 1. without any inputs (i.e. default parameters)
 * 2. a level and an open/locked state
 *
 * The default values for a door are level = 1 and isOpen = false
 */

public class Door implements Tangible {

    //TODO Add isOpen and level properties

    /**
     * Creates a door that is closed and level 1.
     */
    //TODO Add default (i.e. no params) constructor here

    /**
     * Creates a door with a status of isOpen and a level.
     * @param isOpen - state of the door
     * @param level - the level that corresponds with the key that can open this door.
     */
    //TODO add constructor that takes an isOpen and level and saves both



    private boolean isKeyValid(Key key) {
        //TODO Update doorLevel so it references the level of this door
        int doorLevel = -1;


        return key != null && key.getLevel() == doorLevel;
    }

    //TODO Implement isOpen's getter and setter
    public boolean isOpen() {
        return false;
    }

    public void setIsOpen(boolean isOpen) {

    }






    //******IGNORE THE CODE BELOW******//

    @Override
    public String getName() {
        return "door";
    }

    @Override
    public Boolean canTake() {
        return false;
    }

    @Override
    public Boolean canUse(Tangible item) {
        Key key = (Key) item;
        if (isKeyValid(key)) {
            return true;
        }
        return false;
    }

    @Override
    public void useItem(Tangible initiator) {
        if (this.canUse(initiator)) {
            setIsOpen(true);
            System.out.println("Door is now open");
        } else {
            System.out.println("That didn't work on the door");
        }
    }

    @Override
    public void use() {
        if (isOpen()) {
            System.out.println("It's unlocked. You can walk on through if you like.");
        } else {
            System.out.println("It's locked. It may need a key.");
        }
    }

    @Override
    public String getDescription() {
        if (isOpen()) {
            return "It's an open door";
        } else {
            return "It's a locked door";
        }
    }


}
