package org.example;

import java.util.List;

public class DataSource {
    private final DataProcessor dataProcessor;

    public DataSource(DataProcessor dataProcessor) {
        this.dataProcessor = dataProcessor;
    }

    public double run(){
        return dataProcessor.process(generate());

    }

    public List<Double> generate(){
        return List.of(1.0,2.0,-3.0,4.0,0.0);
    }
}
