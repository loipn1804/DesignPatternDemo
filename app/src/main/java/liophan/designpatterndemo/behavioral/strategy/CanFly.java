package liophan.designpatterndemo.behavioral.strategy;

import android.util.Log;

/**
 * Copyright (c) 2017, Stacck Pte Ltd. All rights reserved.
 *
 * @author Lio <lphan@stacck.com>
 * @version 1.0
 * @since March 23, 2017
 */

public class CanFly implements Fly {
    @Override
    public String FlyAbility() {
        return " can fly very hight";
    }
}
