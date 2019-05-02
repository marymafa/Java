package com.company;

public class Main {
    private double firstNumber;
    private double secondNumber;

    public double getFirstNumber() {
        return firstNumber;
    }

    public double getSecondNumber(){
        return this.secondNumber;
    };

    public void setFirstNumber(double newNumber) {
        this.firstNumber = newNumber;
    }

    public void setSecondNumber(double newNumber) {
        this.secondNumber = newNumber;
    }

    public  double getAdditionalResult(){
        return firstNumber + secondNumber;

    };
    public  double getSubstractResult(){
        return  firstNumber - secondNumber;

    };
    public  double getMultiplicationResults(){
        return firstNumber * secondNumber;

    };
    public  double getDivisionResults(){
        return firstNumber / secondNumber;
    };

    public static void main(String[] args) {
      

    }
}
