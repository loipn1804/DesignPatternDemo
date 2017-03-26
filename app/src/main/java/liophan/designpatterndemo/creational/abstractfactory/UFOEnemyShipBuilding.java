package liophan.designpatterndemo.creational.abstractfactory;

import android.util.Log;

/**
 * Copyright (c) 2017, Stacck Pte Ltd. All rights reserved.
 *
 * @author Lio <lphan@stacck.com>
 * @version 1.0
 * @since March 26, 2017
 */

public class UFOEnemyShipBuilding extends EnemyShipBuilding {
    @Override
    protected EnemyShip makeEnemyShip(int typeOfShip) {
        EnemyShip enemyShip = null;
        EnemyShipFactory enemyShipFactory = null;
        switch (typeOfShip) {
            case 1:
                enemyShipFactory = new UFOEnemyShipFactory();
                enemyShip = new UFOEnemyShip(enemyShipFactory);
                enemyShip.setName("UFO small ship");
                break;
            case 2:
                enemyShipFactory = new UFOBossEnemyShipFactory();
                enemyShip = new UFOEnemyShip(enemyShipFactory);
                enemyShip.setName("UFO BOSS ship");
                break;
        }
        return enemyShip;
    }
}
