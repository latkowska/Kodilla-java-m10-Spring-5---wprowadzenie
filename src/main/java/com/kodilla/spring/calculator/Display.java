package com.kodilla.spring.calculator;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Display {

    @Autowired
    private Calculator calculator;

    public void displayValue(double val){

        double sumResult = calculator.add(2.25, 3.5);
        double subResult = calculator.sub(7.0,2.5);
        double mulResult = calculator.mul(1.7, 2.9);
        double divResult = calculator.div(25.0, 5.0);

        System.out.println("Addition result is: " + sumResult);
        System.out.println("Subtraction result is: " + subResult);
        System.out.println("Multiplication result is: " + mulResult);
        System.out.println("Division result is: " + divResult);

    }
}
