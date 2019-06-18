package com;

public class StringFormatting {
    public static void main(){
        /*
        Formatting using tab and new line
         */
        System.out.print("Here is some text.\tThat was a tab.\nThat was a newline.");
        System.out.println(" More text.");

        /*
        Formatting with integers
        %-10d  output an integer in a space ten characters wide,
        padding with space and left-aligning (%10d would right-align)
         */
        // One decimal place, left-aligned in 6-character field:
        System.out.printf("Total value: %-6.1fn", 343.23423);

        // You can also use the String.format() method if you want to retrieve
        // a formatted string.
        String formatted = String.format("This is a floating-point value: %.3f", 5.12345);
        System.out.println(formatted);

        // Use double %% for outputting a % sign.
        System.out.printf("Giving it %d%% is physically impossible.", 100);
    }
}
