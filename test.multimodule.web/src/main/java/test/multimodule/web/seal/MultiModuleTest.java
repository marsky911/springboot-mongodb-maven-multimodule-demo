 package test.multimodule.web.seal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author youzh
 * @date 2019/08/14
 */
 @SpringBootApplication
 @ComponentScan(basePackages="test.multimodule")
 public class MultiModuleTest {

     public static void main(String[] args) {
         SpringApplication.run(MultiModuleTest.class, args);
     }
     
 }
