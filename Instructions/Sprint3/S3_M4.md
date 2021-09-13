# Mastery Task 9 - Exceptions

## Exceptions

You will be including custom exceptions to handle some of the game's command logic. This will allow us to be more explicit in our error handling and messaging to the user.

You'll work with at least the following files:

- InvalidCommandException (new)
- EmptyCommandException (new)
- GameInputProcessor
- CommandVerb

### Invalid Commands
Up until now, we've used the `INVALID` enum value for commands that don't match any of the predefined outputs. That is ok, but it's not very explicit and `INVALID` isn't really a command, so it doesn't fit well as part of the enum. Instead, we'll go into `CommandVerb` and replace any instance of `INVALID` by throwing a custom exception. 

In this case, we'll have two exceptions: `InvalidCommandException` and `EmptyCommandException`. 

Create the two exceptions (make sure they extend `Exception`) and then "throw" them into the `CommandVerb` code where they seem to fit best.

### Handling the Error
Both of our new errors should __only be thrown__ in the `CommandVerb` class. We should pass the errors up to a higher class that can make a better decision with what to do when the error is thrown. Look into the calling classes and determine which class should handle the error. Once you do, use a `try-catch` to handle any messaging for the user and keep the code from crashing.

**Hint:** if you get into the `GameController`, you've gone too far. Your goal is to catch these errors, deliver a message to the user informing them of the error, and then allow the user to input another command. 

### Write Your Own
Now that you've made a few custom exceptions, find a place where an error could happen and throw an exception.

## Testing
To run the tests for this assignment, run the following:

```./gradlew test --tests com.adventure.sprint3.S3M4Test```

or by right-clicking the `S3M4Test` file and selecting "Run 'S3M4Test'"

You can check your code styling by running the linter with the following command:

```./gradlew checkstyleMain```

You can run the game by going to the `Main` class and clicking on the run icon to the left of the `main()` method.
