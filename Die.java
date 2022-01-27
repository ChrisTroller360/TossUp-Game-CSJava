/*
Christian Vanzant
CS 321
September 26, 2021
*/

package tossupTester;

import java.util.Random;

/**
   A rollable, 6-sided die object that has 3 colors along with methods
   to return its current color
*/

public class Die {
    
    /**
    Constructs a die object with default color red
     */
    public Die(){
        dieColor = DieColor.RED;
    }
    /**
     Simulates a roll of a d6 die
     * @return color of side rolled
     */
    public DieColor Roll()
    {
        dieColor = dieSide[random.nextInt(6)]; // Returns number 0-5 
                                                     // to represent die side
        return dieColor;
    }
            
    
    /**
     Get a die's current color
     * 
     @return the die's current color via enum (not string type)
     */
    public DieColor getColor()
    {
        return dieColor;
    }
    
    /**
     Get and return a string representation of a die's current color.
     * 
     @return a string representation of the die's color
     */
    @Override
    public String toString()
    {
        return dieColor.toString();
    }
   
    // List containing the colors of each side of the die
    private final DieColor[] dieSide = {DieColor.RED, DieColor.YELLOW, DieColor.YELLOW,
        DieColor.GREEN, DieColor.GREEN, DieColor.GREEN};
    
    // Track die color
    private DieColor dieColor;
    
    // Keeps track of the die's color using enum
    public static enum DieColor {
        RED, YELLOW, GREEN};
    
    // Random Number Generator
    private static final Random random = new Random(); // Instance of random to roll the die
}
