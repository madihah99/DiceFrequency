package daos;

import model.mDataSet;

public abstract class dataSetDAO {
    /**
     * A method to return the data set
     */
    public abstract mDataSet getDataSet();

    /**
     * Create a random data set
     */
    public abstract void createDataSet(int elements);

    public abstract void addToDataSet(int position, int aValue);

    public abstract int getFromDataSet(int position);

    public abstract int getDataSetSize();
}
