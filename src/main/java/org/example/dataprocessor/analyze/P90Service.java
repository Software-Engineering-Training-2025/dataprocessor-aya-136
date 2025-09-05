package org.example.dataprocessor.analyze;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class P90Service implements AnalysisTypeService {
    @Override
    public double analyze(List<Integer> data) {
        if (data.isEmpty()) return Double.NaN;
        List<Integer> sorted = new ArrayList<>(data);
        Collections.sort(sorted);
        int n = sorted.size();
        int rank = (int) Math.ceil(0.90 * n);
        return sorted.get(rank - 1);
    }
}
