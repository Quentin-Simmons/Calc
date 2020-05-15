package com.example.calc;

public class Calculator {

    // Available operations
    public enum Operation {COS, SIN, TAN}


    private static Calculator instance = null;

    // private constructor restricted to this class itself
    private Calculator()
    {

    }

    // static method to create instance of Singleton class
    public static Calculator getInstance()
    {
        if (instance == null)
            instance = new Calculator();
        return instance;
    }


    public double doOperation(double operand, Operation op) throws CalcException {
        double val = 0.0;
        switch (op) {
            case COS:
                val = Math.cos(operand);
                break;
            case SIN:
                val = Math.sin(operand);
                break;
            case TAN:
                val = Math.tan(operand);
                break;
            default:
               throw new CalcException("Invalid Calculator Operation");
        }
        return val;
    }


}
