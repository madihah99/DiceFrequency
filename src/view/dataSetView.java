package view;

import model.mDataSet;
import model.mFrequencyTable;

public class dataSetView {
    public void displayDataSet(mDataSet theData){
        System.out.println("Displaying Data Set...");
        System.out.println("----------------------");
        System.out.println(String.format("| %-7s | %-7s |", "Throw", "Rolled"));
        System.out.println("----------------------");
        for(int pos = 0; pos < theData.getDataSetSize(); pos++) {
            System.out.println(String.format("| %-7s | %-7s |", pos, theData.getValueFromDataSet(pos)));
        }
        System.out.println("----------------------");
    }
}
