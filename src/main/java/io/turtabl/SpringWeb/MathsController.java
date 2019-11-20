package io.turtabl.SpringWeb;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@Api
@RestController

public class MathsController {
//
//    @GetMapping("simple computation")
    @Autowired
    private Maths plus;
    @ApiOperation("simple computation")
    @RequestMapping("/add")

    public Number sum(
            @RequestParam(value= "num1") String num1,
            @RequestParam(value="num2") String num2){
        Integer n1 = Integer.parseInt(num1);
        Integer n2 = Integer.parseInt(num2);
//        return new Number(n1+n2);
        return new Number(this.plus.add( n1,n2));
    }
    @ApiOperation("simple computation")
    @RequestMapping
    public Number sub(
            @RequestParam(value="num1") String num1,
            @RequestParam(value="num2") String num2){

        Integer n1 = Integer.parseInt(num1);
        Integer n2 = Integer.parseInt(num2);
        return new Number(this.plus.sub(n1,n2));
    }
}
