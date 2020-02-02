package com.zhu.clouddemo.democonfigclient.decorator;

public class Tea implements Beverage{
    private int price = 10;
    @Override
    public int cost() {
        return this.price;
    }
}
