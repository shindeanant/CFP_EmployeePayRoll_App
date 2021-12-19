package com.bridgelabz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.bridgelabz.employeepayrollapp.model.EmployeePayrollData;

@Repository
public interface EmployeeRepository  extends JpaRepository <EmployeePayrollData, Integer > {
}

