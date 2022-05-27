package pro.sky.java.course2.calculatorgbn.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class Controller {

 private final ServiceCalc calculatorBody;

 public Controller(ServiceCalc calculatorBody){
     this.calculatorBody = calculatorBody;
 }
    @GetMapping
    public String hello(){
        return calculatorBody.hello();
    }
    @GetMapping(path = "/plus")
    public String plus(@RequestParam("num1") int num1, @RequestParam("num2") int num2){
     return calculatorBody.plus(num1,num2);
    }

    @GetMapping(path = "/minus")
    public String subtraction(@RequestParam("num1") int num1, @RequestParam("num2") int num2){
        return calculatorBody.subtraction(num1,num2);
    }

    @GetMapping(path = "/multiply")
    public String multiplication(@RequestParam("num1") int num1, @RequestParam("num2") int num2){
        return calculatorBody.multipliction(num1,num2);
    }

    @GetMapping(path = "/divide")
    public String division(@RequestParam("num1") int num1, @RequestParam("num2") int num2){
        return calculatorBody.division(num1,num2);
    }


}
