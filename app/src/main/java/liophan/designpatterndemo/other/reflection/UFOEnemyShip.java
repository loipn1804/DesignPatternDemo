package liophan.designpatterndemo.other.reflection;

import android.util.Log;

/**
 * Copyright (c) 2017, Stacck Pte Ltd. All rights reserved.
 *
 * @author Lio <lphan@stacck.com>
 * @version 1.0
 * @since March 26, 2017
 */

public class UFOEnemyShip extends EnemyShip {

    private String mIdCode = "100";

    private EnemyShipFactory mEnemyShipFactory;

    public UFOEnemyShip(EnemyShipFactory enemyShipFactory) {
        mEnemyShipFactory = enemyShipFactory;
    }

    public UFOEnemyShip(int num, String name) {
        Log.e("LIO", "UFOEnemyShip no." + num + " name:" + name);
    }

    private String getPrivate() {
        return "How id you get this?";
    }

    private String getOtherPrivate(int num, String name) {
        return "This is other private number " + " with name is " + name;
    }

    @Override
    void makeShip() {
        Log.e("LIO", "Making enemy ship " + getName());
    }
}
