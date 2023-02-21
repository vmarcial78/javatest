package com.vmarcialtest.helloworld;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
//http://localhost:8080/MeepSunA3 
public class HelloController {

    @RequestMapping("/MeepSunA3")
     
    
  @GetMapping  
    public String getName(@RequestParam (value = "name",defaultValue = "world" )String name  ){

    return "hello  " + name  ;
 
} 


}
