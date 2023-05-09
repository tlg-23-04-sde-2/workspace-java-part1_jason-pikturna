package com.entertainment;

import java.util.Arrays;

/*
 *Business class (system class) to model the workings of a television
 */
public class Television {
    // class-level, shared (static) variables - one copy of each, NOT stored in each object
    public static final int MIN_VOLUME = 0;
    public static final int MAX_VOLUME = 100;
    public static final String[] VALID_BRANDS = { "Samsung", "LG", "Sony", "Toshiba" };

    public static int instanceCount = 0;

    public static int getInstanceCount() {
        return instanceCount;
    }

    private static boolean isValidBrand(String brand) {
        boolean valid = false;
        for(String validBrand : VALID_BRANDS) {
            if(validBrand.equals(brand)){
                valid = true;
                break;
            }
        }
        return valid;
    }




    // instance variables or fields (properties or attributes)
    private String brand = "Toshiba"; // default value when the client doesn't say; defaults to null when undefined
    private int volume;// default value when the client doesn't say;  defaults to 0 without set value
    private DisplayType display = DisplayType.LED;  // otherwise, null if client doesn't say
    private boolean isMuted;    // for muting behaviour
    private int oldVolume;      // for muting behaviour, internal use only, NO get/set methods

    // Television HAS-A Tuner

    private Tuner tuner = new Tuner();  // instantiated internally, not exposed (via get/set)


    //constructors

    public Television(){
        boolean isConncected = verifyInternetConnection();
        instanceCount++;
    }

    public Television(String brand) {
        this();                 // delegate to no-arg ctor for the increment
        setBrand(brand);        // delegate to its setter for any validation/conversion
    }

    public Television(String brand, int volume) {
        this(brand);            // delegate to ctor above me for brand
        setVolume(volume);      // handle volume myself, by delegating to its setter
    }

    public Television(String brand, int volume, DisplayType display) {
        this(brand, volume);
        setDisplay(display);
    }


    // business methods or operations

    public void changeChannel(String channel){
        tuner.setChannel(channel);  //delegate to Tuner for the actual work
    }

    public String getCurrentChannel() {
        return tuner.getChannel();  //delegate to Tuner to get the current channel
    }


    public void turnOn() {
       boolean isConnected = verifyInternetConnection();
       System.out.println("Turning on your " + getBrand() + " TV to volume " + getVolume());

   }
   public void turnOff(){
        System.out.println("Shutting down...goodbye");
    }


    //mute is a boolean getter in this case
    public void mute() {
        if (!isMuted()) {           //the ! says NOT; as in NOT MUTED
            oldVolume = getVolume();
            volume = 0;
            isMuted = true;
        }
        else {
            setVolume(oldVolume);
            isMuted = false;
        }
    }
    //mute and unmute functions
    /*
     * will need two functions mute and unmute
     * These will need access to volume
     * Need a new variable to store the volume to revert to "currentVolume"
     *
     * Mute will set volume to 0
     * unmute will set volume to previous volume
     */



    //Accessor Methods

    public String getBrand() {
        return brand;
    }


    /* VALID_BRANDS looks like this:  ["Samsung", "LG", "Sony", "Toshiba"]
     *
     * for (String validBrand : VALID_BRANDS) {
     *      // check the incoming brand against validBrand using the equals() method
     * }
     *      // if/when you find a match, you can terminate the loop early
     *      // for example, if 'brand' comes in as "Sony"
     */

    public void setBrand(String brand) {
        if (isValidBrand(brand)) {

            this.brand = brand;
        }
        else {
            System.out.printf("Invalid brand: %s.  Valid brands are %s.\n",
                    brand, Arrays.toString(VALID_BRANDS));

//            System.out.println("Invalid brand:  " + brand +
//                    ".  Acceptable brands are:  " + Arrays.toString(VALID_BRANDS));
        }
    }

    //switch practice.  This will (ALLEGEDLY) produce the same result as the above if/else for setBrand
    //cases can be listed vertically, but MUST have a "break;" article between

//    public void setBrand (String brand) {
//        switch (brand) {
//            case "Samsung": case "LG": case "Sony": case "Toshiba":
//                this.brand = brand;
//                break;
//            default:
//                System.out.println("Invalid brand:  " + brand + "." +
//                        "Valid brands are:  Samsung, LG, Sony, Toshiba.");
//        }
//    }


    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume >= MIN_VOLUME && volume <= MAX_VOLUME) {
            this.volume = volume;
            // clear the "isMuted" flag
            isMuted = false;
        }
        else {
            System.out.printf("Invalid Volume: %s.  Valid Range is %s to %s.\n",
                    volume, MIN_VOLUME, MAX_VOLUME);

            /*
            System.out.println("Invalid Volume:  " + volume +
                    ".  Must be between " + MIN_VOLUME + " and " + MAX_VOLUME + "." );
            */
        }


    }



    public DisplayType getDisplay() {
        return display;
    }

    public void setDisplay(DisplayType display) {
        this.display = display;
    }



    public boolean isMuted() {
        return isMuted;
    }

    private boolean verifyInternetConnection() {
       return true;     // fake implementation
    }

    public String toString() {
        String volumeString = isMuted() ? "<muted>" : String.valueOf(getVolume());

        return String.format("Television: brand = %s, volume = %s, display = %s, currentChannel = %s",
                getBrand(), volumeString, getDisplay(), getCurrentChannel());


        /*
        return "com.entertainment.Television: brand = " + getBrand() +
                ", display = " + getDisplay() +  ", volume = " + volumeString;
         */
    }
}