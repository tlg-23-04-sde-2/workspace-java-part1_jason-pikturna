package com.climbing;

/*
 * This model describes properties of a rock climbing problem
 */

/**
 * JR: Good job overall.
 * Demonstrates good understanding of program concepts, with a few improvements needed,
 * and more attention to detail.
 *
 * See comments below and in the other classes.
 *
 * Code is clean, readable, well-formatted.
 *
 * Class participation has been good, keep it up.
 *
 * Class names, package names, and overall structure are correct.
 */

public class RockClimbingProblem {

    public static final int MIN_RATING = (1);   // JR: unnecessary ()
    public static final int MAX_RATING = (15);
    // MIN/MAX rating refer to the suffix of the YDS rating system.
    // rating = 6, YDS = 5.6; rating = 12, YDS = 5.12

    private boolean requiresRope = false;
    private boolean outside = false;

    private int rating = 0;  // JR: default value is invalid (not in range [1-15])
    private double length = 10.5;
    private SportType type = SportType.BOULDERING;


    //Constructors

    /*
     * JR: a 4-arg and/or 5-arg ctor would be useful, so client can set the
     * 'requiresRope' and 'outside' properties upon instantiation.
     */

    public RockClimbingProblem() {

    }

    public RockClimbingProblem(int rating) {
        setRating(rating);
    }

    public RockClimbingProblem(int rating, double length) {
        this(rating);
        setLength(length);
    }

    public RockClimbingProblem(int rating, double length, SportType type) {
        this(rating, length);
        setType(type);
    }

    // Beta in this case is slang in the climbing world
    // It's related to the dimensions/difficulty/"how to" of a given climbing "problem"

    /*
     * JR: I have several climbing friends, and I've watched them climb numerous times,
     * but have never roped up myself.  I like that the default 'type' is SportType.BOULDERING,
     * because I'm very good at that!  Joshua Tree, Utah, Yosemite, the works.
     * I totally know about "beta," and I have never met a climber that wasn't cool.
     *
     * In the methods below, better to call your own getters vs. direct field access.
     * And perhaps one or two additional business or "action" methods, e.g.,
     *  fall()
     *  bivvy()
     *  chalkUp()
     */
    public void findBeta() {
        System.out.println("This route has a rating of: 5." + rating + ", with a total length of: " + length + "ft.");
    }

    public void climb() {
        System.out.println("You will need to plan for the weather: " + outside);
        System.out.println("You will need a rope/harness: " + requiresRope);
    }

    public int getRating() {
        return rating;
    }

    /*
     * JR: error message text indicates the "5.x" notation, but the client caller is
     * only meant to supply the 'x' part, and int in the range [1,15].
     *
     * For example, if client caller calls setRating(16), it sees this:
     *  Invalid rating: 5.16.  Must be between: 5.1 and 5.15.
     * The developer of the client-side code might then think that a double should be passed,
     * which is impossible, because this method takes an int.
     *
     * One solution would be to only say the "5.x" in findBeta() and toString(), and
     * in all other places the rating is treated as just an int, like here.
     */
    public void setRating(int rating) {
        if (rating >= MIN_RATING && rating <= MAX_RATING) {
            this.rating = rating;
        } else {
            System.out.println("Invalid rating: 5." + rating + ".  Must be between: 5." + MIN_RATING + " and 5." + MAX_RATING + ".");
        }
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    /*
     * JR: watch out for goofy naming on generated accessor methods for booleans.
     *  isRequiresRope()  ->  requiresRope()
     *  setRequiresRope() is probably okay.
     */
    public boolean isRequiresRope() {
        return requiresRope;
    }

    public void setRequiresRope(boolean requiresRope) {
        this.requiresRope = requiresRope;
    }

    public boolean isOutside() {
        return outside;
    }

    public void setOutside(boolean outside) {
        this.outside = outside;
    }

    public SportType getType() {
        return type;
    }

    public void setType(SportType type) {
        this.type = type;
    }

    // JR: include all 5 field values - 'requiresRope' and 'outside' are missing
    public String toString() {
        return "Problem Rating = 5." + getRating() + ", Length = " + getLength() + ", Sport Type = " + getType();
    }

}


// JR: delete these extraneous blank lines, nothing ever goes down here