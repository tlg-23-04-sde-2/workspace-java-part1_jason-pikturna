package com.panion;

import java.time.LocalDate;

class PersonClient {
    public static void main(String[] args) {
        Person p1 = new Person("Jason", LocalDate.of(1993, 3,3));
        System.out.println(p1);
        //TODO: print "<name> is <age> years old"
        System.out.printf("%s is %s years old\n", p1.getName(), p1.getAge());
    }

}