package com.gwc.masterplate.service;

/**
 * 继承CheckCar,实现audi的修车方式
 * @Author: 高维聪
 * @Date: 2017-12-21 16:51
 */
public class CheckAudi extends Checkcar{
    @Override
    protected void modify() {
        System.out.println("修的可是audi车啊");
    }
}
