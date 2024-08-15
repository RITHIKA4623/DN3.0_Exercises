package com.example.employeemanagement.model;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.BatchSize;
import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "departments")
@Getter
@Setter
@BatchSize(size = 10)
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(mappedBy = "department")
    private Set<Employee> employees;
}
