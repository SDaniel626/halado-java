package hu.me;

import java.util.Objects;

public class Calculator implements hu.me.inf.Calculator {
    private final Logger logger;

    public Calculator(Logger logger) {
        Objects.requireNonNull(logger);
        this.logger = logger;
    }

    public int addition(int a, int b){
        logger.log("Addition method was used");
        return a+b;
    }
    public int subtraction(int a, int b){
        logger.log("Subtraction method was used");
        return a-b;
    }

    public double divide(int a, int b){
        if(b == 0)
        {
            logger.log("Divide method was used with the intent to divide by zero");
            throw new DivisionByZeroException();
        } else {
            logger.log("Divide method was used");
            return a / (double) b;
        }
    }

    public int multiply(int a, int b){
        logger.log("Multiply method was used");
        return a * b;
    }
}
