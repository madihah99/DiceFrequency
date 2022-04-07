package model;

public abstract class ADie {
    /**
     * This variable will holf the face value of the die
     */
    public int die; //characteristic

    /**
     * The method roll() has no parameters
     * @return integer value in the range 1 go 6
     */

    public abstract int roll(); //operation
}
