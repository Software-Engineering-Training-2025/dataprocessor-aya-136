package org.example.dataprocessor.services;

import org.example.dataprocessor.DataProcessingStage;
import org.example.dataprocessor.enums.AnalysisType;
import org.example.dataprocessor.factories.AnalysisTypeServiceFactory;

import java.util.List;

public class AnalysisService implements DataProcessingStage {
    @Override
    public Object process(Object input, Object type) {
        List<Integer> data = (List<Integer>) input;
        return AnalysisTypeServiceFactory.getAnalysisTypeServiceByType((AnalysisType)type).analyze(data);
    }
}
