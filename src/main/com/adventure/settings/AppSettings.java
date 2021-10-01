package main.com.adventure.settings;

public class AppSettings {

    /** You will update this property for each project. **/
    public static final Story story = Story.S1M2_Beginning;

    public enum Story {
        TestScene,

        S1M1_Beginning,
        S1M2_Beginning,

        S2M1_CaveEscape,
        S2M2_TestDirections,
        S2M3_HouseAndCave,
        S2M4_DigEscape,

        S3M1_TestDirections,
        S3M2_MonsterScene,
        S3M3,

    }

    /**
     * Checks if given story is greater than or equal to the selected story.
     * @param requestedStory - the story
     * @return - true if the current story is greater than or equal to the requested story.
     */
    public static boolean canAccessFunctions(Story requestedStory) {
        return AppSettings.story.ordinal() >= requestedStory.ordinal();
    }

    /**
     * Returns the starting location of a given story.
     * @return the starting location (defaults to 0)
     */
    public static int getStartingLocation() {
        int startingLocation = 0;
        switch (story) {
            case S2M2_TestDirections:
            case S2M3_HouseAndCave:
            case S3M1_TestDirections:
                startingLocation = 1;
                break;
            default:
                startingLocation = 0;
                break;
        }
        return startingLocation;
    }

}
