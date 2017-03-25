package liophan.designpatterndemo.behavioral.observer;

import android.util.Log;

/**
 * Copyright (c) 2017, Stacck Pte Ltd. All rights reserved.
 *
 * @author Lio <lphan@stacck.com>
 * @version 1.0
 * @since March 25, 2017
 */

public class StockObserver implements Observer {

    public static int observerIDTracker = 0;

    private double mIBMPrice;
    private double mAPLPrice;
    private double mGGLPrice;

    private int mObserverID = 0;
    private Subject mStockGrabber;

    public StockObserver(Subject stockGrabber) {
        mStockGrabber = stockGrabber;
        mObserverID = ++observerIDTracker;
        Log.e("LIO", "New observer ID " + mObserverID);
        mStockGrabber.register(this);
    }

    @Override
    public void update(double ibmPrice, double aplPrice, double gglPrice) {
        mIBMPrice = ibmPrice;
        mAPLPrice = aplPrice;
        mGGLPrice = gglPrice;

        print();
    }

    private void print() {
        Log.e("LIO", "Observer ID : " + mObserverID + " - IBM : " + mIBMPrice + " - APL : " + mAPLPrice + " - GGL : " + mGGLPrice);
    }
}
