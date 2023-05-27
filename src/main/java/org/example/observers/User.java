package org.example.observers;

import org.example.Group;
import org.example.GroupFactory;
import org.example.interfaces.IObserver;

public class User implements IObserver {

    private String name;

    private final Group groupFactory;

    public User(String name) {
        this.name = name;
        groupFactory = GroupFactory.getInstance();
    }

    public String getName() {
        return name;
    }

    @Override
    public void fetch() {
        if (groupFactory.getObservers().size() == 1) {
            System.out.println("Receiving message from group " + groupFactory.getName() + " for  " + name + ". " + getLastSubscriber().name + " has created a group");
        } else {
            System.out.println("Receiving message from group " + groupFactory.getName() + " for  " + name + ". " + getLastSubscriber().name + groupFactory.getMessages().get(0));

        }

    }

    private User getLastSubscriber() {
        int size = groupFactory.getObservers().size();
        return (User) groupFactory.getObservers().get(size - 1);
    }
}
