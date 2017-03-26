package liophan.designpatterndemo.creational.abstractfactory;

/**
 * Copyright (c) 2017, Stacck Pte Ltd. All rights reserved.
 *
 * @author Lio <lphan@stacck.com>
 * @version 1.0
 * @since March 26, 2017
 */

public class ESUFOBossEngine implements ESEngine {
    @Override
    public String info() {
        return "2500 mph";
    }
}
