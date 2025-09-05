package org.example.dataprocessor.services;

import org.example.dataprocessor.DataProcessingStage;

import java.util.ArrayList;
import java.util.List;

public class DataProcessingPipeline {
    private final List<DataProcessingStage> stages = new ArrayList<>();
    private final List<Object> stageTypes = new ArrayList<>();

    public DataProcessingPipeline addStage(DataProcessingStage stage, Object type) {
        stages.add(stage);
        stageTypes.add(type);
        return this;
    }

    public double execute(List<Integer> data) throws Exception {
        Object curStage = data;
        for (int i = 0; i < stages.size(); i++) {
            curStage = stages.get(i).process(curStage, stageTypes.get(i));
            System.out.println(
                    "After stage " + (i + 1) + " ([" + stageTypes.get(i) + "]): " + curStage
            );

        }
        return (Double) curStage;
    }
}

