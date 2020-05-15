package com.example.calc;

public class Calc {

    // Available operations
    public enum Operator {COS, SIN, TAN}


    private static Calc instance = null;

    // private constructor restricted to this class itself
    private Calc()
    {

    }

    // static method to create instance of Singleton class
    public static Calc getInstance()
    {
        if (instance == null)
            instance = new Calc();

        return instance;
    }


    public double doThing(double operand, Operator op) throws CalcException {
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
               throw new CalcException("Invalid operation");
        }
        return val;
    }


}
