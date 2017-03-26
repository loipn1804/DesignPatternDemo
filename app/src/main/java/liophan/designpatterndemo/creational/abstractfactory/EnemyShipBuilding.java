package liophan.designpatterndemo.creational.abstractfactory;

/**
 * Copyright (c) 2017, Stacck Pte Ltd. All rights reserved.
 *
 * @author Lio <lphan@stacck.com>
 * @version 1.0
 * @since March 26, 2017
 */

public abstract class EnemyShipBuilding {

    protected abstract EnemyShip makeEnemyShip(int typeOfShip);

    public EnemyShip orderTheShip(int typeOfShip) {
        EnemyShip enemyShip = makeEnemyShip(typeOfShip);

        enemyShip.makeShip();

        return enemyShip;
    }
}
