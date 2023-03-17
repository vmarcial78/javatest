package com.vmarcialtest.helloworld;

import org.springframework.boot.test.context.SpringBootTest;

import org.junit.jupiter.api.Test;
@SpringBootTest
public class test2 {
    public int sub(int a , int b ){
		return a -b;
}


public static void main(String[] args){
    test2 c = new test2();
    int res =c.sub(10,10);
    if (res ==0){
        System.out.println("correct");}
        else {
             throw new RuntimeException("incorrect");
             }
    
 }
@Test
void contextLoads() {
}
	

}