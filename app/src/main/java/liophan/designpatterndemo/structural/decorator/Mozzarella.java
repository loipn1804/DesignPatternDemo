package liophan.designpatterndemo.structural.decorator;

import android.util.Log;

/**
 * Copyright (c) 2017, Stacck Pte Ltd. All rights reserved.
 *
 * @author Lio <lphan@stacck.com>
 * @version 1.0
 * @since April 03, 2017
 */

public class Mozzarella extends ToppingDecorator {

    public Mozzarella(Pizza pizza) {
        super(pizza);
        Log.e("LIO", "adding mozzarella");
    }

    @Override
    public String getDesc() {
        return mPizza.getDesc() + ", Mozzarella";
    }

    @Override
    public int getCost() {
        return mPizza.getCost() + 2;
    }
}
