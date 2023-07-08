package org.example;

import org.example.observers.User;

public class DesignPatten {
    public static void main(String[] args) {
        Group instance = GroupFactory.getInstance();
        User user = new User("Erick");
        User user1 = new User("Jhonathan");
        User user2 = new User("Luis");
        instance.addObserver(user);
        instance.send();

        addSubscriberToString(user1);
        instance.addObserver(user1);
        instance.send();

        addSubscriberToString(user2);

        instance.addObserver(user2);
        instance.send();

        User user3 = new User("Maria");
        addSubscriberToString(user3);
        instance.addObserver(user3);
        instance.send();

    }

    private static void addSubscriberToString(User user) {
        System.out.println("");
        System.out.println("Adding another subscriptor " + user.getName());
    }
}