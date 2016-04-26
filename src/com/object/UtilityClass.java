package com.object;

/**
 * Created by 周振平
 * on 2016/4/10 15:29
 * noninstantiable utility class
 * 不允许实例化的工具类
 */
public class UtilityClass {
    //suppress default constructor for noninstantiability
    //防止默认构造器被实例化
    private UtilityClass(){
        throw new AssertionError();
    }
}
