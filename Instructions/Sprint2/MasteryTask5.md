# Master Task 5 - UML Diagraming

### AppSettings Update
Go to `com.adventure.settings.AppSettings` and update the `story` to `S2M4_DigEscape`.

## UML
You will be implementing the following UML diagram: https://drive.google.com/file/d/1EiE6GRljkjiIay1YqXZjpXIW2chhs5GJ/view?usp=sharing

## Working Classes
We will be working with the following classes:
- Hole - `adventure.world.objects.Hole`
- HoleContent (new)

## Turning UML into Code
The first task is to create the `HoleContent` object. You should be able to use the UML diagram to guide you in creating the class. 

**Note:** the `HoleContent` file does not exist yet. You'll need to create it from scratch.

## Using HoleContent in Hole
Once `HoleContent` is created, it's time to use it in the `Hole` object.

The `Hole` constructor receives a `Key` which should be used in creating a `HoleContent` object. 

*The game world is only aware of the `Hole` object, so everything you build in `HoleContent` will only be accessible through `Hole`. You should write `Hole` so that it leverages `HoleContent` as much as is within the scope of the UML diagram.*

## Testing
To run the tests for this assignment, run the following:

```./gradlew test --tests com.adventure.sprint2.S2M4Test```

or by right-clicking the S2M4Test file and selecting "Run 'S2M4Test'"

You can check your code styling by running the linter with the following command:

```./gradlew checkstyleMain```

You can run the game by going to the `Main` class and clicking on the run icon to the left of the `main()` method.
