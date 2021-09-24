# Master Task 2 - Class Properties

### AppSettings Update
Go to `com.adventure.settings.AppSettings` and update the `story` to `S2M1_CaveEscape`.

## Properties
A property is a place to store a value. For example, a `Person` has the property `age`, which can store the value `30`. Then you can reference that value by simply stating `age`. If you need to change the `age` because it's the person's birthday, you can simply assign a new value (`31`) to the property. 

If properties sound like variables, it's because they are very similar. The main difference is that properties remain for the lifetime of the object that holds them. Variables can be discarded as soon as they're not needed, such as a variable that's created during a method, the method finishes, and any variables left over are cleaned up.

## Working Classes
We will be working with the following class:
- Player

## Player
Player is a class that has been built out considerably, but there are some new properties that we want to add as well as some methods to access the properties. 

### Name

The property we're adding today is `name`. This property will hold a `String` and we don't want outside classes to have direct access to it, so make the scope `private`. 

With that property in place, we can now write the getter and setter methods for `name`. They are called `getName` and `setName`. The methods are already defined, but they don't do anything (at the moment). Read the comments above each method to see what the requirements are and write the code to complete the requirements. 

### Arithmetic in Code
The last thing you'll need to do is calculate if the player can open a door (the doors are heavy). Find the method `canOpenDoor` and read the comments to find out how to validate if the player can open doors. 

## Testing
To run the tests for this assignment, run the following:

```./gradlew test --tests com.adventure.sprint2.S2M1Test```

or by right-clicking the `S2M1Test` file and selecting "Run 'S2M1Test'"

You can check your code styling by running the linter with the following command:

```./gradlew checkstyleMain```

You can run the game by going to the `Main` class and clicking on the run icon to the left of the `main()` method.
