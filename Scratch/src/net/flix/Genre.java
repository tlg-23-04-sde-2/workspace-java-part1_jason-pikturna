package net.flix;

enum Genre {
    ROMANCE("Romance"),
    SCI_FI("Sci-Fi"),
    COMEDY("Comedy"),
    HORROR("Horror"),
    DOCUMENTARY("Documentary"),
    ACTION("Action"),
    THRILLER("Thriller"),
    DRAMA("Drama");

    // everything below here is regular class definition stuff
    // i.e. fields, constructors, methods. etc....

    private final String display;

    // constructor - implicitly private; only called from inside (8 times above)
    Genre(String display) {
//        System.out.println("net.flix.Genre ctor called");
        this.display = display;
    }

    // accessor methods - here, we provide "read-only" access to the display property

    public String display() {   //this is actually a getter, just without "get"
        return display;
    }
    public String toString(){
        return display();       //generally better to call your own getter
    }

}