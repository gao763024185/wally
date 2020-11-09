package com.spb.wally.designpatterns.factory.chouxiang;

/**
 * @description
 * @author: gaobh
 * @date: 2020/9/9 17:09
 * @version: v1.0
 */
public interface IProductFactory {
    //生产手机
    IphoneProduct iphoneProduct();
    //生产路由器
    IRouterProduct routerProduct();
}
