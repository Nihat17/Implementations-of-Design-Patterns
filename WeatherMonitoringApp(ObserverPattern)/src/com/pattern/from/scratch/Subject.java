package com.pattern.from.scratch;

import com.pattern.from.scratch.Observer;

public interface Subject {
    public void registerObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObservers();
}
