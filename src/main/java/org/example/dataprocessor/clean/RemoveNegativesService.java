package org.example.dataprocessor.clean;

import java.util.List;
import java.util.stream.Collectors;

public class RemoveNegativesService implements CleanTypeService{
    public List<Integer> clean(List<Integer> data) {
        return data.stream().filter(i -> i >= 0).collect(Collectors.toList());
    }
}
