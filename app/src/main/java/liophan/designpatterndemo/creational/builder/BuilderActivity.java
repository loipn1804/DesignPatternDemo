package liophan.designpatterndemo.creational.builder;

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
 * @since March 28, 2017
 */

public class BuilderActivity extends AppCompatActivity {

    @BindView(R.id.btnAction)
    Button btnAction;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_builder);
        ButterKnife.bind(this);

        btnAction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                action();
                action2();
            }
        });
    }

    private void action() {
        RobotBuilder oldTypeRobot = new OldRobotBuilder();

        RobotEngineer robotEngineer = new RobotEngineer(oldTypeRobot);

        robotEngineer.makeRobot();

        Robot oldRobot = robotEngineer.getRobot();

        Log.e("LIO", "oldRobot " + oldRobot.getRobotHead() + " - " + oldRobot.getRobotTorso() + " - " + oldRobot.getRobotArm() + " - " + oldRobot.getRobotLeg());
    }

    private void action2() {
        RobotBuilder redTypeRobot = new RedRobotBuilder();

        RobotEngineer robotEngineer = new RobotEngineer(redTypeRobot);

        robotEngineer.makeRobot();

        Robot redRobot = robotEngineer.getRobot();

        Log.e("LIO", "redRobot " + redRobot.getRobotHead() + " - " + redRobot.getRobotTorso() + " - " + redRobot.getRobotArm() + " - " + redRobot.getRobotLeg());
    }
}
