package org.example;

import org.example.interfaces.IObservable;
import org.example.interfaces.IObserver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Group implements IObservable  {
    private final String name;
    private List<IObserver> observers;
    private List<String> messages;
    public Group() {
        name = "whatsApp";
        this.observers = new ArrayList<>();
        this.messages = Arrays.asList(" was added ");
    }

    public List<String> getMessages() {
       return this.messages;
    }

    public String getName() {
        return name;
    }

    public List<IObserver> getObservers() {
        return observers;
    }

    public void setObservers(List<IObserver> observers) {
        this.observers = observers;
    }

    @Override
    public void addObserver(IObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver() {
        observers.clear();
    }

    private void receive(String message) {
        messages.add(message);
    }

    public void send() {
        notifyObservers();
    }
    private void notifyObservers() {
        for(IObserver observer : observers) {
            observer.fetch();
        }
    }

    @Override
    public String toString() {
        return "Group {" +
                ", observers=" + observers +
                '}';
    }
}
