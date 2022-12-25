package com.pixel.service;

import com.pixel.model.Employee;
import com.pixel.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DatabaseLoader implements CommandLineRunner {

    private final EmployeeRepository repository;

    @Override
    public void run(String... args) throws Exception {
        this.repository.save(new Employee().builder()
                .firstName("Frodo")
                .lastName("Baggins")
                .description("ring bearer")
                .build());
    }
}
