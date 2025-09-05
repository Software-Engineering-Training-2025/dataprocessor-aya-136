package org.example;

import org.example.dataprocessor.enums.*;
import org.example.dataprocessor.services.*;
import org.example.dataprocessor.services.DataProcessingPipeline;

import java.util.Arrays;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception {
        List<Integer> data = Arrays.asList(1,3,5,7,9,11,13,15,17,19);
        System.out.println("Before Processing = " + data);

        DataProcessingPipeline pipeline = new DataProcessingPipeline()
                .addStage(new CleanService(), CleaningType.REMOVE_NEGATIVES)
                .addStage(new AnalysisService(), AnalysisType.P90_NEAREST_RANK)
                .addStage(new OutputService(), OutputType.TEXT_FILE);

        double result = pipeline.execute(data);

        System.out.println("After Processing = " + result);
    }
}