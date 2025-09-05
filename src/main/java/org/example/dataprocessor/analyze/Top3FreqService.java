package org.example.dataprocessor.analyze;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Top3FreqService implements AnalysisTypeService {
    @Override
    public double analyze(List<Integer> data) {
        if (data.isEmpty()) return 0.0;

        Map<Integer, Long> freqMap = data.stream()
                .collect(Collectors.groupingBy(x -> x, Collectors.counting()));

        return freqMap.entrySet().stream()
                .sorted((a, b) -> {
                    int cmp = Long.compare(b.getValue(), a.getValue());
                    if (cmp == 0) return Integer.compare(a.getKey(), b.getKey());
                    return cmp;
                })
                .limit(3)
                .mapToLong(Map.Entry::getValue)
                .sum();
    }
}