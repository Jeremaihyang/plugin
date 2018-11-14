package com.ymh.impl;

import com.ymh.animal.Shout;

/**
 * @author: ymh
 * @date: 2018/11/14
 * @description:
 **/
public class Dog implements Shout {
    @Override
    public void shout() {
        System.out.println("Dog shout...");
    }
}
