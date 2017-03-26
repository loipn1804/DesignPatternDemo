package liophan.designpatterndemo.creational.singleton;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import liophan.designpatterndemo.R;

/**
 * Copyright (c) 2017, Stacck Pte Ltd. All rights reserved.
 *
 * @author Lio <lphan@stacck.com>
 * @version 1.0
 * @since March 26, 2017
 */

public class SingletonActivity extends AppCompatActivity {

    @BindView(R.id.btnAction)
    Button btnAction;
    @BindView(R.id.btnAction2)
    Button btnAction2;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singleton);
        ButterKnife.bind(this);

        btnAction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                action();
            }
        });

        btnAction2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                action2();
            }
        });
    }

    private void action() {
        Singleton singleton1 = Singleton.getInstance();

        Log.e("LIO", "singleton1 ID: " + System.identityHashCode(singleton1));

        Log.e("LIO", TextUtils.join(",", singleton1.getLetterList()));

        Log.e("LIO", TextUtils.join(",", singleton1.getTiles(8)));

        Log.e("LIO", TextUtils.join(",", singleton1.getLetterList()));

        Singleton singleton2 = Singleton.getInstance();

        Log.e("LIO", "singleton2 ID: " + System.identityHashCode(singleton2));

        Log.e("LIO", TextUtils.join(",", singleton1.getLetterList()));

        Log.e("LIO", TextUtils.join(",", singleton1.getTiles(8)));

        Log.e("LIO", TextUtils.join(",", singleton1.getLetterList()));
    }

    private void action2() {
        Runnable runnable1 = new GetTheTiles();
        Runnable runnable2 = new GetTheTiles();

        new Thread(runnable1).start();
        new Thread(runnable2).start();
    }
}
