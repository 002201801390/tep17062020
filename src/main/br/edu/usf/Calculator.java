package br.edu.usf;

public class Calculator {

    public double sum(double n1, double n2) {
        return n1 + n2;
    }

    public double subtraction(double n1, double n2) {
        return n1 - n2;
    }

    public double multiplication(double n1, double n2) {
        return n1 * n2;
    }

    public double division(double n1, double n2) {
        if (n2 == 0) {
            throw new IllegalArgumentException("Cannot divide by 0!");
        }

        return n1 / n2;
    }
}
