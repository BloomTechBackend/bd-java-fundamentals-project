# Mastery Task 6 - Enumerating the Commands

#### AppSettings Update
Go to `com.adventure.settings.AppSettings` and update the `Story` to `S3M1_TestDirections`.

## Enums
We will be using enums to improve how the game processes directions.

### Working Classes
We will be working with the following classes:
- Command - `adventure.settings.Command`
- CommandVerb - `adventure.settings.CommandVerb`
- GameController - `adventure.settings.GameController`
- GameInputProcessor - `adventure.GameInputProcessor`

### Updating Code Logic
Sometimes we need to go in and change code for a variety of reasons. Today, you will be updating the logic that reads in commands to use an enum instead of strings. 

`CommandVerb` is an enum that breaks down the different commands into variable names. 

This has various advantages, one of which is enums provide autocomplete and fewer typos, where as `Strings` can be easily misspelled and could lead to [runtime errors](https://www.geeksforgeeks.org/difference-between-compile-time-errors-and-runtime-errors/).

### CommandVerb
Within `CommandVerb`, you'll find a list of predefined enum values and the static function `getVerb`. 

Look over the list of commands. You'll then want to complete the `getVerb` method which turns a string into the appropriate command (the string should match the same spelling, ignoring case). Once a match is found, the appropriate `CommandVerb` should be returned. If no match is found, the function should return `CommandVerb.INVALID`.

### Command
With `CommandVerb` ready to go, open the `Command` object and change each type of the variable `verb` from a `String` to `CommandVerb`. 

For example,

```
String verb
```

now becomes

```
CommandVerb verb
```

### Game Controller
With the `Command` object taking a `CommandVerb` instead of a String, go to `GameController` and find the method `applyCommand()`. It will be comparing the user's input with a static string (e.g. `Command.HELP`). 

Create a switch statement to use the enum instead of comparing strings. If you have a command that will be used in later modules, just put `break;` as their logic. 

### GameInputProcessor
You will need to fix `buildSimpleCommand` and `buildCommandWithObject` to supply a `CommandVerb` instead of a string.

## Testing
To run the tests for this assignment, run the following:

```./gradlew test --tests com.adventure.sprint3.S3M1Test```

or by right-clicking the `S3M1Test` file and selecting "Run 'S3M1Test'"

You can check your code styling by running the linter with the following command:

```./gradlew checkstyleMain```

You can run the game by going to the `Main` class and clicking on the run icon to the left of the `main()` method.
