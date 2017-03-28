package liophan.designpatterndemo.creational.builder;

/**
 * Copyright (c) 2017, Stacck Pte Ltd. All rights reserved.
 *
 * @author Lio <lphan@stacck.com>
 * @version 1.0
 * @since March 28, 2017
 */

public class RobotEngineer {

    private RobotBuilder mRobotBuilder;

    public RobotEngineer(RobotBuilder robotBuilder) {
        mRobotBuilder = robotBuilder;
    }

    public Robot getRobot() {
        return mRobotBuilder.getRobot();
    }

    public void makeRobot() {
        mRobotBuilder.buildRobotHead();
        mRobotBuilder.buildRobotTorso();
        mRobotBuilder.buildRobotArm();
        mRobotBuilder.buildRobotLeg();
    }
}
