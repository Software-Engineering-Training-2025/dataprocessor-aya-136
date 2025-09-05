package org.example.dataprocessor.clean;

import java.util.List;
import java.util.stream.Collectors;

public class ReplaceNegativesWithZeroService implements CleanTypeService {
    public List<Integer> clean(List<Integer> data) {
        return data.stream().map(i -> i < 0 ? 0 : i).collect(Collectors.toList());
    }
}