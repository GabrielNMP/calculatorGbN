package pro.sky.java.course2.calculatorgbn.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalcController {

 private final ServiceCalc calcserviceimp;

 public CalcController(ServiceCalc calcserviceimp){
     this.calcserviceimp = calcserviceimp;
 }
    @GetMapping
    public String hello(){
        return calcserviceimp.hello();
    }
    @GetMapping(path = "/plus")
    public String plus(@RequestParam("num1") int num1, @RequestParam("num2") int num2){
     return "" + num1 + " + " + ""+ num2 + "=" + calcserviceimp.plus(num1,num2);

    }

    @GetMapping(path = "/minus")
    public String subtraction(@RequestParam("num1") int num1, @RequestParam("num2") int num2){
        return "" + num1 + " - " + ""+ num2 + " = " + calcserviceimp.subtraction(num1,num2);
    }

    @GetMapping(path = "/multiply")
    public String multiplication(@RequestParam("num1") int num1, @RequestParam("num2") int num2){
        return "" + num1 + " * " + "" + num2 + " = " + calcserviceimp.multipliction(num1,num2);
    }

    @GetMapping(path = "/divide")
    public String division(@RequestParam("num1") int num1, @RequestParam("num2") int num2){
        return "" + num1 + " / " + "" + num2 + " = " + calcserviceimp.division(num1,num2);
    }


}
