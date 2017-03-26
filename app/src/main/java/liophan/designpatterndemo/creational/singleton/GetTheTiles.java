package liophan.designpatterndemo.creational.singleton;

import android.text.TextUtils;
import android.util.Log;

/**
 * Copyright (c) 2017, Stacck Pte Ltd. All rights reserved.
 *
 * @author Lio <lphan@stacck.com>
 * @version 1.0
 * @since March 26, 2017
 */

public class GetTheTiles implements Runnable {
    @Override
    public void run() {
        Singleton singleton = Singleton.getInstance();

        Log.e("LIO", "singleton ID: " + System.identityHashCode(singleton));

        Log.e("LIO", TextUtils.join(",", singleton.getLetterList()));

        Log.e("LIO", TextUtils.join(",", singleton.getTiles(8)));

        Log.e("LIO", TextUtils.join(",", singleton.getLetterList()));

        Log.e("LIO", "Got tiles!");
    }
}
