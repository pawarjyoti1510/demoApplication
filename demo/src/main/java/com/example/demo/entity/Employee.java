package com.example.demo.entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "employee")

public class Employee {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator")
    private UUID empId;

    @Column
    private String firstName;

   @Column
   private String lastName;

   @Column
    private String deptNo;

   @Column
   @Temporal(TemporalType.DATE)
    private Date joiningDate;

   @Column
    private String email;

}
