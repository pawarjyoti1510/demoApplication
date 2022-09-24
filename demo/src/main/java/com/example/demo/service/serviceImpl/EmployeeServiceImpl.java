package com.example.demo.service.serviceImpl;

import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepository;
import com.example.demo.service.EmployeeService;
import com.example.demo.util.CommonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;
    @Override
    public Employee saveEmployee(Employee emp) {
        Employee employee = new Employee();
       // employee.setEmpId(CommonUtils.generateUUID());
        employee.setFirstName(emp.getFirstName());
        employee.setLastName(emp.getLastName());
        employee.setJoiningDate(emp.getJoiningDate());
        employee.setEmail(emp.getEmail());
        employee.setDeptNo(emp.getDeptNo());
        employeeRepository.save(employee);
        return employee;
    }

    @Override
    public List findAllEmployee() {
        List<Employee> employeeList = employeeRepository.findAll();
        return employeeList;
    }

    @Override
    public void deleteEmployee(String id){
        Employee employee = employeeRepository.findById(id).get();
        employeeRepository.delete(employee);
    }
}
