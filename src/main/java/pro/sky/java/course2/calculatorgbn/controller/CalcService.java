package pro.sky.java.course2.calculatorgbn.controller;

import org.springframework.stereotype.Service;

@Service
public class CalcService implements ServiceCalc{

    public String hello(){
        return "<b> Добро пожаловать в калькулятор.</b>";
    }

    public int plus(int num1, int num2){
        int sum = num1 + num2;
        return sum;
    }

    public int subtraction(int num1, int num2){
        int sub = num1 - num2;
        return sub;
    }

    public int multipliction(int num1, int num2){
        int mult = num1 * num2;
        return mult;
    }

    public double division(double num1, double num2) {
            double div = num1 / num2;
        return div;
    }
}
