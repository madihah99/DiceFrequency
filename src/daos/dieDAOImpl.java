package daos;

import model.mDie;

public class dieDAOImpl extends dieDAO{
    /**
     * Create a new die
     */
    private mDie aDie;

    //constructor
    //set to null we can look out for null pointer exception so we can work out where the error may come from
    public dieDAOImpl(){
        this.aDie = null;
    }

    /**
     * This method returns an instance of the die
     * @return parameter is a die
     */
    @Override
    public mDie getDie(){
        return aDie;
    }

    /**
     * Create a new instance of the die
     */
    @Override
    public void createDie(){
        this.aDie = new mDie();
    }
}
