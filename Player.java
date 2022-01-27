/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tossuptester;

/**
 *
 * @author csvke
 */
public class Player {
    Player(String name){
        this.name = name;
    }
    
    /**
     Get and return the player's name
     @return the player's name
     */
    String getName(){
        return name;
    }
    
    /**
     Get and return a player's total score
     @return The player's total score
     */
    public int getScore(){
        return totalScore;
    }
    
    private final String name;
    private int totalScore;
}
