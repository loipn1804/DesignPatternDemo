package liophan.designpatterndemo.creational.builder;

/**
 * Copyright (c) 2017, Stacck Pte Ltd. All rights reserved.
 *
 * @author Lio <lphan@stacck.com>
 * @version 1.0
 * @since March 28, 2017
 */

public class RedRobotBuilder implements RobotBuilder {

    private Robot mRobot;

    public RedRobotBuilder() {
        mRobot = new Robot();
    }

    @Override
    public void buildRobotHead() {
        mRobot.setRobotHead("Red head");
    }

    @Override
    public void buildRobotTorso() {
        mRobot.setRobotTorso("Red torso");
    }

    @Override
    public void buildRobotArm() {
        mRobot.setRobotArm("Red arm");
    }

    @Override
    public void buildRobotLeg() {
        mRobot.setRobotLeg("Red leg");
    }

    @Override
    public Robot getRobot() {
        return mRobot;
    }
}
