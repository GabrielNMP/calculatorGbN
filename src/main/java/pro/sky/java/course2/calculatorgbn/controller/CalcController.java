package pro.sky.java.course2.calculatorgbn.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalcController {

 private final ServiceCalc calcservice;

 public CalcController(ServiceCalc calcservice){
     this.calcservice = calcservice;
 }
    @GetMapping
    public String hello(){
        return calcservice.hello();
    }
    @GetMapping(path = "/plus")
    public String plus(@RequestParam("num1") int num1, @RequestParam("num2") int num2){
     return num1 + " + " + ""+ num2 + "=" + calcservice.plus(num1,num2);

    }

    @GetMapping(path = "/minus")
    public String subtraction(@RequestParam("num1") int num1, @RequestParam("num2") int num2){
        return num1 + " - " + ""+ num2 + " = " + calcservice.subtraction(num1,num2);
    }

    @GetMapping(path = "/multiply")
    public String multiplication(@RequestParam("num1") int num1, @RequestParam("num2") int num2){
        return num1 + " * " + "" + num2 + " = " + calcservice.multipliction(num1,num2);
    }

    @GetMapping(path = "/divide")
    public String division(@RequestParam("num1") double num1, @RequestParam("num2") double num2) {
        if (num2 == 0) {
            return " Делить на ноль нельзя. ";
        } else {
            return num1 + " / " + "" + num2 + " = " + calcservice.division(num1, num2);
        }
    }

}
