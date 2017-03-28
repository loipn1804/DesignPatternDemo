package liophan.designpatterndemo.creational.builder;

/**
 * Copyright (c) 2017, Stacck Pte Ltd. All rights reserved.
 *
 * @author Lio <lphan@stacck.com>
 * @version 1.0
 * @since March 28, 2017
 */

public interface RobotPlan {
    void setRobotHead(String head);

    void setRobotTorso(String torso);

    void setRobotArm(String arm);

    void setRobotLeg(String leg);
}
