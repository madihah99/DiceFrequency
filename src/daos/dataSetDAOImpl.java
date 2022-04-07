package daos;

import model.mDataSet;
import model.mDie;

public class dataSetDAOImpl extends dataSetDAO{
    private mDataSet aDataSet;
    private mDie aDie;

    //constructor
    //values set to null to check for exceptions
    public dataSetDAOImpl(){
        this.aDataSet = null;
        this.aDie = null;
    }

    @Override
    public mDataSet getDataSet(){
        return aDataSet;
    }

    @Override
    public void createDataSet(int elements){
        this.aDataSet = new mDataSet(elements);
        this.aDie = new mDie();
        createRandomData();
    }

    @Override
    public int getDataSetSize(){
        return this.aDataSet.getDataSetSize();
    }

    @Override
    public void addToDataSet(int position, int aValue){
        this.aDataSet.addToDataSet(position, aValue);
    }

    @Override
    public int getFromDataSet(int position){
        return this.aDataSet.getValueFromDataSet(position);
    }

    private void createRandomData() {
        int sumDie = 0;
        int dataSetSize = this.getDataSetSize();
        //create random data set
        for(int pos = 0; pos < dataSetSize; pos++){
            sumDie = this.aDie.roll() + this.aDie.roll();
            this.addToDataSet(pos, sumDie);
        }
    }
}
