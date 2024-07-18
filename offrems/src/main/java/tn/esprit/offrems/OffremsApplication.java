package tn.esprit.offrems;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class OffremsApplication {

    public static void main(String[] args) {
        SpringApplication.run(OffremsApplication.class, args);
    }

}
