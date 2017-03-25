package liophan.designpatterndemo.creational.factory;

import android.util.Log;

/**
 * Copyright (c) 2017, Stacck Pte Ltd. All rights reserved.
 *
 * @author Lio <lphan@stacck.com>
 * @version 1.0
 * @since March 25, 2017
 */

public class EnemyShip {

    private String mName;
    private double mDamage;

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public double getDamage() {
        return mDamage;
    }

    public void setDamage(double damage) {
        mDamage = damage;
    }

    public void followHeroShip() {
        Log.e("LIO", getName() + " is following the hero ship.");
    }

    public void displayEnemyShip() {
        Log.e("LIO", getName() + " is on screen.");
    }

    public void enemyShipShoot() {
        Log.e("LIO", getName() + " attacks and does " + getDamage());
    }
}
