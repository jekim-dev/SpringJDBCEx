package com.telusko.SpringJDBCEx.Repo;

import com.telusko.SpringJDBCEx.model.Student;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class StudentRepositoryTest {
    @Autowired
    private StudentRepository repository;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Test
    void findAll() {
        List<Student> students = repository.findAll();

        assertThat(students).extracting(Student::getName).contains("Kiran");

    }


    @Test
    void save() {

    }
}