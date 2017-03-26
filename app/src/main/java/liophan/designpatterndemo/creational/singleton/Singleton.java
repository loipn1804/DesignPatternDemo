package liophan.designpatterndemo.creational.singleton;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

/**
 * Copyright (c) 2017, Stacck Pte Ltd. All rights reserved.
 *
 * @author Lio <lphan@stacck.com>
 * @version 1.0
 * @since March 26, 2017
 */

public class Singleton {

    private static Singleton firstInstance = null;

    private String[] scrabbleLetters =
            {"a", "a", "a", "a", "a", "a",
                    "b", "b", "b", "b", "c", "c", "c",
                    "d", "e", "e", "e", "e", "f", "f",
                    "g", "g", "g", "h", "i", "j", "j",
                    "k", "k", "k", "k", "l", "l", "l",
                    "l", "l", "m", "m", "m", "n", "n",
                    "o", "o", "p", "q", "q", "q", "r",
                    "s", "s", "t", "t", "t", "t", "u",
                    "u", "u", "u", "v", "v", "v", "w",
                    "w", "x", "y", "y", "y", "z", "z"};

    private LinkedList<String> letterList = new LinkedList<>(Arrays.asList(scrabbleLetters));

    static boolean firstThread = true;

    private Singleton() {

    }

    public static Singleton getInstance() {
        if (firstInstance == null) {

            if (firstThread) {
                firstThread = false;

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            synchronized (Singleton.class) {
                if (firstInstance == null) {
                    firstInstance = new Singleton();
                    Collections.shuffle(firstInstance.letterList);
                }
            }
        }

        return firstInstance;
    }

    public LinkedList<String> getLetterList() {
        return firstInstance.letterList;
    }

    public LinkedList<String> getTiles(int howManyTiles) {
        LinkedList<String> tilesToSend = new LinkedList<>();

        for (int i = 0; i < howManyTiles; i++) {
            tilesToSend.add(firstInstance.letterList.remove(0));
        }

        return tilesToSend;
    }
}
