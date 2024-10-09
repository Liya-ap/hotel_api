package dat;

import dat.config.ApplicationConfig;
import dat.config.Populate;

public class Main {

    public static void main(String[] args) {
        //Populates the database
        Populate.populateDatabase();

        System.out.println("Starting the server..");
        //Start the server
        ApplicationConfig.startServer(7070);
    }
}