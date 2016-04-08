package com.object.demo;

/**
 * Created by 周振平
 * on 2016/4/8 23:30
 * 创建和销毁对象学习案例
 */
public class ObjectLearn {


    /**
     * 这个方法将boolean基本类型值转换成了一个Boolean对象引用
     * @param b
     * @return
     */
    public static Boolean valueOf(boolean b) {
        return b ? Boolean.TRUE : Boolean.FALSE;
    }
}
