package com.entertainment.client;

import com.entertainment.DisplayType;
import com.entertainment.Television;

/*
 * Client-side main-class to create a few instances of com.entertainment.Television and give them a basic test-drive.
 *
 */
class TelevisionClient {

 public static void main(String[] args) {
  System.out.println(Television.getInstanceCount() + " instances");
  System.out.println();

  Television tv1 = new Television();
  tv1.setBrand("Samsung");
  tv1.setVolume(Television.MAX_VOLUME);
  tv1.setDisplay(DisplayType.PLASMA);
  tv1.turnOn();

  Television tv2 = new Television("Sony", Television.MIN_VOLUME);
  tv2.turnOn();

  Television tv3 = new Television("LG");
  tv3.turnOn();

  //sets a blank line between turning them all on and off
  System.out.println();


  tv1.turnOff();
  tv2.turnOff();
  tv3.turnOff();

  System.out.println();

  System.out.println(tv1.toString());
  System.out.println(tv2.toString());
  System.out.println(tv3);  // toString automatically called

  System.out.println();

  System.out.println(Television.getInstanceCount() + " instances");

 }
}