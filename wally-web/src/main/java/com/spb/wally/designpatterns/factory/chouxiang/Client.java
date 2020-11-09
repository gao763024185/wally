package com.spb.wally.designpatterns.factory.chouxiang;

/**
 * @description
 * @author: gaobh
 * @date: 2020/9/9 17:20
 * @version: v1.0
 */
public class Client {
    public static void main(String[] args){
        System.out.println("***********小米系列产品***************");
        XiaomiFactory xiaomiFactory = new XiaomiFactory();

        IphoneProduct iphoneProduct = xiaomiFactory.iphoneProduct();
        iphoneProduct.callup();
        iphoneProduct.sendSMS();

        IRouterProduct iRouterProduct = xiaomiFactory.routerProduct();
        iRouterProduct.openWifi();


        System.out.println("***********华为系列产品***************");
        HuaWeiFactory huaWeiFactory = new HuaWeiFactory();

        IphoneProduct product = huaWeiFactory.iphoneProduct();
        product.callup();
        product.sendSMS();

        IRouterProduct routerProduct = huaWeiFactory.routerProduct();
        routerProduct.openWifi();
    }
}
