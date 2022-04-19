package com.nirmal.stock.user;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {

    public List<Student> getUsers(){
        return List.of(
                Student.builder()
                        .name("Nirmal")
                        .email("abc@gmail")
                        .id(1l)
                        .dob(LocalDate.of(1995, 1, 1))
                        .build());
    }
}
