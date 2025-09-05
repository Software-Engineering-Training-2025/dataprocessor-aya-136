package org.example.dataprocessor.factories;

import org.example.dataprocessor.enums.OutputType;
import org.example.dataprocessor.output.ConsoleService;
import org.example.dataprocessor.output.OutputTypeService;
import org.example.dataprocessor.output.TextFileService;

public class OutputTypeServiceFactory {
    public static OutputTypeService getOutputTypeServiceByType(OutputType type) {
        return switch (type) {
            case CONSOLE -> new ConsoleService();
            case TEXT_FILE -> new TextFileService();
            default -> throw new IllegalArgumentException("Unknown output type: " + type);
        };
    }
}
