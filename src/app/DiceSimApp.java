package app;

import controllers.controller;

public class DiceSimApp {
    /**
     * Creates a Controller object and
     * sends it a run message
     */
    private static void run(){
        final controller controller = new controller();
        controller.run();
    }

    /**
     * Starts the app by invoking the class method run
     */
    public static void main(final String[] args) {
        DiceSimApp.run();
    }
}
