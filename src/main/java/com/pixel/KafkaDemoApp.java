package com.pixel;

import com.pixel.model.Student;
import com.pixel.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import java.util.Arrays;

@SpringBootApplication
public class KafkaDemoApp {

	@Autowired
	private StudentRepository studentRepository;

	public static void main(String[] args) {
		SpringApplication.run(KafkaDemoApp.class, args);
	}
	@EventListener(ApplicationReadyEvent.class)
	public void go() {
		Student student1 = new Student("Adam",2,3.6, "male", Arrays.asList("swimming", "basketball","volleyball"));
		studentRepository.save(student1);
	}

}
