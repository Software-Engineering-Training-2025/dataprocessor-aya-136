package org.example.dataprocessor.services;

import org.example.dataprocessor.DataProcessingStage;
import org.example.dataprocessor.enums.CleaningType;
import org.example.dataprocessor.factories.CleanTypeServiceFactory;

import java.util.ArrayList;
import java.util.List;

public class CleanService implements DataProcessingStage {
    @Override
    public Object process(Object input, Object type) {
        List<Integer> data = (List<Integer>) input;
        List<Integer> copy = new ArrayList<>(data);
        return CleanTypeServiceFactory.getCleanTypeServiceByType((CleaningType)type).clean(copy);
    }
}
