package liophan.designpatterndemo.structural.decorator;

/**
 * Copyright (c) 2017, Stacck Pte Ltd. All rights reserved.
 *
 * @author Lio <lphan@stacck.com>
 * @version 1.0
 * @since April 03, 2017
 */

abstract class ToppingDecorator implements Pizza {

    protected Pizza mPizza;

    public ToppingDecorator(Pizza pizza) {
        mPizza = pizza;
    }

    @Override
    public String getDesc() {
        return mPizza.getDesc();
    }

    @Override
    public int getCost() {
        return mPizza.getCost();
    }
}
