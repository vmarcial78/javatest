package com.vmarcialtest.helloworld;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
 public class HelloworldApplicationTests {
     public int add(int a , int b ){
		return a +b;
	 }

	 public static void main(String[] args){
		HelloworldApplicationTests c = new HelloworldApplicationTests();
		int res =c.add(10,10);
	    if (res ==20){
			System.out.println("correct");}
			else {
				 throw new RuntimeException("incorrect");
		         }
		
	 }
	@Test
	void contextLoads() {
	}

}
