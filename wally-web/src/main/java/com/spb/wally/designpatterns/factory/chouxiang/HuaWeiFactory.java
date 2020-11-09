package com.spb.wally.designpatterns.factory.chouxiang;

/**
 * @description
 * @author: gaobh
 * @date: 2020/9/9 17:13
 * @version: v1.0
 */
public class HuaWeiFactory implements IProductFactory {
    @Override
    public IphoneProduct iphoneProduct() {
        return new HuaWeiPhone();
    }

    @Override
    public IRouterProduct routerProduct() {
        return new HuaWeiRouter();
    }
}
