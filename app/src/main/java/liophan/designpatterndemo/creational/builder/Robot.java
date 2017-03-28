package liophan.designpatterndemo.creational.builder;

/**
 * Copyright (c) 2017, Stacck Pte Ltd. All rights reserved.
 *
 * @author Lio <lphan@stacck.com>
 * @version 1.0
 * @since March 28, 2017
 */

public class Robot implements RobotPlan {

    private String robotHead;
    private String robotTorso;
    private String robotArm;
    private String robotLeg;

    @Override
    public void setRobotHead(String head) {
        robotHead = head;
    }

    @Override
    public void setRobotTorso(String torso) {
        robotTorso = torso;
    }

    @Override
    public void setRobotArm(String arm) {
        robotArm = arm;
    }

    @Override
    public void setRobotLeg(String leg) {
        robotLeg = leg;
    }

    public String getRobotHead() {
        return robotHead;
    }

    public String getRobotTorso() {
        return robotTorso;
    }

    public String getRobotArm() {
        return robotArm;
    }

    public String getRobotLeg() {
        return robotLeg;
    }
}
