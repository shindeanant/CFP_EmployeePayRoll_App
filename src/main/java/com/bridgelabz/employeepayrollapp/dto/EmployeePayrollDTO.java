package com.bridgelabz.employeepayrollapp.dto;

import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeePayrollDTO {
    @Pattern(regexp = "^[A-Z][a-zA-z]{2,}$", message = "Employee Name Invalid")
    public String name;
    @Min(value = 10000, message = "Min Wage should be more than 10000")    
    public long salary;

   

  
}
