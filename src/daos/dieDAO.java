package daos;

import model.mDie;

public abstract class dieDAO {
    /**
     * A method to return the die
     */
    public abstract mDie getDie();

    /**
     * Create a die
     */
    public abstract void createDie();
}
