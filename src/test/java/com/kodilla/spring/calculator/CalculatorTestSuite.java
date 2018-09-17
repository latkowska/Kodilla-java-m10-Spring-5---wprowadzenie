package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.hamcrest.core.IsEqual.equalTo;

public class CalculatorTestSuite {

    @Test
    public void testCalculations() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");

        Calculator calculator = context.getBean(Calculator.class);

        //When
        double addResult = calculator.add(2.25, 3.5);
        double subResult = calculator.sub(7.0, 2.5);
        double mulResult = calculator.mul(1.7, 2.9);
        double divResult = calculator.div(25.0, 5.0);

        //Then
        Assert.assertThat(5.75, equalTo(addResult));
        Assert.assertThat(4.5, equalTo(subResult));
        Assert.assertThat(4.93, equalTo(mulResult));
        Assert.assertThat(5.0, equalTo(divResult));

    }
}
