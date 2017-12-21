package com.gwc.masterplate.service;

/**
 * 汽车修理抽象类
 * @Author: 高维聪
 * @Date: 2017-12-21 16:40
 */
public abstract class Checkcar {
    //拆车,认为是不可改变的方法 对外无需暴漏
    protected final void openCar(){
        System.out.println("把车打开");
    }
    //保养,对于不同的车保养不同,用抽象方法
    protected abstract void modify();
    //装车,可以相同,可以不相同,
    protected void close(){
        System.out.println("把车装上");
    }

    /**
     * c车主不需要知道怎么修车,只需要把车拉到4s店,所以该方法对外暴漏,
     * 模版模式重点在于有效的限制了子类的行为
     */
    public void fourS(){
        openCar();
        modify();
        close();
    }
}
