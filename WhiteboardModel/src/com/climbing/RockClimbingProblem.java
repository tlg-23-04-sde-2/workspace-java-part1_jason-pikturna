package com.climbing;

/*
 * This model describes properties of a rock climbing problem
 */

public class RockClimbingProblem {

    public static final int MIN_RATING = (1);
    public static final int MAX_RATING = (15);
    // MIN/MAX rating refer to the suffix of the YDS rating system.
    // rating = 6, YDS = 5.6; rating = 12, YDS = 5.12

    private boolean requiresRope = false;
    private boolean outside = false;

    private int rating = 0;
    private double length = 10.5;
    private SportType type = SportType.BOULDERING;


    //Constructors

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

    public String toString() {
        return "Problem Rating = 5." + getRating() + ", Length = " + getLength() + ", Sport Type = " + getType();
    }

}


