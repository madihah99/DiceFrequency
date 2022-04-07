package model;

public class mFrequencyTable {
    /*
    An array to hold the combined value of rolling two dice a set number of times
    */
    private int[] frequencyTable;

    /**
     * This method is the default constructor for the frequency table array
     * @param ftSize declares the number of elements in an array
     */
    public mFrequencyTable(int ftSize){
        this.frequencyTable = new int[ftSize];
        for(int pos = 0; pos < ftSize; pos++){
            this.frequencyTable[pos] = 0;
        }
    }

    public int getDataSetSize() {
        return this.frequencyTable.length;
    }

    public int getValueFromFreqTable(int position){
        return this.frequencyTable[position];
    }

    public void addToFreqTable (int position, int aValue){
        this.frequencyTable[position] = aValue;
    }
}
