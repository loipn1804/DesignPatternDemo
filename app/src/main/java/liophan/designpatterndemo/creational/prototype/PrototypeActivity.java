package liophan.designpatterndemo.creational.prototype;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
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
 * @since March 29, 2017
 */

public class PrototypeActivity extends AppCompatActivity {

    @BindView(R.id.btnAction)
    Button btnAction;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prototype);
        ButterKnife.bind(this);

        btnAction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                action();
            }
        });
    }

    private void action() {
        Sheep sally = new Sheep();

        Sheep mimi = sally;

        CloneFactory cloneFactory = new CloneFactory();

        Sheep dolly = (Sheep) cloneFactory.getClone(sally);

        Log.e("LIO", "sally " + sally + " " + System.identityHashCode(sally));
        Log.e("LIO", "mimi " + mimi + " " + System.identityHashCode(mimi));
        Log.e("LIO", "dolly " + dolly + " " + System.identityHashCode(dolly));
    }
}
