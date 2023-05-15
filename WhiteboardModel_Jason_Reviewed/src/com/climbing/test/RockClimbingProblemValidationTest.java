package com.climbing.test;

import com.climbing.RockClimbingProblem;

/**
 * JR: for proper BVT (Boundary Value Testing) with a range of values [1-15], you need to test:
 *  0,1  and  15,16
 *  We test on the boundaries, and just outside them.
 */
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