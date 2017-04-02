package liophan.designpatterndemo.other.reflection;

import liophan.designpatterndemo.creational.abstractfactory.ESEngine;
import liophan.designpatterndemo.creational.abstractfactory.ESWeapon;

/**
 * Copyright (c) 2017, Stacck Pte Ltd. All rights reserved.
 *
 * @author Lio <lphan@stacck.com>
 * @version 1.0
 * @since March 26, 2017
 */

public interface EnemyShipFactory {

    ESWeapon makeESGun();

    ESEngine makeESEngine();
}
