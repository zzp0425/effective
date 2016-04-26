package com.object;

import java.util.Arrays;
import java.util.EmptyStackException;

/**
 * Created by 周振平
 * on 2016/4/10 16:46
 * 栈实例引用
 */
public class Stack {
    private Object[] elements;
    private int size;
    private static final int DEFAULT_INITAL_CAPACITY = 16;

    public Stack() {
        elements = new Object[DEFAULT_INITAL_CAPACITY];
    }

    public void push(Object element) {
        ensureCapacity();
        elements[size++] = element;
    }

    public Object pop() {
        if (size == 0) {
            throw new EmptyStackException();
        }
        Object element = elements[--size];
        elements[size] = null;//eliminate obsolete reference 消除过期引用
        return element;
    }

    private void ensureCapacity(){
        if (elements.length == size) {
            elements = Arrays.copyOf(elements, 2 * size + 1);
        }
    }
}
