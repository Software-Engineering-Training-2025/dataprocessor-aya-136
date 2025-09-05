package org.example.dataprocessor.analyze;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MedianService implements AnalysisTypeService{
    @Override
    public double analyze(List<Integer> data) {
        if (data.isEmpty()) return Double.NaN;
        List<Integer> sorted = new ArrayList<>(data);
        Collections.sort(sorted);
        int n = sorted.size();
        if (n % 2 == 1) return sorted.get(n / 2);
        else return (sorted.get(n/2 - 1) + sorted.get(n/2)) / 2.0;
    }
}
