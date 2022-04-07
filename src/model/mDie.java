package model;

import java.util.Random;

public class mDie extends ADie {
    private int dieFace;

    //constructor
    public mDie() {
        this.dieFace = 1;
    }

    @Override
    public int roll() {
        die = randInt();
        return die;
    }

    //private implementation of randInt()...
    /**
     * The method randInt() is a private method.
     * This method has no parameters
     * @return an integer random number in the range 1 to 6
     */
    private static int randInt(){
        int min = 1;
        int max = 6;
        //Usually this can be a field rather than a method variable
        Random rand = new Random();
        //nextInt is normally exclusive of the top value, so add 1 to make it inclusive
        int randomNum = rand.nextInt((max - min) + 1) + min;
        return randomNum;
    }
}
