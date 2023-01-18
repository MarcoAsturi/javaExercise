// Write a program to produce animated bar charts

import java.util.Arrays;

// Bar data type.

// A bar aggregates related information (name, value, and category) for use in a bar chart.
// For example, the first bar drawn in the bar chart represents
// name = Beijing, value = 672, and category = East Asia.
// In addition to methods for accessing the individual fields,
// you will need to sort bars in order of value. Implement the following API:

public class Bar implements Comparable<Bar> {

    // instance variables
    public String name;
    public int value;
    public String category;

    // Creates a new bar.
    public Bar(String name, int value, String category) {
        this.name = name;
        this.value = value;
        this.category = category;
    }

    // Returns the name of this bar.
    public String getName() {
        return name;
    }

    // Returns the value of this bar.
    public int getValue() {
        return value;
    }

    // Returns the category of this bar.
    public String getCategory() {
        return category;
    }

    // OPTIONAL
    // just to see values

    // public String toString() {
    //     return String.format("%d", value);
    // }

       
    
    // Compare two bars by value.
    // Return a { negative integer, zero, positive integer } if value of the invoking object
    // is { less than, equal to, greater than } the value of the argument object.
    public int compareTo(Bar that) {
        if (this.value < that.getValue()) {
            return -1;
        } else if (this.value == that.getValue()) {
            return 0;
        } else {
            return 1;
        }
    }

    // DONE WITH SOURCE ACTION
    @Override
    public String toString() {
        return "Bar [name=" + name + ", value=" + value + ", category=" + category + "]";
    }

    // Sample client (see below).
    public static void main(String[] args) {
        // create an array of 10 bars
        Bar[] bars = new Bar[10];
        bars[0] = new Bar("Beijing", 22674, "East Asia");
        bars[1] = new Bar("Cairo", 19850, "Middle East");
        bars[2] = new Bar("Delhi", 27890, "South Asia");
        bars[3] = new Bar("Dhaka", 19633, "South Asia");
        bars[4] = new Bar("Mexico City", 21520, "Latin America");
        bars[5] = new Bar("Mumbai", 22120, "South Asia");
        bars[6] = new Bar("Osaka", 20409, "East Asia");
        bars[7] = new Bar("São Paulo", 21698, "Latin America");
        bars[8] = new Bar("Shanghai", 25779, "East Asia");
        bars[9] = new Bar("Tokyo", 38194, "East Asia");

        // sort in ascending order by weight
        Arrays.sort(bars);
        
        System.out.println(Arrays.toString(bars));
    }
}
