package com.hr;

import com.transportation.Car;
import com.transportation.DestinationUnreachableException;

public class Employee {
    // INSTANCE VARIABLES
    private String name;

    // CONSTRUCTORS
    public Employee(String name) {
        this.name = name;
    }

    // BUSINESS METHODS

    /*
     * Option Four:  try/catch and throw a DIFFERENT type of exception
     * Instead of throwing the low-level "infrastructure" transportation exception
     * we'll throw a higher level, more suitable exception for our HR client.
     */

    public void goToWork() throws WorkException {
        Car c = new Car("JPP1234", "Toyota", "Tacoma");
        c.start();
        try {
            c.moveTo("West Seattle");
        }
        catch (DestinationUnreachableException e) {
            throw new WorkException("Unable to get to work!", e);   // e is the nested 'cause'
        }
        finally {
            c.stop();  // IMPORTANT that stop() is always called
        }
    }

    /*
     * Option Three:  try-catch and "react in some way," then throw it back to Client.
     * This is sometimes called a "catch-and-re-throw"
     */


    /*
    public void goToWork() throws DestinationUnreachableException {
        Car c = new Car("JPP1234", "Toyota", "Tacoma");
        c.start();
        try {
            c.moveTo("West Seattle");
        } catch (DestinationUnreachableException e) {
            System.out.println("Send email to Lisa Herbold to complain.");
            throw e;
        }
        finally {
            c.stop();  // IMPORTANT that stop() is always called
        }
    }
    */


    /*
     * Option Two: PUNT IT.  Send it up for someone else to handle with a throw
     * NOTE:  since we don't handle it, and it's CHECKED, we have to say "throws"
     * We use a try-finally, which allows us to "punt" and still ge the calle to c.stop() to always happen
     */

    /*
    public void goToWork() throws DestinationUnreachableException {
        Car c = new Car("JPP1234", "Toyota", "Tacoma");
        c.start();

        try {
            c.moveTo("West Seattle");
        }
        finally {
            c.stop();  // IMPORTANT that stop() is always called
         }
    }
    */


    /*
     * Option One:  try/catch.  Handle it HERE.
     */

//    public void goToWork() {
//        Car c = new Car("JPP1234", "Toyota", "Tacoma");
//        c.start();
//        try {
//            c.moveTo("West Seattle");
//        } catch (DestinationUnreachableException e) {
//            System.out.println(e);            // toString() automatically called
////            System.out.println(e.getMessage()); // just the reason String inside that expression
//        }
//        finally {
//            c.stop();  // IMPORTANT that stop() is always called
//        }
//    }

    // ACCESSOR METHODS
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ": name=" + getName();
    }
}