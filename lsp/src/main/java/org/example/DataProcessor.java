package org.example;

import java.util.List;

public class DataProcessor {

    public double process(List<Double> input){
        double min = input.get(0);

        for (int i = 1; i < input.size(); i++){
            if(input.get(i) < min){
                min = input.get(i);
            }
        }

        return min;
    }
}
