package org.example.dataprocessor;

public interface DataProcessingStage {
    Object process(Object input, Object type) throws Exception;
}