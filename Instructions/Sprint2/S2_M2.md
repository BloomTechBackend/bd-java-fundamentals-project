# Mastery Task 3 - String Manipulation

### AppSettings Update
Go to `com.adventure.settings.AppSettings` and update the `story` to `S2M2_TestDirections`.

## String Interpolation and Manipulation
Strings can be taken apart and put together in order to handle user inputs, provide outputs, format values properly, and so much more. In this assignment, we'll be taking user inputs and breaking them into manageable pieces as well as providing formatted outputs.

## Working Classes
We will be working with the following classes:
- GameInputProcessor (`adventure.GameInputProcessor`)
- Player (`adventure.player.Player`)

## GameInputProcessor
The `GameInputProcessor` class prompts the user for input and then structures it in such a way that the game can understand what it needs to do next. 

You'll first want to gather user inputs in the `prompt()` method. Here you'll want to use the `Scanner` class to gather and return user inputs. Once you have `Scanner` taking in inputs, you can test it by running the game (run it from the `Main` class). If the app crashes after entering your name, it's not working right.

Next you'll need to implement the `buildSimpleCommand()` method which will return a `Command` object that the game can use. `buildSimpleCommand()` will split the user input into two parts: the `verb` and the `object`. 

After you break up the user input, you can construct the `Command` object by passing it the `verb` (the first word) and the `object` (the remaining string, which in the case of this method, will always be blank).

For the `buildCommandWithObject()` method, you will want to get the verb the same way as before, but also supply the rest of the string as the object.

## Player
With the commands now returning their proper object, we're going to implement one of the commands: move. 

In the `Player` class, you'll find the `move()` method. Here you'll want to take the direction that is given and if it's "east", you'll want to increment the `currentLocationIndex`. If the direction is "west", you'll want to decrement the 'currentLocationIndex'.

Since you can't always move east or west in the game, an extra parameter is provided that lets you know if the value is invalid (`isValid`). If the value is invalid, you'll need to send the user the following message: "{DIRECTION} is not a valid direction".

## Testing
To run the tests for this assignment, run the following:

```./gradlew test --tests com.adventure.sprint2.S2M2Test```

or by right-clicking the `S2M2Test` file and selecting "Run 'S2M2Test'"

You can check your code styling by running the linter with the following command:

```./gradlew checkstyleMain```

You can run the game by going to the `Main` class and clicking on the run icon to the left of the `main()` method.
