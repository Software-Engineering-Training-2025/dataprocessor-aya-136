package org.example.dataprocessor.factories;
import org.example.dataprocessor.clean.CleanTypeService;
import org.example.dataprocessor.clean.RemoveNegativesService;
import org.example.dataprocessor.clean.ReplaceNegativesWithZeroService;
import org.example.dataprocessor.enums.CleaningType;

public class CleanTypeServiceFactory {
    public static CleanTypeService getCleanTypeServiceByType(CleaningType type) {
        return switch (type) {
            case REMOVE_NEGATIVES -> new RemoveNegativesService();
            case REPLACE_NEGATIVES_WITH_ZERO -> new ReplaceNegativesWithZeroService();
            default -> throw new IllegalArgumentException("Unknown cleaning type");
        };
    }
}
