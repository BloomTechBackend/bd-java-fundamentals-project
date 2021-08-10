package main.com.adventure.settings;

public class AppSettings {

    /**You will update this property for each project**/
    final public static Story story = Story.S2M1_CaveEscape;

    public enum Story {
        TestScene,

        S2M1_CaveEscape,
        S2M2_TestDirections,
        S2M3_HouseAndCave,
        S2M4_DigEscape,

        S3M1_TestDirections,
        S3M2_MonsterScene,
        S3M3,

    }

    public static boolean canAccessFunctions(Story story) {
        return AppSettings.story.ordinal() >= story.ordinal();
    }

    public static int getStartingLocation() {
        int startingLocation = 0;
        switch (story) {
            case S2M1_CaveEscape:
            case S2M4_DigEscape:
            case S3M2_MonsterScene:
            case TestScene:
                startingLocation = 0;
                break;
            case S2M2_TestDirections:
            case S2M3_HouseAndCave:
                startingLocation = 1;
                break;
        }
        return startingLocation;
    }

}
