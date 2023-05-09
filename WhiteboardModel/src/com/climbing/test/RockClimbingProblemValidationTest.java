package com.climbing.test;

import com.climbing.RockClimbingProblem;

class RockClimbingProblemValidationTest {
    public static void main(String[] args) {
        RockClimbingProblem problemTest = new RockClimbingProblem();

        problemTest.setRating(1);  //should be valid, considering it falls in the range of (5.) 0-15
        System.out.println("Rating:  " + problemTest.getRating());

        problemTest.setRating(16); // Invalid; > MAX
        System.out.println("Rating:  " + problemTest.getRating());

        problemTest.setRating(-5); // Invalid; < MIN
        System.out.println("Rating:  " + problemTest.getRating());
    }
}