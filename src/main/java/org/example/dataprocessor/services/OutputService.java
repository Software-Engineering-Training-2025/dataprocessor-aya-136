package org.example.dataprocessor.services;

import org.example.dataprocessor.DataProcessingStage;
import org.example.dataprocessor.enums.OutputType;
import org.example.dataprocessor.factories.OutputTypeServiceFactory;

public class OutputService implements DataProcessingStage {
    @Override
    public Object process(Object input, Object type) throws Exception {
        double result = (Double) input;
        OutputTypeServiceFactory.getOutputTypeServiceByType((OutputType)type).output(result);
        return result;
    }
}
