package com.climbing.client;

import com.climbing.RockClimbingProblem;
import com.climbing.SportType;

/*
 *The client to RockClimbingProblem
 */

/**
 * JR: good basic test-drive of a few valid instances.
 */
class RockClimbingProblemClient {

    public static void main(String[] args) {
        RockClimbingProblem r1 = new RockClimbingProblem();
        r1.setRating(4);
        r1.setLength(35);
        r1.setType(SportType.TOP_ROPE);
        r1.setOutside(false);
        r1.setRequiresRope(true);
        r1.findBeta();
        r1.climb();
        System.out.println(r1);
        System.out.println();


        RockClimbingProblem r2 = new RockClimbingProblem(9, 45, SportType.TRAD);
        r2.setOutside(true);
        r2.setRequiresRope(true);
        r2.findBeta();
        r2.climb();
        System.out.println(r2.toString());

        System.out.println();

        RockClimbingProblem r3 = new RockClimbingProblem();
        r3.findBeta();
        r3.climb();
        System.out.println(r3);

    }
}
