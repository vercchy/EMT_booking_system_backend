package mk.ukim.finki.lab1_emt_213064;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class Lab1Emt213064Application {

    public static void main(String[] args) {
        SpringApplication.run(Lab1Emt213064Application.class, args);
    }
/*
    @Bean
    public PasswordEncoder passwordEncoder()
    {
        return new BCryptPasswordEncoder();
    }
*/
}
