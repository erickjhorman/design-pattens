package org.example.model;

public class Server {

    //create a static variable of Server
    private static Server instance;

    //Declare a private constructor, so that this class cannot be instantiated
    private Server() {}

    public static Server getInstance() {
        if (instance == null) {
            instance = new Server();
            System.out.println("Creating server instance");
        }
        System.out.println("Returning the same  server instance");
        return instance;
    }

    public Server userConnected(int userId) {
        System.out.println("user connected" + userId);
        return getInstance();
    }
}
