// Write a data type Clock.java that represents time on a 24-hour clock,
// such as 00:00, 13:30, or 23:59. Time is measured in hours (00–23) and minutes (00–59).
// To do so, implement the following public API:

public class W9E2Clock {

    // instance variables
    private int hour;
    private int min;

    // Creates a clock whose initial time is h hours and m minutes.
    public W9E2Clock(int h, int m) {
        hour = h;
        min = m;
        checkClock(hour, min);
    }

    // Creates a clock whose initial time is specified as a string, using the format HH:MM.
    // BE CAREFULL :  e.g. "14:57" has 5 total index
    public W9E2Clock(String s) {
        hour = Integer.parseInt(s.substring(0, 2));
        min = Integer.parseInt(s.substring(3, 5)); // i have to consider ":"
        checkClock(hour, min);
    }

    // Throw an IllegalArgumentException if either integer argument is outside its prescribed bounds
    // (hours between 0 and 23, minutes between 0 and 59).
    private static void checkClock(int h, int m) {
        if ( h < 0 || h > 23) {
            throw new IllegalArgumentException("hour not valid");
        }
        if (m < 0 || m > 59) {
            throw new IllegalArgumentException("minutes not valid");
        }
    }

    // Returns a string representation of this clock, using the format HH:MM.
    public String toString() {
        return String.format("%02d:%02d", hour, min); // Padding with 0s
    }

    // TO-DO:
    // Is the time on this clock earlier than the time on that one?
    // public boolean isEarlierThan(Clock that) {

    // }

    // Adds 1 minute to the time on this clock.
    public void tic() {
        if (min < 59) {
            min++;
        } else {
            min = 0;
            if (hour < 23) {
                hour++;
            } else {
                hour = 0;
            }
        }
    }

    // Adds Δ minutes to the time on this clock.
    public void toc(int delta) {
        int deltaH = delta / 60;
        int deltaM = delta % 60;
        if (min < 60 - deltaM && hour < 24 - deltaH) {
            hour += deltaH;
            min += deltaM;
        } else if (min >= 60 - deltaM && hour < 24 - deltaH) {
            hour += deltaH + 1;
            min = deltaM - (60 - min);
        } else if (min < 60 - deltaM && hour >= 24 - deltaH) {
            hour = deltaH - (24 - hour);
            min += deltaM;
        } else {
            hour = deltaH + 1 - (24 - hour);
            min = deltaM - (60 - min);
        }
    }

    // Test client 
    public static void main(String[] args) {

        System.out.println("--- TEST 1 ---"); // simple tic() testing
        W9E2Clock x = new W9E2Clock(19, 49);
        System.out.println(x.toString());
        x.tic();
        System.out.println(x.toString());

        System.out.println("--- TEST 2 ---"); // tic() testing
        W9E2Clock k = new W9E2Clock(23, 59);
        System.out.println(k.toString());
        k.tic();
        System.out.println(k.toString());

        System.out.println("--- TEST 3 ---"); // toc() testing
        W9E2Clock y = new W9E2Clock("19:12");
        System.out.println(y.toString());
        y.toc(185);
        System.out.println(y.toString());

        System.out.println("--- TEST 4 ---"); // toc() testing
        W9E2Clock z = new W9E2Clock(22, 40);
        System.out.println(z.toString());
        z.toc(325);
        System.out.println(z.toString());

        System.out.println("--- TEST 5 ---"); // exception testing
        W9E2Clock w = new W9E2Clock(22, 70);
        System.out.println(w.toString());
    }
}
