package daos;

import model.mDataSet;
import model.mFrequencyTable;

public abstract class freqTableDAO {
    /**
     * A method to return the frequency table
     */
    public abstract mFrequencyTable getFqSet();

    public abstract mFrequencyTable getFqTable();

    /**
     * Create a frequency table
     */
    public abstract void createFqTable (int elements, mDataSet theData);

    public abstract void determineFrequency(mDataSet theData);

    public abstract void addToFqTable(int position, int aValue);

    public abstract int getFromFqTable(int position);

    public abstract int getFqTableSize();
}
