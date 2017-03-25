package liophan.designpatterndemo.behavioral.observer;

import android.util.Log;

import java.text.DecimalFormat;

/**
 * Copyright (c) 2017, Stacck Pte Ltd. All rights reserved.
 *
 * @author Lio <lphan@stacck.com>
 * @version 1.0
 * @since March 25, 2017
 */

public class GetTheStock implements Runnable {

    private int mStartTime;
    private String mStock;
    private double mPrice;

    private Subject mStockGrabber;

    public GetTheStock(int startTime, String stock, double price, Subject stockGrabber) {
        mStartTime = startTime;
        mStock = stock;
        mPrice = price;
        mStockGrabber = stockGrabber;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(mStartTime * 1000);
            } catch (InterruptedException e) {
                Log.e("LIO", Log.getStackTraceString(e));
            }

            double random = (Math.random() * (0.6)) - 0.3;
            DecimalFormat decimalFormat = new DecimalFormat("#.##");
            mPrice = Double.valueOf(decimalFormat.format(mPrice + random));
            Log.e("LIO", mStock + " " + decimalFormat.format(mPrice) + " " + decimalFormat.format(random));
            if (mStock.equals("IBM")) ((StockGrabber) mStockGrabber).setIBMPrice(mPrice);
            if (mStock.equals("APL")) ((StockGrabber) mStockGrabber).setAPLPrice(mPrice);
            if (mStock.equals("GGL")) ((StockGrabber) mStockGrabber).setGGLPrice(mPrice);
        }
    }
}
