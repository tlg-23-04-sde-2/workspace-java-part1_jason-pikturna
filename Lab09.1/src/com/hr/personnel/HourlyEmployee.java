package com.hr.personnel;

import gov.irs.TaxPayer;

import java.time.LocalDate;

public class HourlyEmployee extends Employee {
    // instance variables or fields
    private double rate;
    private double hours;


    // constructors
    public HourlyEmployee() {
    }

    public HourlyEmployee(String name, LocalDate hireDate) {
        super(name, hireDate);  // delegate to superclass for name, hireDate
    }

    public HourlyEmployee(String name, LocalDate hireDate, double rate, double hours) {
        this(name, hireDate);  // delegate to the ctor above me for name, hireDate
        setRate(rate);         // delegate to setters for any validation/conversion
        setHours(hours);
    }

    //business/"action" methods
    @Override
    public void pay() {
        System.out.println(getName() + " is paid hourly " + (getRate() * getHours()));
    }

    @Override
    public void payTaxes() {
        double taxes = getRate()*getHours()*TaxPayer.HOURLY_TAX_RATE;
        System.out.println(getName() + " paid taxes of:  " + taxes);
    }

    //accessor methods


    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    @Override
    public String toString() {
        return super.toString() + ", rate = " + getRate() + ", hours = " + getHours();
    }
}