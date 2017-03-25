package liophan.designpatterndemo.creational.factory;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.Random;

import butterknife.BindView;
import butterknife.ButterKnife;
import liophan.designpatterndemo.R;

/**
 * Copyright (c) 2017, Stacck Pte Ltd. All rights reserved.
 *
 * @author Lio <lphan@stacck.com>
 * @version 1.0
 * @since March 25, 2017
 */

public class FactoryActivity extends AppCompatActivity {

    @BindView(R.id.btnAction)
    Button btnAction;

    private EnemyShipFactory mEnemyShipFactory;
    private Random mRandom;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_observer);
        ButterKnife.bind(this);

        mEnemyShipFactory = new EnemyShipFactory();
        mRandom = new Random();

        btnAction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                action();
            }
        });
    }

    private void action() {
        EnemyShip enemyShip = mEnemyShipFactory.makeEnemyShip(mRandom.nextInt(4));
        if (enemyShip != null) {
            enemyShip.displayEnemyShip();
            enemyShip.followHeroShip();
            enemyShip.enemyShipShoot();
        } else {
            Log.e("LIO", "No have enemy ship.");
        }
    }
}
