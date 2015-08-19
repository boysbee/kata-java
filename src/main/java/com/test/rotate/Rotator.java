package com.test.rotate;

import java.util.Arrays;
import java.util.Collections;

public class Rotator {

    public static final int FIRST = 0;

    public Object[] rotate(Object[] objects, int number) {
        int counter = number % objects.length;
        if (counter == 0) {
            return objects;
        }
        Object[] result = new Object[objects.length];
        if (counter < 0) {
            backwardRotation(objects, result);
            return rotate(result, counter + 1);
        }
        if (number > 0) {
            forwardRotation(objects, result);
            return rotate(result, counter - 1);
        }

        return result;
    }

    // public Object[] rotate(Object[] objects, int number) {
// Collections.rotate(Arrays.asList(objects), number);
// return objects;
// }
    private void backwardRotation(Object[] objects, Object[] result) {
        int first = 0;
        int last = objects.length - 1;
        int moveIndex = 0;
        while (moveIndex < objects.length - 2) {
            result[moveIndex] = objects[first + (moveIndex + 1)];
            moveIndex++;
        }
        result[moveIndex] = objects[last];
        result[last] = objects[first];
    }

    private void forwardRotation(Object[] objects, Object[] result) {
        int last = objects.length - 1;
        result[FIRST] = objects[last];
        int moveIndex = 0;
        while (moveIndex < objects.length - 2) {
            result[moveIndex + 1] = objects[FIRST + moveIndex];
            moveIndex++;
        }
        result[last] = objects[FIRST + moveIndex];
    }
}