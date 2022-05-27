package pro.sky.java.course2.calculatorgbn.controller;

import org.springframework.stereotype.Service;

@Service
public class CalculatorBody implements ServiceCalc{

    public String hello(){
        return "<b> Добро пожаловать в калькулятор.</b>";
    }

    public String plus(int num1, int num2){
        int sum = num1 + num2;
        String sum1 = "" + sum;
        return "" + num1 + " + " + num2 + " = " + sum1;
    }

    public String subtraction(int num1, int num2){
        int sub = num1 - num2;
        String sub1 = "" + sub;
        return "" + num1 + " - " + num2 + " = " + sub1;
    }

    public String multipliction(int num1, int num2){
        int mult = num1 * num2;
        String mult1 = "" + mult;
        return "" + num1 + " * " + num2 + " = " + mult1;
    }

    public String division(int num1, int num2) {
        String div1 = null;
        if (num2 == 0) {
            System.out.println("Делить на ноль нельзя");
        } else {
            int div = num1 / num2;
            div1 = "" + div;
        }
        return "" + num1 + " / " + num2 + " = " + div1;
    }
}
