package liophan.designpatterndemo.creational.builder;

/**
 * Copyright (c) 2017, Stacck Pte Ltd. All rights reserved.
 *
 * @author Lio <lphan@stacck.com>
 * @version 1.0
 * @since March 28, 2017
 */

public class OldRobotBuilder implements RobotBuilder {

    private Robot mRobot;

    public OldRobotBuilder() {
        mRobot = new Robot();
    }

    @Override
    public void buildRobotHead() {
        mRobot.setRobotHead("Tint Head");
    }

    @Override
    public void buildRobotTorso() {
        mRobot.setRobotTorso("Mint Torso");
    }

    @Override
    public void buildRobotArm() {
        mRobot.setRobotArm("Hunt Arm");
    }

    @Override
    public void buildRobotLeg() {
        mRobot.setRobotLeg("Mons Leg");
    }

    @Override
    public Robot getRobot() {
        return mRobot;
    }
}
