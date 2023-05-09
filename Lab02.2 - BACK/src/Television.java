/*
 *Business class (system class) to model the workings of a television
 */
class Television {
    // class-level, shared (static) variables - one copy of each, NOT stored in each object
    public static final int MIN_VOLUME = 0;
    public static final int MAX_VOLUME = 100;

    public static int instanceCount = 0;

    public static int getInstanceCount() {
        return instanceCount;
    }


    // instance variables or fields (properties or attributes)
    private String brand = "Toshiba"; // default value when the client doesn't say; defaults to null when undefined
    private int volume = 1;          // default value when the client doesn't say;  defaults to 0 without set value

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


    // business methods or operations
   public void turnOn() {
       boolean isConnected = verifyInternetConnection();
       System.out.println("Turning on your " + getBrand() + " TV to volume " + getVolume());

   }
   public void turnOff(){
        System.out.println("Shutting down...goodbye");
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if (brand.equals("Samsung") || brand.equals("LG") || brand.equals("Sony") || brand.equals("Toshiba")){
            this.brand = brand;
        }
        else {
            System.out.println("Invalid brand:  " + brand + ".  Acceptable brands are:  Samsung, LG, Sony, or Toshiba.");
        }
        //switch practice.  This will (ALLEGEDLY) produce the same result

//        switch (brand) {
//            case "Samsung":
//                System.out.println("Brand is Samsung");
//                break;
//            case "LG":
//                System.out.println("Brand is LG");
//                break;
//            case "Sony":
//                System.out.println("Brand is Sony");
//                break;
//            case "Toshiba":
//                System.out.println("Brand is Toshiba");
//        }
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume >= MIN_VOLUME && volume <= MAX_VOLUME) {
            this.volume = volume;
        }
        else {
            System.out.println("Invalid Volume:  " + volume + ".  Must be between " + MIN_VOLUME + " and " + MAX_VOLUME + "." );
        }

    }



    private boolean verifyInternetConnection() {
       return true;
    }

    public String toString() {
        return "Television: brand = " + getBrand() + ", volume = " + getVolume();
    }
}