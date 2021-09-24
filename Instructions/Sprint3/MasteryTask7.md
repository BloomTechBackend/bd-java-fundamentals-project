# Mastery Task 7 - Loops

### App Update
Inside of `com.adventure.settings.AppSettings`, update the story `S3M2_MonsterScene`

## Loops
We will be building an automated combat system that will involve loops as well as a file reader.

## Working Classes
We will be working with the following classes:
- Monster (already built) - `adventure.world.Monster`
- CombatController - `adventure.CombatController`
- Player - `adventure.player.Player`
- SceneDescriptionFileReader - `adventure.scenes.SceneDescriptionFileReader`

### Combat System
When a `Player` encounters a `Monster`, the game will build a `CombatController` that will pit the player and the monster into a battle. 

Each fighter takes a turn hitting the other and the one that gets the other fighter to 0 health first, wins. 

The amount of health points that are taken away is based on the fighter's power. So if the player has 10 health and the monter has a power of 2, then when the monster hits the player, the player's health goes down by 2 points and the player now has 8. 

See the `CombatController` file for more information on how to properly implement its behavior.
 
 **Hint:** only one loop should be necessary to complete this task.


### Player
You will need to update `Player.equipWeapon()`. See the function's comments to see how it should work.

### File Reader
Reading files is perhaps the most common use case for while loops. That's because when you read in a file, you don't actually know how long the file is. For loops are used when we know how many iterations are required, so using a for loop here would not work.
 
This Sprint introduces the capability of scenes to have their descriptions inside of text files as opposed to being hardcoded in classes.

Read the class `SceneDescriptionFileReader` to learn about `BufferedReader` which is a class commonly used to read in files. It will tell you the essential characteristics of `BufferedReader` and how to successfully use it to read in a text file's contents.

## Testing
To run the tests for this assignment, run the following:

```./gradlew test --tests com.adventure.sprint3.S3M2Test```

or by right-clicking the `S3M2Test` file and selecting "Run 'S3M2Test'"

You can check your code styling by running the linter with the following command:

```./gradlew checkstyleMain```

You can run the game by going to the `Main` class and clicking on the run icon to the left of the `main()` method.
