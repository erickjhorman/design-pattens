package org.example.interfaces;

public class LoggerImpl implements Logger {
    @Override
    public void process() {
        multiply();
    }

    private int multiply() {
        System.out.println("Multiply 2 numbers");
        return 2 * 2;
    }

}
