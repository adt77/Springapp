package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;


@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student Abhinav = new Student(
                    "Abhinav",
                    LocalDate.of(2016, 5, 6),
                    "abhinavtarhekar@gmail.com"

            );
            Student Pratik = new Student(
                    "Pratik",
                    LocalDate.of(2014, 6, 16),
                    "pratik@gmail.com"
            );
                    repository.saveAll(
                            List.of(Abhinav, Pratik)
                    );
        };
    }
}
