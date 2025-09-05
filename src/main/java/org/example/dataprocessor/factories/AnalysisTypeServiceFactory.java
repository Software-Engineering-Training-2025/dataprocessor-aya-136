package org.example.dataprocessor.factories;
import org.example.dataprocessor.analyze.*;
import org.example.dataprocessor.enums.AnalysisType;

public class AnalysisTypeServiceFactory {
    public static AnalysisTypeService getAnalysisTypeServiceByType(AnalysisType type) {
        return switch (type) {
            case MEAN -> new MeanService();
            case MEDIAN -> new MedianService();
            case STD_DEV -> new StdDevService();
            case P90_NEAREST_RANK -> new P90Service();
            case TOP3_FREQUENT_COUNT_SUM -> new Top3FreqService();
            default -> throw new IllegalArgumentException("Unknown analysis type: " + type);
        };
    }
}
