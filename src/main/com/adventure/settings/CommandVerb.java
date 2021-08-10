package main.com.adventure.settings;

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
    LOOK_AROUND,
    INVALID,
    FIGHT,
    INVENTORY,
    HELP;

    /**
     * Takes a users input and determines which verb to include in the command.
     * @param verbString - the users input.
     * @return - the CommandVerb associated with the given input.
     */
    public static CommandVerb getVerb(String verbString) {

        if (verbString == null) {
            return INVALID;
        }

        CommandVerb verb;
        if (HELP.getCommandVariations().equals(verbString)) {
            verb = HELP;
        } else if (MOVE.getCommandVariations().equals(verbString)) {
            verb = MOVE;
        } else if (USE.getCommandVariations().equals(verbString)) {
            verb = USE;
        } else if (TAKE.getCommandVariations().equals(verbString)) {
            verb = TAKE;
        } else if (LOOK_AROUND.getCommandVariations().equals(verbString)) {
            verb = LOOK_AROUND;
        } else if (EXAMINE.getCommandVariations().equals(verbString)) {
            verb = EXAMINE;
        } else if (DIG.getCommandVariations().equals(verbString)) {
            verb = DIG;
        } else if (FIGHT.getCommandVariations().equals(verbString)) {
            verb = FIGHT;
        } else {
            verb = INVALID;
        }

        return verb;
    }

    private String getCommandVariations() {
        String verb = "";
        switch (this) {
            case TAKE:
                verb = "take";
                break;
            case MOVE:
                verb = "move";
                break;
            case USE:
                verb = "use";
                break;
            case DIG:
                verb = "dig";
                break;
            case EXAMINE:
                verb = "examine";
                break;
            case LOOK_AROUND:
                verb = "look";
                break;
            case HELP:
                verb = "help";
                break;
            case FIGHT:
                verb = "fight";
                break;
            default:
                verb =  "";
                break;
        }
        return verb;
    }
}
