package liophan.designpatterndemo.structural.decorator;

import android.util.Log;

/**
 * Copyright (c) 2017, Stacck Pte Ltd. All rights reserved.
 *
 * @author Lio <lphan@stacck.com>
 * @version 1.0
 * @since April 03, 2017
 */

public class TomatoSauce extends Mozzarella {

    public TomatoSauce(Pizza pizza) {
        super(pizza);
        Log.e("LIO", "adding tomato sauce");
    }

    @Override
    public String getDesc() {
        return mPizza.getDesc() + ", Tomato Sauce";
    }

    @Override
    public int getCost() {
        return mPizza.getCost() + 3;
    }
}
