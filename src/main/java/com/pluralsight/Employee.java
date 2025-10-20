package com.pluralsight;

public class Employee {
    private int employeeID;
    private String name;
    private String department;
    private double payRate;
    private int hoursWorked;

    public Employee(int employeeID, String name, String department, double payRate, int hoursWorked) {
        this.employeeID = employeeID;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getPayRate() {
        return payRate;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }


    public int getRegularHours() {
        if (hoursWorked > 40){
            return 40;
        } else {
            return hoursWorked;
        }
    }

    public int getOvertimeHours() {
        if (hoursWorked > 40){
            return hoursWorked - 40;
        } else {
            return 0;
        }
    }

    public Double getTotalPay() {
        return (getRegularHours() * payRate) + ((payRate * 1.5) * getOvertimeHours());
    }
}
