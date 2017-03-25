package liophan.designpatterndemo.creational.factory;

/**
 * Copyright (c) 2017, Stacck Pte Ltd. All rights reserved.
 *
 * @author Lio <lphan@stacck.com>
 * @version 1.0
 * @since March 25, 2017
 */

public class EnemyShipFactory {

    public EnemyShip makeEnemyShip(int type) {
        switch (type) {
            case 1:
                return new UFOEnemyShip();
            case 2:
                return new RocketEnemyShip();
            case 3:
                return new BigUFOEnemyShip();
            default:
                return null;
        }
    }
}
