package liophan.designpatterndemo.creational.prototype;

/**
 * Copyright (c) 2017, Stacck Pte Ltd. All rights reserved.
 *
 * @author Lio <lphan@stacck.com>
 * @version 1.0
 * @since March 29, 2017
 */

public interface Animal extends Cloneable {
    Animal makeCopy();
}
