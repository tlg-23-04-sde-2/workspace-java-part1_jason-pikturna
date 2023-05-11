package com.transportation;

class BoatClient {
    public static void main(String[] args) {
        Boat boat = new Boat ("Chlamydia's Revenge");   // Boat IS-A Vehicle
        boat.moveTo("West Seattle");
    }
}