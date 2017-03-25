package liophan.designpatterndemo.behavioral.observer;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import liophan.designpatterndemo.R;

/**
 * Copyright (c) 2017, Stacck Pte Ltd. All rights reserved.
 *
 * @author Lio <lphan@stacck.com>
 * @version 1.0
 * @since March 25, 2017
 */

public class ObserverActivity extends AppCompatActivity {

    @BindView(R.id.btnAction)
    Button btnAction;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_observer);
        ButterKnife.bind(this);

        btnAction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                action();
            }
        });
    }

    private void action() {
        StockGrabber stockGrabber = new StockGrabber();

        StockObserver observer_1 = new StockObserver(stockGrabber);
        stockGrabber.setIBMPrice(10);
        stockGrabber.setAPLPrice(12);
        stockGrabber.setGGLPrice(14);

        StockObserver observer_2 = new StockObserver(stockGrabber);
        stockGrabber.setIBMPrice(11);
        stockGrabber.setAPLPrice(13);
        stockGrabber.setGGLPrice(15);

        stockGrabber.unRegister(observer_1);

        stockGrabber.setIBMPrice(20);
        stockGrabber.setAPLPrice(22);
        stockGrabber.setGGLPrice(24);

        Runnable runIBM = new GetTheStock(2, "IBM", 20, stockGrabber);
        Runnable runAPL = new GetTheStock(2, "APL", 22, stockGrabber);
        Runnable runGGL = new GetTheStock(2, "GGL", 24, stockGrabber);

        new Thread(runIBM).start();
        new Thread(runAPL).start();
        new Thread(runGGL).start();
    }
}
