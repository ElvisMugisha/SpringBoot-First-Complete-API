package com.example.firstAPI.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student elvis = new Student(
                    "Elvis",
                    "elvis@gmail.com",
                    LocalDate.of(2000, Month.APRIL, 10)
            );
            Student mugisha = new Student(
                    "Mugisha",
                    "mugisha@gmail.com",
                    LocalDate.of(2001, Month.APRIL, 10)
            );

            repository.saveAll(
                    List.of(elvis, mugisha)
            );
        };
    }
}
