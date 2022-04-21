package com.nirmal.stock.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository){
        return args -> {

            Student nirmal = Student.builder()
                    .name("Nirmal")
                    .email("nirmal@gmail")
                    .id(1l)
                    .dob(LocalDate.of(1991, 1, 1))
                    .build();
            Student sonali = Student.builder()
                    .name("Sonali")
                    .email("sonali@gmail")
                    .id(2l)
                    .dob(LocalDate.of(1995, 1, 1))
                    .build();

            studentRepository.saveAll(List.of(nirmal,sonali));

        };
    }


}
