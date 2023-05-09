package com.climbing.client;

import com.climbing.RockClimbingProblem;
import com.climbing.SportType;

import java.util.Arrays;

class RockClimbingProblemClientArgs {
    public static void main(String[] args) {
        if (args.length < 3) {
            String usage = "Usage:  java com.climbing.client.RockClimbingClientArgs <rating> <length> <sport type>";
            String example = "Example:  java com.climbing.client.RockClimbingClientArgs 1 15 TRAD";
            String note = "Note:  Supported Sport Types are:  " + Arrays.toString(SportType.values());
            System.out.println(usage);
            System.out.println(example);
            System.out.println(note);
            return;
        }
        int rating = Integer.parseInt(args[0]);
        int length = Integer.parseInt(args[1]);
        SportType sport = SportType.valueOf(args[2]);

        RockClimbingProblem route1 = new RockClimbingProblem(rating, length, sport);
        System.out.println("Thank you for your interest in this problem:");
        System.out.println(route1);


    }
}