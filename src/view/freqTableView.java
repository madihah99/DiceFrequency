package view;

import model.mDataSet;
import model.mFrequencyTable;

public class freqTableView {
    private String repeat(String character, int times){
        String theText = "";
        for(int num = 0; num < times; num++){
            theText += character;
        }
        return theText;
    }
    public void displayFreqTable(mFrequencyTable theFreqTable) {
        int minThrowValue = 2;
        int fqTableSize = theFreqTable.getDataSetSize();
        System.out.println("Displaying Frequency Table...");
        System.out.println("-----------------------------");
        System.out.println(String.format("| %-10s | %-10s |", "Rolled", "Times"));
        System.out.println("-----------------------------");
        for (int pos = 0; pos < fqTableSize; pos++) {
            System.out.println(String.format("| %-10s | %-10s |", minThrowValue, theFreqTable.getValueFromFreqTable(pos)));
        }
        System.out.println("-----------------------------");
    }

    public void displayChart(mFrequencyTable theFreqTable){
        System.out.println("Display as a graph");
        int minThrowValue = 2;
        int repeatValue = 0;
        int fqTableSize = theFreqTable.getDataSetSize();

        for(int pos = 0; pos < fqTableSize; pos++) {
            repeatValue = (theFreqTable.getValueFromFreqTable(pos))/10;
            System.out.println(String.format("%-2s | %s", minThrowValue, repeat("*", repeatValue)));
            minThrowValue++;
        }

        repeatValue = 80;
        System.out.println(repeat("-", repeatValue));
        System.out.println(String.format("    %s", "12345678911111111112"));
        System.out.println(String.format("    %s", "00000000001234567890"));
        System.out.println(String.format("    %s", "         00000000000"));;
    }
}
