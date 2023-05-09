package dont.wakeme;

/*
 *Class definition to model the workings of an alarm clock.
 * This is called a "business class" or "system class."
 * This class definition does NOT have a main() method -  most classes don't.
 */
class AlarmClock {

    //class-level (shared) variables that live "above" the instances
    //When the "final" article is added, the values WILL NOT CHANGE
    //public static final naming convention is ALL CAPS and underlined
    public static final int MIN_INTERVAL = 1;  // statics are stored once and are class-wide
    public static final int MAX_INTERVAL = 20; // Static = SHARED (ONE COPY OF EACH THAT'S SHARED)


    // properties or attributes - called "instance variables" or "fields" in Java.
    // default value is 5 (instead of 0) when client doesn't specify a value.
    //private means only accessible within the object
    private int snoozeInterval = 5;
    private int repeat = 1;         // default value when client doesn't specify


    //constructors
    public AlarmClock(){
        // no operations
    }

    public AlarmClock(int snoozeInterval) {
        setSnoozeInterval(snoozeInterval);  // delegate to setter for any validation/conversion
    }

    public AlarmClock(int snoozeInterval, int repeat) {
        this(snoozeInterval);               // delegate to constructor above me for snoozeInterval
        setRepeat(repeat);                  // handle repeat myself by delegating to its setter
    }




    // business methods - perform "business tasks' or operations
   public void snooze() {
        System.out.println("Snoozing " + getSnoozeInterval() + " minutes");
    }



    //accessor methods (get/set methods) - provide "controlled access" to the object's fields
    public int getSnoozeInterval() {
        return snoozeInterval;
    }

    public void setSnoozeInterval(int snoozeInterval) {
        if (snoozeInterval >= MIN_INTERVAL && snoozeInterval<= MAX_INTERVAL) {  // valid
            this.snoozeInterval = snoozeInterval;
        }
        else {
            System.out.println("Invalid snoozeInterval: " + snoozeInterval +
            ".  Must be between " + MIN_INTERVAL + " and " + MAX_INTERVAL + ".");

        }
    }

    public int getRepeat() {
        return repeat;
    }

    public void setRepeat(int repeat) {
        this.repeat = repeat;
    }



    public String toString() {
        return "dont.wakeme.AlarmClock:  snoozeInterval=" + getSnoozeInterval() + ", repeat= " + getRepeat();  //call your own getter
    }
}