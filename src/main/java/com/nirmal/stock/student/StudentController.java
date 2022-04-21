package com.nirmal.stock.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/user")
public class StudentController {

  private final StudentService userService;

  public StudentController(StudentService userService) {
    this.userService = userService;
  }

  @GetMapping
  public List<Student> getUsers() {
    return userService.getUsers();
  }
}
