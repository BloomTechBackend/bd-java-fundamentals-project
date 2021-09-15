# Mastery Task 8 - Arrays

## Arrays

We are going to change how the player object stores items like keys and shovels. Instead of storing them in separate objects, we're going to store them in an array. This will require us to loop through the array to perform various actions.

### Backpack
Open the `Backpack` class and read the comments. 

Fill in the TODOs to complete the object.

### Player
In the Player object, do the following:
1. Remove the `Key` and `Shovel` objects and replace them with a `Backpack` object with scope of `private`.  This will cause some issues with the setters and getters. 
    - Rewrite the logic for the setters and getters so they store/retrieve the items using the backpack. For the getters, use a default String to get the object. ("key" for getKey, "shovel" for getShovel).
2. Update the method `addItem` that takes an item of type `Tangible`. This method will then pass the item onto the backpack's `addItem` call.
3. Update the method `getItem` that takes a `String name` and returns an object of type `Tangible`. It will pass this along to the backback's `getItem` method.
4. Update the method `removeItem` that takes a `Tangible item`. This will pass the item onto the backpack's `removeItem` method.
5. Create the method `printItems` that calls the backpack's `printItems` method.
6. You may need to update some functions such as `setShovel`, `setKey`, etc, so they become convenient functions that simply call `addItem`.

### GameController
With the backpack now complete, we need to include logic for the CommandVerb `INVENTORY` (you may need to update CommandVerb to account for the `INVENTORY` enum if it's not already handled).
 
In `GameController` find the method `applyCommand`. Add `INVENTORY` to the switch statement's cases and have it call `player.printItems`.

## OmniKey and OmniDoors

Now that we've had some practice with arrays, we're going to introduce two new objects: OmniKey and OmniDoor. Open each of there files and fill in the TODOs to complete the objects.

## Testing
To run the tests for this assignment, run the following:

```./gradlew test --tests com.adventure.sprint3.S3M3Test```

or by right-clicking the `S3M3Test` file and selecting "Run 'S3M3Test'"

You can check your code styling by running the linter with the following command:

```./gradlew checkstyleMain```

You can run the game by going to the `Main` class and clicking on the run icon to the left of the `main()` method.
