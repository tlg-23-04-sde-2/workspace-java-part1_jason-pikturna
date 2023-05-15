package com.climbing.client;

import com.climbing.RockClimbingProblem;
import com.climbing.SportType;

import java.util.Arrays;

/**
 * JR: works as expected, with a few minor improvements needed.
 *  Generalized usage text and example usage are good.
 *
 *  Good that 'note' does not hardcode the options, but upper-casing this input string
 *  would make it easier for the (human) user that's running the application, e.g.,
 *      SportType.valueOf(args[2].toUpperCase())
 *
 *  Usage banner does not indicate valid range for the 'rating' input, i.e., [1,15].
 *  You can obtain that from here via RockClimbingProblem.MIN/MAX_RATING.
 *
 *  The 'length' input (args[1]) is erroneously converted to int instead of double,
 *  since the 'length' field in RockClimbingProblem is a double.
 *  While the example usage works, with values "1 15 TRAD", since length is
 *  a double in the created RockClimbingProblem object, end user should probably be
 *  able to specify a decimal value for length, such as 15.5.
 *  However, doing so results in application exception and termination, e.g.,
 *      java com.climbing.client.RockClimbingProblemClientArgs 1 15.5 TRAD
 */
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

        // JR: delete these extraneous blank lines
    }
}