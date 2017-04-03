package liophan.designpatterndemo.structural.decorator;

/**
 * Copyright (c) 2017, Stacck Pte Ltd. All rights reserved.
 *
 * @author Lio <lphan@stacck.com>
 * @version 1.0
 * @since April 03, 2017
 */

public class PlainPizza implements Pizza {

    @Override
    public String getDesc() {
        return "Thin dough";
    }

    @Override
    public int getCost() {
        return 10;
    }
}
