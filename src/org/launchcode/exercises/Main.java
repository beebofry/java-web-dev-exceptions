package org.launchcode.exercises;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        // Test out your Divide() function!
//        Divide(3, 3);
//        Divide(3, 0);

        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "Program.java");
        studentFiles.put("Brad", "");
        studentFiles.put("Elizabeth", "MyCode.java");
        studentFiles.put("Stefanie", "CoolProgram.java");

        for (String fileName : studentFiles.values()){
            CheckFileExtension(fileName);
        }
//        CheckFileExtension("");

    }

    public static int Divide(int x, int y) {
        if (y <= 0) {
            try {
                throw new ArithmeticException("Cannot divide by 0!");
            } catch (ArithmeticException e) {
                e.printStackTrace();
            }
        }
        return x / y;
    }

    public static int CheckFileExtension(String fileName) {
        int points = 0;
        if (fileName.equals("")) {
            try {
                throw new RuntimeException("File name needed!");
            } catch (RuntimeException e) {
                e.printStackTrace();
                points = -1;
            }
        } else if (fileName.endsWith(".java")) {
            points = 1;
        } else if (!fileName.endsWith(".java")) {
            points = 0;
        }
        return points;
    }
}

