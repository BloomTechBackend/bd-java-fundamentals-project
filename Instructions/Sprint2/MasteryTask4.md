# Mastery Task 4 - Constructing Classes

### AppSettings Update
Go to `com.adventure.settings.AppSettings` and update the `story` to `S2M3_HouseAndCave`.

## Constructors
Constructors allow us to instantiate (i.e. make a concrete object of) a class. In our game, we have keys and doors. The class files for these objects are mostly built out, but they are missing their constructors and some important properties.

## Working Classes
We will be working with the following classes:
- Key - `adventure.world.objects.keys.Key`
- KeyFactory - `adventure.world.objects.keys.KeyFactory`
- Door - `adventure.world.objects.doors.Door`
- DoorFactory - `adventure.world.objects.doors.DoorFactory`

## Creating a Key
Open the `Key` class where you'll add two properties and two constructors. 

The properties you'll need are 
- `level` (int)  
- `name` (String)
 
Once these are in place, you can create two constructors. 

The first constructor will take no parameters and will set the `level` and `name` to default values 1 and "key", respectively. 

The second constructor will require two parameters that will represent the level and name. You will save these parameters to their respective properties in the `Key` class. 

*You'll need to update some code in the `Key` class after you add the properties to make the class work properly. Read the comments inside the `Key` class for instructions on how you should edit the code.*

## KeyFactory
A factory is a class that builds instances of another class (or classes). You can read more on factories later, but for now, open the `KeyFactory` class and update the `buildKey` method to leverage your new two-parameter `Key` constructor. 

## Creating a Door
In the `Door` class, you'll take similar steps as with the `Key` class and add one property and two constructors. 

The property you'll need to add is `level` (int). 

Once `level` is in place, you can create two constructors. The first will take no parameters and will set the `level` and `isOpen` (`isOpen` already exists) to default values 1 and false, respectively. The second constructor will require two parameters that will allow a custom `level` and `isOpen` values. These parameters should be saved to their respective properties.

*Like the `Key` class, you'll need to update some code in the `Door` class once these properties are added to make the class works properly. Read the comments for where you should edit the code.*

## Another Factory
Open the `DoorFactory` class and update the `buildDoor` method to leverage your new `Door` constructor.

## Testing
To run the tests for this assignment, run the following:

```./gradlew test --tests com.adventure.sprint2.S2M3Test```

or by right-clicking the `S2M3Test` file and selecting "Run 'S2M3Test'"

You can check your code styling by running the linter with the following command:

```./gradlew checkstyleMain```

You can run the game by going to the `Main` class and clicking on the run icon to the left of the `main()` method.
