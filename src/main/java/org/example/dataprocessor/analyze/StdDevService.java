package org.example.dataprocessor.analyze;

import java.util.List;

public class StdDevService implements AnalysisTypeService{
    @Override
    public double analyze(List<Integer> data) {
        if (data.isEmpty()) return Double.NaN;
        double mean = data.stream().mapToDouble(Integer::doubleValue).average().orElse(0.0);
        double variance = data.stream().mapToDouble(x -> Math.pow(x - mean, 2)).sum() / data.size();
        return Math.sqrt(variance);
    }
}
