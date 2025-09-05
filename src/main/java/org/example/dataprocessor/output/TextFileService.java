package org.example.dataprocessor.output;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class TextFileService implements OutputTypeService{
    @Override
    public void output(Double result) {
        File file = new File("Desktop/result.txt");
        file.getParentFile().mkdirs();
        try (PrintWriter pw = new PrintWriter(file)) {
            pw.println("Result = " + result);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
