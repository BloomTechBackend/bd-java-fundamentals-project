package main.com.adventure.settings;

public class Command {

    public static final String TAKE = "take";
    public static final String MOVE = "move";
    public static final String USE = "use";
    public static final String DIG = "dig";
    public static final String EXAMINE = "examine";
    public static final String LOOK = "look";
    public static final String CHECK_ITEMS = "check items";
    public static final String INVALID = "invalid";
    public static final String HELP = "help";

    private String verb;
    private String objectName;

    /**
     * Creates a command.
     * @param verb - the verb of the command
     * @param objectName - the object(s) to which the command is directed.
     */
    public Command(String verb, String objectName) {
        this.verb = verb;
        this.objectName = objectName;
    }

    /**
     * Creates a command with no direct object (e.g. "help").
     * @param verb - the verb of the command
     */
    public Command(String verb) {
        this.verb = verb;
        this.objectName = "";
    }

    public String getObjectName() {
        return objectName;
    }

    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }

    public String getVerb() {
        return verb;
    }

    public void setVerb(String verb) {
        this.verb = verb;
    }

    @Override
    public String toString() {
        return "Command{" +
                "verb='" + verb + '\'' +
                ", objectName='" + objectName + '\'' +
                '}';
    }
}
