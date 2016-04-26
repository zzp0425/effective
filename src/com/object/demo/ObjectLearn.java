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

    public static void main(String[] args) {
        long sum = 0l;//用基本类型long,而不是Long，否则多创建2的31次方个Long实例
        for (long i = 0; i < Integer.MAX_VALUE; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
