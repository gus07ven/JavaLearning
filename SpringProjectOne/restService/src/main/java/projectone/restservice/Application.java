/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectone.restservice;

/**
 *
 * @author gusta
 */
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("restSpringXMLConfig.xml")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        
    }
}