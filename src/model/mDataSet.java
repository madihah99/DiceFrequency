package model;

public class mDataSet {
    /*
    An array to hold the combined value of rolling two dice a set number of times
     */
    private int[] dataSet;

    /**
     * The method is a default constructor for the data set array
     * @param dataSetSize declares the number of elements in the array
     */
    public mDataSet(int dataSetSize){
        this.dataSet = new int[dataSetSize];
    }

    public void addToDataSet (int position, int aValue){
        this.dataSet[position] = aValue;
    }

    public int getValueFromDataSet(int position){
        return this.dataSet[position];
    }

    public int getDataSetSize(){
        return this.dataSet.length;
    }
}
