package org.example;

import org.example.model.Server;

public class DesignPatten {
    public static void main(String[] args) {

        //Create first and last Server instance
        Server.getInstance();

        //User connected and return the same instance
        Server.getInstance().userConnected(1);

    }
}