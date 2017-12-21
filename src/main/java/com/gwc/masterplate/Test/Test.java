package com.gwc.masterplate.Test;

import com.gwc.masterplate.service.CheckAudi;
import com.gwc.masterplate.service.Checkcar;

/**
 * 测试 模版模式
 * @Author: 高维聪
 * @Date: 2017-12-21 16:54
 */
public class Test {
    public static void main(String[] args) {
        Checkcar cc = new CheckAudi();
        cc.fourS();
    }
}
