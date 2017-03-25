package liophan.designpatterndemo.behavioral.observer;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;

/**
 * Copyright (c) 2017, Stacck Pte Ltd. All rights reserved.
 *
 * @author Lio <lphan@stacck.com>
 * @version 1.0
 * @since March 25, 2017
 */

public class StockGrabber implements Subject {

    private List<Observer> mObserverList;
    private double mIBMPrice;
    private double mAPLPrice;
    private double mGGLPrice;

    public StockGrabber() {
        mObserverList = new ArrayList<>();
    }

    @Override
    public void register(Observer observer) {
        mObserverList.add(observer);
    }

    @Override
    public void unRegister(Observer observer) {
        int index = mObserverList.indexOf(observer);
        mObserverList.remove(index);
        Log.e("LIO", "Removed item " + (index + 1));
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : mObserverList) {
            observer.update(mIBMPrice, mAPLPrice, mGGLPrice);
        }
    }

    public void setIBMPrice(double IBMPrice) {
        mIBMPrice = IBMPrice;
        notifyObserver();
    }

    public void setAPLPrice(double APLPrice) {
        mAPLPrice = APLPrice;
        notifyObserver();
    }

    public void setGGLPrice(double GGLPrice) {
        mGGLPrice = GGLPrice;
        notifyObserver();
    }
}
