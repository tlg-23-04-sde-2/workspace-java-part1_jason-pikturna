package com.entertainment.client;

import com.entertainment.Television;

class TelevisionValidationTest {

    public static void main(String[] args) {
       Television tv1 = new Television();

    tv1.setVolume(1);
    System.out.println("Volume:  " + tv1.getVolume());

    tv1.setVolume(-20);
    System.out.println("Volume:  " + tv1.getVolume());

    tv1.setVolume(200);
    System.out.println("Volume:  " + tv1.getVolume());

    tv1.setBrand("Toshiba");
        System.out.println("Brand:  " + tv1.getBrand());

    tv1.setBrand("Visio");
        System.out.println("Brand:  " + tv1.getBrand());

    }
}