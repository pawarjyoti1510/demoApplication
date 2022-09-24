package com.example.demo.entity;
import com.example.demo.util.CommonUtils;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "employee")

public class Employee extends BaseEntity{

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
