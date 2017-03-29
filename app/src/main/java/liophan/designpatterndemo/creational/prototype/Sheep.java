package liophan.designpatterndemo.creational.prototype;

import android.util.Log;

/**
 * Copyright (c) 2017, Stacck Pte Ltd. All rights reserved.
 *
 * @author Lio <lphan@stacck.com>
 * @version 1.0
 * @since March 29, 2017
 */

public class Sheep implements Animal {

    public Sheep() {
        Log.e("LIO", "Sheep is made");
    }

    @Override
    public Animal makeCopy() {
        Log.e("LIO", "Sheep is being made");

        Sheep sheep = null;

        try {
            sheep = (Sheep) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return sheep;
    }

    @Override
    public String toString() {
        return "Sheep to string";
    }
}
