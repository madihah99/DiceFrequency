package daos;

import model.mDataSet;
import model.mFrequencyTable;

public class freqTableDAOImpl extends freqTableDAO{
    private mFrequencyTable freqTable;

    public freqTableDAOImpl(){
        this.freqTable = null;
    }

    @Override
    public mFrequencyTable getFqSet() {
        return null;
    }

    @Override
    public mFrequencyTable getFqTable(){
        return this.freqTable;
    }

    @Override
    public void createFqTable(int elements, mDataSet theData){
        this.freqTable = new mFrequencyTable(elements);
        this.determineFrequency(theData);
    }

    @Override
    public int getFqTableSize(){
        return this.freqTable.getDataSetSize();
    }

    @Override
    public void addToFqTable(int position, int aValue){
        this.freqTable.addToFreqTable(position, aValue);
    }

    @Override
    public int getFromFqTable(int position){
        return this.freqTable.getValueFromFreqTable(position);
    }

    @Override
    public void determineFrequency(mDataSet theData){
        int diceThrow = 0;
        int currentValue = 0;
        int dataSetSize = theData.getDataSetSize();
        //Parse the data set
        for(int pos = 0; pos < dataSetSize; pos++){
            diceThrow = theData.getValueFromDataSet(pos);
            switch (diceThrow){
                case 2:
                    currentValue = this.getFromFqTable(0) + 1;
                    this.addToFqTable(0, currentValue);
                    break;

                case 3:
                    currentValue = this.getFromFqTable(1) + 1;
                    this.addToFqTable(1, currentValue);
                    break;

                case 4:
                    currentValue = this.getFromFqTable(2) + 1;
                    this.addToFqTable(2, currentValue);
                    break;

                case 5:
                    currentValue = this.getFromFqTable(3) + 1;
                    this.addToFqTable(3, currentValue);
                    break;

                case 6:
                    currentValue = this.getFromFqTable(4) + 1;
                    this.addToFqTable(4, currentValue);
                    break;

                case 7:
                    currentValue = this.getFromFqTable(5) + 1;
                    this.addToFqTable(5, currentValue);
                    break;
            }
        }
    }
}
