package main.com.adventure;

import main.com.adventure.settings.Command;
import main.com.adventure.settings.CommandVerb;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class GameInputProcessor {

    Scanner scanner = new Scanner(System.in, StandardCharsets.UTF_8);

    /**
     * Starts the prompt process to the user.
     * @return the response from the user.
     */
    public String prompt() {
        System.out.println("Enter your next command:");
        return scanner.nextLine();
    }

    /**
     * Inputs that come into this method represent single action with no object. When building the command, you'll want
     * to supply the first word as the verb and leave the objectName blank.
     * Example input:
     *  - help
     *  - look
     * @param input - the input from the user
     * @return - the Command object with the proper verb and blank object
     */
    private Command buildSimpleCommand(String input) {
        String verb = input.split(" ")[0];
        return new Command(CommandVerb.getVerb(verb));
    }

    /**
     * Inputs that come into this method will have an object or objects that the action is acting on. You'll need to
     * include the object as part of the Command object.
     * Example input:
     *  - use key
     *  - examine door
     *  - move west
     * @param input - the input from the user
     * @return - the Command object with the proper verb and object
     */
    private Command buildCommandWithObject(String input) {
        int spaceIndex = input.indexOf(" ");
        String verb = input.substring(0, spaceIndex);
        String objectName = input.substring(spaceIndex + 1);
        return new Command(CommandVerb.getVerb(verb), objectName);
    }


    /** DO NOT CHANGE ANYTHING BELOW THIS LINE. **/

    /**
     * Gets the next command from the user.
     * @return a command object
     */
    public Command getNextCommand() {
        String input = prompt();
        return processCommand(input);
    }

    private Command processCommand(String input) {
        if (input.contains(Command.MOVE) ||
                input.contains(Command.USE) ||
                input.contains(Command.TAKE) ||
                input.contains(Command.EXAMINE)
        ) {
            return buildCommandWithObject(input);
        } else {
            return buildSimpleCommand(input);
        }
    }

}
