/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.geektrust.learning;

import java.io.FileNotFoundException;

public class Geektrust {
    public static void main(String[] args) throws FileNotFoundException {
        String fileName = args[0];
        File file=new File(fileName);
        file.read();
    }
}
