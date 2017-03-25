package liophan.designpatterndemo.behavioral.strategy;

/**
 * Copyright (c) 2017, Stacck Pte Ltd. All rights reserved.
 *
 * @author Lio <lphan@stacck.com>
 * @version 1.0
 * @since March 23, 2017
 */

public class Animal {
    private String mName;
    private Fly mFly;

    public Animal() {
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public Fly getFly() {
        return mFly;
    }

    public void setFly(Fly fly) {
        mFly = fly;
    }
}
