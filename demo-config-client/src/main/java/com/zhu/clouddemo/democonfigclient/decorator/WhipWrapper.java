package com.zhu.clouddemo.democonfigclient.decorator;

public class Whip implements Beverage{
    private int price = 10;
    @Override
    public int cost() {
        return this.price;
    }
}
