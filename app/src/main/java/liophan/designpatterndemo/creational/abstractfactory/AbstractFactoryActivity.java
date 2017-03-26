package liophan.designpatterndemo.creational.abstractfactory;

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
 * @since March 26, 2017
 */

public class AbstractFactoryActivity extends AppCompatActivity {

    @BindView(R.id.btnAction)
    Button btnAction;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abstract_factory);
        ButterKnife.bind(this);

        btnAction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                action();
            }
        });
    }

    private void action() {
        EnemyShipBuilding enemyShipBuilding = new UFOEnemyShipBuilding();

        EnemyShip smallShip = enemyShipBuilding.orderTheShip(1);
        Log.e("LIO", smallShip.info());

        EnemyShip bossShip = enemyShipBuilding.orderTheShip(2);
        Log.e("LIO", bossShip.info());
    }
}
