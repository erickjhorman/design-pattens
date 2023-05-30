package org.example.interfaces;

public interface IObservable {

    void addObserver(IObserver observer);
    void removeObserver();
}
