package com.nirmal.stock.student;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.time.LocalDate;
import java.time.Period;

@Data
@Entity
@Table
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Student {
  @Id
  @SequenceGenerator(
      name = "student_sequence",
      sequenceName = "student_sequence",
      allocationSize = 1)
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "student_sequence")
  private Long id;

  private String name;
  private String email;
  private LocalDate dob;
  public Integer getAge() {
    return Period.between(this.dob, LocalDate.now()).getYears();
  }

  @Transient
  private Integer age;
}
