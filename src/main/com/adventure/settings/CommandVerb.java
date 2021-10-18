package main.com.adventure.settings;

import java.util.Locale;

/**
 * Sprint 3 Module 1
 * This CommandVerb will be used instead of strings once we've learned about Enums.
 */

public enum CommandVerb {
    TAKE,
    MOVE,
    USE,
    DIG,
    EXAMINE,
    LOOK,
    INVALID,
    HELP,
    //Used in Sprint 3 Module 2
    FIGHT,
    //Used in Sprint 3 Module 3
    INVENTORY;


    /**
     * Takes a users input and determines which verb to include in the command.
     * @param verbString - the users input.
     * @return - the CommandVerb associated with the given input.
     */
    public static CommandVerb getVerb(String verbString) {
        switch (verbString.toLowerCase(Locale.ROOT)) {
            case "take":
                return TAKE;
            case "move":
                return MOVE;
            case "use":
                return USE;
            case "dig":
                return DIG;
            case "examine":
                return EXAMINE;
            case "look":
                return LOOK;
            case "help":
                return HELP;
            case "fight":
                return FIGHT;
            case "inventory":
                return INVENTORY;
            default:
                return INVALID;
        }

    }

}
