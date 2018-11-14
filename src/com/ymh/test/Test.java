package com.ymh.test;

import com.ymh.animal.Shout;

import java.util.ServiceLoader;

/**
 * @author: ymh
 * @date: 2018/11/14
 * @description:
 **/
public class Test {

    public static void main(String[] args) {
        ServiceLoader<Shout> shapes=ServiceLoader.load(Shout.class);
        for(Shout s:shapes) {
            s.shout();
        }
    }
}
