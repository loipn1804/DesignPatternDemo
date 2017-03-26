package liophan.designpatterndemo.creational.abstractfactory;

/**
 * Copyright (c) 2017, Stacck Pte Ltd. All rights reserved.
 *
 * @author Lio <lphan@stacck.com>
 * @version 1.0
 * @since March 26, 2017
 */

public abstract class EnemyShip {

    private String mName;
    private ESWeapon mESWeapon;
    private ESEngine mESEngine;

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public ESWeapon getESWeapon() {
        return mESWeapon;
    }

    public void setESWeapon(ESWeapon ESWeapon) {
        mESWeapon = ESWeapon;
    }

    public ESEngine getESEngine() {
        return mESEngine;
    }

    public void setESEngine(ESEngine ESEngine) {
        mESEngine = ESEngine;
    }

    abstract void makeShip();

    public String info() {
        String info = "The " + getName() + " has speed " + getESEngine().info() + " and attacks " + getESWeapon().info();
        return info;
    }
}
