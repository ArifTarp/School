package com.school.School.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(IStudentRepository studentRepository) {
        return args -> {
            Student student_1 = new Student(
                    "example name",
                    "example@gmail.com",
                    LocalDate.of(2000, Month.JANUARY, 5)
            );

            Student student_2 = new Student(
                    "example 2 name",
                    "example2@gmail.com",
                    LocalDate.of(1998, Month.NOVEMBER, 25)
            );

            studentRepository.saveAll(
                    List.of(student_1, student_2)
            );
        };
    }
}
