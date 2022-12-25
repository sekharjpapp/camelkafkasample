package com.pixel.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Builder
public class Employee {

     @Id
    @GeneratedValue
     private Long id;
    private String firstName;
    private String lastName;
    private String description;
}
