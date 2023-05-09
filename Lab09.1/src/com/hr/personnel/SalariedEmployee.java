package com.hr.personnel;

import gov.irs.TaxPayer;

import java.time.LocalDate;

public class SalariedEmployee extends Employee {
    // instance variables or fields
    private double salary;

    //constructors

    public SalariedEmployee() {
    }

    public SalariedEmployee(String name, LocalDate hireDate) {
        super(name, hireDate);  // delegate to superclass for name, hireDate
        // enrollIn401k();
    }
    public SalariedEmployee(String name, LocalDate hireDate,double salary) {
        this(name, hireDate);  // delegate to neighboring ctor above me for name, hireDate
        setSalary(salary);      // delegate to setter for any validation/conversion
    }

    //business/"action" methods.  Perform business tasks.
    @Override
    public void pay() {
        System.out.println(getName() + " is paid salary:  " + getSalary());
    }

    public void takeVacation() {
        System.out.println(getName() + " is on vacation");
    }

    @Override
    public void payTaxes() {
        double taxes = getSalary() * TaxPayer.SALARIED_TAX_RATE;
        System.out.println(getName() + " paid taxes of:  " + taxes);
    }

    // accessor methods
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() + ", salary = " + getSalary();
    }
}