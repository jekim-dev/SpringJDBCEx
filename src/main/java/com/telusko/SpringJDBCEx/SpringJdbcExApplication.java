package com.telusko.SpringJDBCEx;

import com.telusko.SpringJDBCEx.model.Student;
import com.telusko.SpringJDBCEx.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class SpringJdbcExApplication {

	public static void main(String[] args) {

	ApplicationContext context = SpringApplication.run(SpringJdbcExApplication.class, args);

	Student s =  context.getBean(Student.class);

	StudentService service = context.getBean(StudentService.class);



	List<Student> students = service.getStudents();
		System.out.println(students);
		String hg = "지누야 안녕하누 ?";
		String hgzz = " 지누님 다시요 뭘언해 오ㅑㅐ안올라가 ";
		
	}

}
