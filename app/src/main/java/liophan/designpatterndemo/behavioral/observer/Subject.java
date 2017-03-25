package liophan.designpatterndemo.behavioral.observer;

/**
 * Copyright (c) 2017, Stacck Pte Ltd. All rights reserved.
 *
 * @author Lio <lphan@stacck.com>
 * @version 1.0
 * @since March 25, 2017
 */

public interface Subject {
    void register(Observer observer);
    void unRegister(Observer observer);
    void notifyObserver();
}
