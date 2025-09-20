package com.sairohit.assignment.employee;

public class manager extends employee {
    private String department;

    public manager(String name, int employeeId, double salary, String department) {
        super(name, employeeId, salary);
        this.department = department;
    }

    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }

    
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Department: " + department);
    }
}
