package main.com.adventure.world.objects;

import main.com.adventure.world.objects.keys.Key;

public class Hole {

    /**
     * Creates a hole with the given content.
     * @param content - the item that is covered by the hole.
     */
    public Hole(Key content) {

    }

    /**
     * Uncovers the hole. If applicable, the contents are now revealed.
     */
    public void dig() {

    }

    public boolean isCovered() {
        return false;
    }

    public Tangible getContent() {
        return null;
    }
}
