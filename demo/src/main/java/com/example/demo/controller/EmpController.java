package com.example.demo.controller;


import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("api/v1/employee")
public class EmpController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("save/employee")
    public ResponseEntity saveEmployee(@RequestBody Employee employee){
        return new ResponseEntity<>(employeeService.saveEmployee(employee), HttpStatus.OK);
    }
    @GetMapping("/list")
    public ResponseEntity getEmployeeList(){
        return new ResponseEntity(employeeService.findAllEmployee(),HttpStatus.OK);
    }

    @DeleteMapping("delete/emp")
    public ResponseEntity deleteEmployee(@RequestParam ("id") Integer id){
        employeeService.deleteEmployee(id);
       return new ResponseEntity(HttpStatus.OK);
    }





}
