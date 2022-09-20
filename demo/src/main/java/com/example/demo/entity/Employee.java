package com.example.demo.entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "employee")

public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String empId;

    @Column
    private String firstName;

   @Column
   private String lastName;

   @Column
    private String deptNo;

   @Column
    private Date joiningDate;

   @Column
    private String email;

}
