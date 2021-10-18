package main.com.adventure.world.scenes;

// CHECKSTYLE:OFF

import java.io.*;
import java.nio.charset.StandardCharsets;

// CHECKSTYLE:ON

public class SceneDescriptionFileReader {

    /**
     * This function has a parameter that's of class BufferedReader. BufferedReader stores the contents
     * of a file and can read the contents one line at a time. You can get the next line by
     * using the method readLine(). The BufferedReader doesn't know how many lines it has,
     * so instead, you need keep calling readLine until it returns null. Make sure you save off
     * the contents of each readLine call, because you can't go backwards, only forwards.
     *
     * For example, let's say the file contains the following:
     *
     *          Roses are red
     *          Violets are blue
     *          Unexpected bracket
     *          On line 32
     *
     * Then the first readLine() call will return "Roses are red", the second call "Violets are blue", etc.
     * On the fifth call, readLine() will return null, which means it's the end of the file.
     *
     * Your job in this method is use a while loop to append each line of the file to a string.
     * You will also need to add a new line escape character ("\n") AFTER EACH LINE.
     *
     * @param br - BufferedReader
     * @return the string of content read from the BufferedReader.
     * @throws IOException - File probably couldn't be found or read
     */

    private String produceTextFromBufferedReader(BufferedReader br) throws IOException {
        //remove this line
        throw new IOException();
    }

    ////// DO NOT CHANGE ANYTHING BELOW THIS LINE /////

    /**
     * Returns a string from the given filename.
     * @param filename - The filename to pull the text from
     * @return - the text from the file
     * @throws IOException - the file couldn't be found or read.
     */
    public String printTextFromFile(String filename) throws IOException {
        ClassLoader loader = getClass().getClassLoader();
        File file = new File(loader.getResource(filename).getFile());
        FileInputStream inputStream = new FileInputStream(file);

        String result;
        try (BufferedReader br = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8))) {
            result = produceTextFromBufferedReader(br);
        }
        return result;
    }

}
