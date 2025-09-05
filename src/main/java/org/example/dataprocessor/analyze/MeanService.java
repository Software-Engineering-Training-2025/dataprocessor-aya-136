package org.example.dataprocessor.analyze;

import java.util.List;

public class MeanService implements AnalysisTypeService{
    @Override
    public double analyze(List<Integer> data) {
        double sum = 0;
        for (int num : data) {
            sum += num;
        }
        return data.isEmpty() ? 0 : sum / data.size();

    }
}
