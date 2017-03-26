package liophan.designpatterndemo.creational.abstractfactory;

import android.util.Log;

/**
 * Copyright (c) 2017, Stacck Pte Ltd. All rights reserved.
 *
 * @author Lio <lphan@stacck.com>
 * @version 1.0
 * @since March 26, 2017
 */

public class UFOEnemyShip extends EnemyShip {

    private EnemyShipFactory mEnemyShipFactory;

    public UFOEnemyShip(EnemyShipFactory enemyShipFactory) {
        mEnemyShipFactory = enemyShipFactory;
    }

    @Override
    void makeShip() {
        Log.e("LIO", "Making enemy ship " + getName());
        setESWeapon(mEnemyShipFactory.makeESGun());
        setESEngine(mEnemyShipFactory.makeESEngine());
    }
}
