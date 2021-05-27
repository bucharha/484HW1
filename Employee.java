/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HW1;

/**
 *
 * @author Hunter Buchardt
 */
public class Employee {

    private int employeeID;
    private String employeePhone;
    private String employeeAddress;
    private double employeeSalary;
    private String employeeType;
    private String employeeEmail;
    
    
    public Employee(int employeeID, String employeePhone, String employeeAddress, String employeeEmail, double employeeSalary, String employeeType) {
        this.employeeID = employeeID;
        this.employeePhone = employeePhone;
        this.employeeAddress = employeeAddress;
        this.employeeEmail = employeeEmail;
        this.employeeSalary = employeeSalary;
        this.employeeType = employeeType;
    }
    
    
    
    
    public void setEmployeePhone(String employeePhone){
        this.employeePhone = employeePhone;
    }

    public void setEmployeeAddress(String employeeAddress){
        this.employeeAddress = employeeAddress;
    }
    
    public void setEmployeeSalary(double employeeSalary){
        this.employeeSalary = employeeSalary;
    }

    public void setEmployeeType(String employeeType){
        this.employeeType = employeeType;
    }

    public void setEmployeeEmail(String employeeEmail){
        this.employeeEmail = employeeEmail;
    }
    
    public int getEmployeeID(){
       return employeeID;
    }

    public String getEmployeePhone(){
       return employeePhone;
    }

    public String getEmployeeAddress(){
       return employeeAddress;
    }

    public double getEmployeeSalary(){
       return employeeSalary;
    }
    
    

}
