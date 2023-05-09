package dont.wakeme;

/*
 * Test-class to verify correct behaviour of our setter validation
 * BVT = Boundary Value Testing
 * for a [1,20] range, you need to check:
 * 0,1 and 20,21
 */
class AlarmCockValidationTest {

    public static void main(String[] args) {
        AlarmClock clock = new AlarmClock();

        clock.setSnoozeInterval(1);  // should "stick" -> "clock" has this value
        System.out.println("snoozeInterval:  " + clock.getSnoozeInterval());

        clock.setSnoozeInterval(20);  // should stick
        System.out.println("snoozeInterval:  " + clock.getSnoozeInterval());

        clock.setSnoozeInterval(0);  //error message, value not set, should still be 20
        System.out.println("snoozeInterval:  " + clock.getSnoozeInterval());

        clock.setSnoozeInterval(21);
        System.out.println("snoozeInterval:  " + clock.getSnoozeInterval());




    }
}