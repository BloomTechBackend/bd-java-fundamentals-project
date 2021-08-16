package com.adventure.sprint1;

import main.com.adventure.settings.AppSettings;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

class S1M2Test {

    @Test
    void smokeTest() {
        assertNotEquals(AppSettings.Story.S1M1_Beginning, AppSettings.story);
    }

}