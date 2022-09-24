package com.example.demo.entity;


import com.example.demo.util.CommonUtils;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.util.Date;

@AllArgsConstructor
@Getter
@Setter
@MappedSuperclass

public class BaseEntity {

    @Id
    @Column
    public String id;

    public BaseEntity(){
        createdBy="jyoti pawar";
        updatedBy = "jyoti pawar";
    }

    @Column
    @CreatedBy
    public String createdBy;

    @Column
    @LastModifiedBy
    public String updatedBy;

    @Column
    @CreatedDate
    public Date createdOn;

    @Column
    @LastModifiedDate
    public Date updatedOn;

    @PrePersist
    public void onCreate(){
        createdOn = new Date();
        Logger logger = LoggerFactory.getLogger(Employee.class);
        id = CommonUtils.generateUUID();
    }

    @PreUpdate
    public void onUpdate(){
        updatedOn = new Date();
    }


}
