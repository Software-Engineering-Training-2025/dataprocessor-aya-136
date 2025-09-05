package org.example.dataprocessor;
import org.example.dataprocessor.enums.*;
import org.example.dataprocessor.services.*;

import java.util.List;
class DataProcessorService {
    public double process(
            CleaningType cleaningType,
            AnalysisType analysisType,
            OutputType outputType,
            List<Integer> data) throws Exception {

        DataProcessingPipeline pipeline = new DataProcessingPipeline()
                .addStage(new CleanService(), cleaningType)
                .addStage(new AnalysisService(), analysisType)
                .addStage(new OutputService(), outputType);

        Object result = pipeline.execute(data);
        return (double) result;
    }

}