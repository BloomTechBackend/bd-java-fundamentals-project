package main.com.adventure.settings;

public class Command {

    public final static String TAKE = "take";
    public final static String MOVE = "move";
    public final static String USE = "use";
    public final static String DIG = "dig";
    public final static String EXAMINE = "examine";
    public final static String LOOK = "look";
    public final static String CHECK_ITEMS = "check items";
    public static final String INVALID = "invalid";
    public static final String HELP = "help";

    private String verb;
    private String objectName;

    public Command(String verb, String objectName) {
        this.verb = verb;
        this.objectName = objectName;
    }

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
