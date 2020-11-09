package com.spb.wally.designpatterns.builder.demo1;

import lombok.Data;

/**
 * @description
 * @author: gaobh
 * @date: 2020/9/9 17:58
 * @version: v1.0
 */
@Data
public class Product {

    private String buildA = "地基";

    private String buildB = "水泥";

    private String buildC = "走线";

    private String buildD = "刷墙";

    @Override
    public String toString() {
        return "Product{" +
                "buildA='" + buildA + '\'' +
                ", buildB='" + buildB + '\'' +
                ", buildC='" + buildC + '\'' +
                ", buildD='" + buildD + '\'' +
                '}';
    }
}
