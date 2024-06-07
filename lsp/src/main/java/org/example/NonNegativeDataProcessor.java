package org.example;

import java.util.List;

public class NonNegativeDataProcessor extends DataProcessor{

    @Override
    public double process(List<Double> input){
        if(super.process(input) < 0){
            throw new RuntimeException("only positive numbers");
        }

        return input.get(0);
    }
}
