package controllers;

import daos.dataSetDAOImpl;
import daos.dieDAOImpl;
import daos.freqTableDAOImpl;
import helpers.InputHelper;
import view.dataSetView;
import view.freqTableView;

public class controller {
    private final dieDAOImpl daoDie;
    private final dataSetDAOImpl daoDataSet;
    private final freqTableDAOImpl daoFreqTable;
    private final dataSetView dsView;
    private final freqTableView fqTableView;

    /**
     * Initializes the DAOs
     */
    public controller(){
        daoDie = new dieDAOImpl();
        daoDataSet = new dataSetDAOImpl();
        daoFreqTable = new freqTableDAOImpl();
        dsView = new dataSetView();
        fqTableView = new freqTableView();
    }

    /**
     * Displays the menu and uses an InputHelper object
     * to accept valid user choice.
     * An appropriate private method is called to implement the choice.
     */
    public void run(){
        boolean finished = false;
        InputHelper inputHelper = new InputHelper();
        int iChoice = 0;

        do {
            theMenu();
            iChoice = inputHelper.readInt("Enter choice", 5, 1);
            switch (iChoice){
                case 1:
                    System.out.println("Starting simulation... Generating data");
                    System.out.println("--------------------------------------");
                    startSim();
                    System.out.println();
                    break;
                case 2:
                    displayDataSet();
                    System.out.println();
                    break;
                case 3:
                    displayFreqTable();
                    System.out.println();
                    break;
                case 4:
                    displayChart();
                    System.out.println();
                    break;
                case 5:
                    System.out.println("All done! Bye...");
                default: //invalid option
                    System.out.println("Oops! Something has went wrong!");
                    break;
            }
        } while (!finished);
    }
    private void theMenu() {
        //Print menu to console
        System.out.println("Dice Rolling Simulation");
        System.out.println("-----------------------");
        System.out.println("1: Start Simulation");
        System.out.println("2: Display Data Set");
        System.out.println("3: Display Frequency Table");
        System.out.println("4: Display Chart");
        System.out.println("5: Exit");
        System.out.println();
    }

    private void startSim(){
        System.out.println("Starting...");
        System.out.println("-----------");
        daoDie.createDie();
        daoDataSet.createDataSet(1000);
        daoFreqTable.createFqTable(11, daoDataSet.getDataSet());
    }

    private void displayDataSet(){
        System.out.println("Displaying data set");
        System.out.println("-------------------");
        dsView.displayDataSet(daoDataSet.getDataSet());
    }

    private void displayFreqTable(){
        System.out.println("Displaying frequency table");
        System.out.println("-------------------");
        fqTableView.displayFreqTable(daoFreqTable.getFqTable());
    }

    private void displayChart(){
        System.out.println("Displaying chart");
        System.out.println("-------------------");
        fqTableView.displayChart(daoFreqTable.getFqTable());
    }
}
