package liophan.designpatterndemo.behavioral.strategy;

/**
 * Copyright (c) 2017, Stacck Pte Ltd. All rights reserved.
 *
 * @author Lio <lphan@stacck.com>
 * @version 1.0
 * @since March 23, 2017
 */

public class Bird extends Animal {
    public Bird() {
        setName("Bird");
        setFly(new CanFly());
    }
}
