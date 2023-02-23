package com.vmarcialtest.helloworld;

import java.util.ArrayList;
import java.util.List;
import com.google.common.collect.Lists; //google guava 


import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class demoController  {
    



    @RequestMapping("/MeepSunA3/demo")
 public static List<String> demolist(){
        List<String> demolist = Lists.newArrayList("victoria ","javier");
        //System.out.println(list);
             return (demolist);
    

 }

}


